package aplicativovenda.dto;

import aplicativovenda.model.Produto;

public class CadastroProdutoDTO {
    
    private Long idProduto;
    
    private float quantidade;
    
    private float preco;
    
    private String descricao;
    
    private String unidade;

    public CadastroProdutoDTO() {
    }

    public CadastroProdutoDTO(Long idProduto, float quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
    
}
