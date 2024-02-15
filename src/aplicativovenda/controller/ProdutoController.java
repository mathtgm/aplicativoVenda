package aplicativovenda.controller;

import aplicativovenda.model.Cliente;
import aplicativovenda.model.Produto;
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

public class ProdutoController {

    String url = "http://localhost:3000/produtos";
    Gson gson;
    HttpClient httpClient;
    HttpRequest httpRequest;

    public ProdutoController() {
        this.gson = new Gson();
        this.httpClient = HttpClient.newHttpClient();
    }

    public List<Produto> listarProdutos() {

        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), new TypeToken<ArrayList<Produto>>() {
            }.getType());
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }

    }

    public Produto consultaProduto(Long idProduto) {

        url = url.concat("/" + idProduto);

        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), Produto.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
        
    }
}
