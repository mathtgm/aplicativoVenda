package aplicativovenda.dto;

import java.util.List;

public record AlteracaoDadosVendaDTO(List<Long> produtosRemovidos, List<CadastroProdutoDTO> produtosAdicionados, Long idCliente, Long idVenda) {


}
