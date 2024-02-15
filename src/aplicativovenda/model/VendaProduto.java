package aplicativovenda.model;

public class VendaProduto {

    private Long id;

    private Long idProduto;
    private String descricao;
    private float preco;
    private String unidade;
    private float quantidadeVenda;
    private boolean finalizado;

    public VendaProduto() {
    }
    
    public float getValorTotal() {
        
        return quantidadeVenda * preco;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public float getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(float quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
}
