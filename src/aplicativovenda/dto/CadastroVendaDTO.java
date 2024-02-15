package aplicativovenda.dto;

import java.util.List;

public record CadastroVendaDTO(List<CadastroProdutoDTO> listaProdutos, Long idCliente) {
    
}
