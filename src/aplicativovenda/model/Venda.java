package aplicativovenda.model;

import java.util.List;

public class Venda {
    
    private Long id;
    
    private Cliente cliente;
    
    private boolean finalizado;
    
    private List<VendaProduto> listaProdutos;

    public Venda() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public List<VendaProduto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<VendaProduto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    
}
