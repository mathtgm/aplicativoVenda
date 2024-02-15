package aplicativovenda.controller;

import aplicativovenda.dto.AlteracaoDadosVendaDTO;
import aplicativovenda.dto.CadastroProdutoDTO;
import aplicativovenda.dto.CadastroVendaDTO;
import aplicativovenda.dto.RelatorioConsolidadoDTO;
import aplicativovenda.model.Venda;
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

public class VendaController {
    
    String url = "http://localhost:8080/vendas";
    Gson gson;
    HttpClient httpClient;
    HttpRequest httpRequest;
    
    public VendaController() {
        this.gson = new Gson();
        this.httpClient = HttpClient.newHttpClient();
    }
    
    public void finalizarVenda(Long idVenda) {
        
        url = url.concat("/finalizar/" + idVenda);
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .POST(HttpRequest.BodyPublishers.ofString(""))
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            
            if(httpResponse.statusCode() == 207) {
                JOptionPane.showMessageDialog(new JFrame(), "Baixa realizada parcialmente, alguns produtos estão com abaixo do solicitado");
            } else if(httpResponse.statusCode() == 200){ 
                JOptionPane.showMessageDialog(new JFrame(), "Venda finalizada!");
            }
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
        }
        
    }
    
    public List<Venda> consultarVendas() {
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), new TypeToken<ArrayList<Venda>>() {
            }.getType());
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
    }
    
    public Venda atualizarVenda(AlteracaoDadosVendaDTO alteracaoDadosVendaDTO) {
        
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .PUT(HttpRequest.BodyPublishers.ofString(gson.toJson(alteracaoDadosVendaDTO)))
                    .header("Content-Type", "application/json")
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), Venda.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
        
    }
    
    public Venda consultarVenda(Long idVenda) {
        
        url = url.concat("/" + idVenda);
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), Venda.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
        
    }
    
    public List<RelatorioConsolidadoDTO> relatorioConsolidacao() {
        
        url = url.concat("/relatorioConsolidacao");
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), new TypeToken<ArrayList<RelatorioConsolidadoDTO>>() {
            }.getType());
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
    }
    
    public Venda cadastrarVenda(CadastroVendaDTO cadastroProdutoDTO) {
        
        try {
            httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(cadastroProdutoDTO)))
                    .header("Content-Type", "application/json")
                    .build();

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(httpResponse.body(), Venda.class);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Conexão com o banco de dados perdida");
            return null;
        }
        
    }
    
    
    
}
