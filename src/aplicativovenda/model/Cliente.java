package aplicativovenda.model;

public class Cliente {
    
    private Long id;
    private String nome;
    private String identificacao;
    private String razaoSocial;

    public Cliente() {}   
    
    public Cliente(String nome, String identificacao) {
        this.nome = nome;
        this.razaoSocial = identificacao;
    }

    public Cliente(String nome, String identificacao, String razaoSocial) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.razaoSocial = razaoSocial;
    }   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return nome;
    }

    

    
}
