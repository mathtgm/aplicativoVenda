package aplicativovenda.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import aplicativovenda.model.Cliente;

public class ClienteController {

    String url = "http://localhost:8080/clientes";
    Gson gson;
    HttpClient httpClient;
    HttpRequest httpRequest;
    
    public ClienteController() {
        this.gson = new Gson();
        this.httpClient = HttpClient.newHttpClient();
    }
    
    public List<Cliente> listarClientes() {
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), new TypeToken<ArrayList<Cliente>>() {
            }.getType());
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }

    }

    public Cliente consultarCliente(Long idCliente) {

        try {
            url = url.concat("/" + idCliente);
            

            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), Cliente.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
    }
    
    public Cliente cadastrarAlterarCliente(Cliente cliente) {
        
        if(cliente.getId() == null) {
            
            url = url.concat("/cadastrar");
            
        }
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(cliente)))
                    .header("Content-Type", "application/json")
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            
            if(httpResponse.statusCode() == 200) {
                JOptionPane.showMessageDialog(new JFrame(), "Cliente cadastrado/alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Erro ao cadastrar/alterar o cliente ");
            }
            
            return gson.fromJson(httpResponse.body(), Cliente.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
        
    }

}
