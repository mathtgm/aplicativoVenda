package aplicativovenda.dto;

public class RelatorioConsolidadoDTO {

    private Long idVenda;
    private String nomeCliente;
    private double totalVenda;
    private boolean status;

    public RelatorioConsolidadoDTO() {
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public boolean isStatus() {
        return status;
    }

}
