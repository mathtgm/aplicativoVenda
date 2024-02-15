package aplicativovenda.view.venda;

import aplicativovenda.controller.ProdutoController;
import aplicativovenda.dto.CadastroProdutoDTO;
import aplicativovenda.model.Produto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastroProdutoVenda extends javax.swing.JInternalFrame {

    DefaultComboBoxModel<Produto> comboBoxModel = new DefaultComboBoxModel<>();
    JTable tabelaCliente;
    List<CadastroProdutoDTO> listaCadastroProdutoVenda;
    
    public CadastroProdutoVenda(JTable tabelaCliente, List<CadastroProdutoDTO> listaCadastroProdutoVenda) {
        this.tabelaCliente = tabelaCliente;
        this.listaCadastroProdutoVenda = listaCadastroProdutoVenda;
        initComponents();
        initListProduto();
    }
    
    public void initListProduto() {
        
        ProdutoController produtoController = new ProdutoController();
        List<Produto> listaProduto = produtoController.listarProdutos();

        for (Produto produto : listaProduto) {

            comboBoxModel.addElement(produto);

        }

        this.listaProduto.setModel(comboBoxModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        listaProduto = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar produto");
        setToolTipText("");

        jLabel2.setText("Descrição produto");

        jLabel3.setText("Quantidade");

        textQuantidade.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarDados(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarDados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarDados
        
        CadastroProdutoDTO cadastroProdutoDTO = new CadastroProdutoDTO();
        Produto produto = (Produto) comboBoxModel.getSelectedItem();
        
        cadastroProdutoDTO.setIdProduto(produto.getId());
        cadastroProdutoDTO.setDescricao(produto.getDescricao());
        cadastroProdutoDTO.setPreco(produto.getPreco());
        cadastroProdutoDTO.setUnidade(produto.getUnidade());
        cadastroProdutoDTO.setQuantidade(Float.parseFloat(textQuantidade.getText()));
        
        listaCadastroProdutoVenda.add(cadastroProdutoDTO);
        
        DefaultTableModel tableModel = (DefaultTableModel) tabelaCliente.getModel();
        tableModel.addRow(new Object[]{
            cadastroProdutoDTO.getIdProduto(),
            cadastroProdutoDTO.getDescricao(),
            cadastroProdutoDTO.getQuantidade(),
            "R$ %.2f".formatted(cadastroProdutoDTO.getPreco()),
            cadastroProdutoDTO.getUnidade(),
        });
        
        
    }//GEN-LAST:event_salvarDados

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        
        dispose();

    }//GEN-LAST:event_cancelar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<Produto> listaProduto;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}
