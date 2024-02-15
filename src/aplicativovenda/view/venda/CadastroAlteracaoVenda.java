package aplicativovenda.view.venda;

import aplicativovenda.controller.ClienteController;
import aplicativovenda.controller.VendaController;
import aplicativovenda.dto.AlteracaoDadosVendaDTO;
import aplicativovenda.dto.CadastroProdutoDTO;
import aplicativovenda.dto.CadastroVendaDTO;
import aplicativovenda.model.Cliente;
import aplicativovenda.model.Venda;
import aplicativovenda.model.VendaProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroAlteracaoVenda extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultComboBoxModel<Cliente> comboBoxModel = new DefaultComboBoxModel<>();
    List<CadastroProdutoDTO> listaProdutosAdicionados = new ArrayList<>();
    List<Long> listaProdutosRemovidos = new ArrayList<>();
    Venda venda;

    public CadastroAlteracaoVenda(Venda venda) {
        this.venda = venda;
        initComponents();
        initListaCliente();
        initTabela();
        initCampos();
    }

    public void initTabela() {

        tabelaProdutos.setModel(tableModel);
        tableModel.addColumn("Codigo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Unidade");
        tableModel.addColumn("");
        
       tabelaProdutos.getColumnModel().getColumn(5).setWidth(0);
       tabelaProdutos.getColumnModel().getColumn(5).setMaxWidth(0);
       tabelaProdutos.getColumnModel().getColumn(5).setMinWidth(0);

    }

    public void initCampos() {

        if (venda != null) {
            preencherTabelaProduto();
            ajustarCliente();
            desbloquearBotao();
        }

    }

    public void desbloquearBotao() {

        finalizarVenda.setEnabled(true);

    }

    public void ajustarCliente() {

        comboBoxModel.setSelectedItem(venda.getCliente());

    }

    public void preencherTabelaProduto() {

        tableModel.setRowCount(0);

        for (VendaProduto vendaProduto : venda.getListaProdutos()) {

            tableModel.addRow(new Object[]{
                vendaProduto.getIdProduto(),
                vendaProduto.getDescricao(),
                vendaProduto.getQuantidadeVenda(),
                "%.2f".formatted(vendaProduto.getPreco()),
                vendaProduto.getUnidade(),
                vendaProduto.getId()
            });

        }

    }

    public void initListaCliente() {

        ClienteController clienteController = new ClienteController();
        List<Cliente> listaCliente = clienteController.listarClientes();

        for (Cliente cliente : listaCliente) {

            this.comboBoxModel.addElement(cliente);

        }

        comboBoxCliente.setModel(comboBoxModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        comboBoxCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        finalizarVenda = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta venda");

        jLabel1.setText("Cliente");

        tabelaProdutos.setToolTipText("");
        jScrollPane1.setViewportView(tabelaProdutos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerProduto(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarProduto(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jMenu1.setToolTipText("Salvar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvar(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        finalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/check.png"))); // NOI18N
        finalizarVenda.setToolTipText("Finalizar");
        finalizarVenda.setEnabled(false);
        finalizarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizar(evt);
            }
        });
        jMenuBar1.add(finalizarVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarProduto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarProduto

        CadastroProdutoDTO cadastroProduto = new CadastroProdutoDTO();
        CadastroProdutoVenda cadastroProdutoVenda = new CadastroProdutoVenda(this.tabelaProdutos, this.listaProdutosAdicionados);
        getParent().add(cadastroProdutoVenda);
        cadastroProdutoVenda.setVisible(true);

    }//GEN-LAST:event_adicionarProduto

    private void salvar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar

        Cliente cliente = (Cliente) comboBoxModel.getSelectedItem();
        VendaController vendaController = new VendaController();

        if (venda == null) {

            CadastroVendaDTO cadastroVendaDTO = new CadastroVendaDTO(listaProdutosAdicionados, cliente.getId());
            venda = vendaController.cadastrarVenda(cadastroVendaDTO);

            JOptionPane.showMessageDialog(new JFrame(), "Venda cadastrada com sucesso");

        } else if (!venda.isFinalizado()) {

            AlteracaoDadosVendaDTO alteracaoDadosVendaDTO = new AlteracaoDadosVendaDTO(
                    listaProdutosRemovidos,
                    listaProdutosAdicionados,
                    cliente.getId(),
                    venda.getId()
            );

            venda = vendaController.atualizarVenda(alteracaoDadosVendaDTO);

            JOptionPane.showMessageDialog(new JFrame(), "Venda alterada com sucesso");

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "A venda já foi finalizada, você não pode editar");
        }

        initCampos();

    }//GEN-LAST:event_salvar

    private void removerProduto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerProduto
        
        if(venda != null ) {
            listaProdutosRemovidos.add(Long.parseLong(tableModel.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString()));
        } else if(listaProdutosAdicionados.size() > 0) {
            listaProdutosAdicionados.remove(tabelaProdutos.getSelectedRow());
        }
        
        tableModel.removeRow(tabelaProdutos.getSelectedRow());

    }//GEN-LAST:event_removerProduto

    private void finalizar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizar

        VendaController vendaController = new VendaController();
        vendaController.finalizarVenda(venda.getId());


    }//GEN-LAST:event_finalizar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> comboBoxCliente;
    private javax.swing.JMenu finalizarVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables

}
