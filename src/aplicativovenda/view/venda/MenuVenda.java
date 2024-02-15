package aplicativovenda.view.venda;

import aplicativovenda.controller.VendaController;
import aplicativovenda.dto.RelatorioConsolidadoDTO;
import aplicativovenda.model.Venda;
import aplicativovenda.model.VendaProduto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MenuVenda extends javax.swing.JInternalFrame {
    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    public MenuVenda() {
        initComponents();
        initTabela();
    }
    
    public void initTabela() {
        tabelaVenda.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vendaDetalhada = new javax.swing.JRadioButton();
        vendaConsolidada = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jLabel1.setText("Código");

        jLabel2.setText("Nome cliente");

        filtro.add(vendaDetalhada);
        vendaDetalhada.setSelected(true);
        vendaDetalhada.setText("Detalhado");

        filtro.add(vendaConsolidada);
        vendaConsolidada.setText("Consolidado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendaDetalhada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendaConsolidada)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendaDetalhada)
                    .addComponent(vendaConsolidada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaVenda);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consulta.png"))); // NOI18N
        jMenu1.setToolTipText("Consultar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaVendas(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jMenu2.setToolTipText("Cadastrar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirCadastroVenda(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadastroVenda(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirCadastroVenda
        // TODO add your handling code here:
        CadastroAlteracaoVenda cadastroAlteracaoVenda = new CadastroAlteracaoVenda(null);
        getParent().add(cadastroAlteracaoVenda);
        cadastroAlteracaoVenda.setVisible(true);
        cadastroAlteracaoVenda.setTitle("Cadastro de produto");
        
        
    }//GEN-LAST:event_abrirCadastroVenda

    private void consultaVendas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaVendas
        
        if(vendaDetalhada.isSelected()) {
            vendasDetalhada();
        } else {
           vendasConsolidadas();
        }
        
        
    }//GEN-LAST:event_consultaVendas

    private void editar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar

        VendaController vendaController = new VendaController();
        Long idVenda = Long.parseLong(tabelaVenda.getValueAt(tabelaVenda.getSelectedRow(), 0).toString());
        Venda venda = vendaController.consultarVenda(idVenda);
        
        CadastroAlteracaoVenda cadastroAlteracaoVenda = new CadastroAlteracaoVenda(venda);
        getParent().add(cadastroAlteracaoVenda);
        cadastroAlteracaoVenda.setVisible(true);
        cadastroAlteracaoVenda.setTitle("Alteração de produto");
        
        
        
    }//GEN-LAST:event_editar
    
    public void vendasDetalhada() {
        
        limparTabelaVenda();
        
        tableModel.addColumn("Código venda");
        tableModel.addColumn("Cliente");
        tableModel.addColumn("Produto");
        tableModel.addColumn("Preço Unid");
        tableModel.addColumn("Valor total");
        tableModel.addColumn("Status venda");
        
        VendaController vendaController = new VendaController();
        
        List<Venda> listaVendas = vendaController.consultarVendas();
        
        listaVendas = filtrarVendas(listaVendas);
        
        for (Venda venda : listaVendas) {
            
            for(VendaProduto vendaProduto : venda.getListaProdutos()) {
            
                float valorTotalProduto = vendaProduto.getPreco() * vendaProduto.getQuantidadeVenda();
                
                tableModel.addRow(new Object[]{
                venda.getId(),
                venda.getCliente().getNome(),
                vendaProduto.getDescricao(),
                "R$ %.2f".formatted(vendaProduto.getPreco()),
                "R$ %.2f".formatted(valorTotalProduto),
                venda.isFinalizado() ? "Finalizado" : "Não Finalizado"
                        
            });
                
            }
            
            
        }
        
    }
    
    public void vendasConsolidadas() {
        
        limparTabelaVenda();
        
        VendaController vendaController = new VendaController();
        List<RelatorioConsolidadoDTO> listaVendasConsolidadas = vendaController.relatorioConsolidacao();
        
        listaVendasConsolidadas = filtrarVendasConsolidadas(listaVendasConsolidadas);
   
        tableModel.addColumn("Código venda");
        tableModel.addColumn("Cliente");
        tableModel.addColumn("Total venda");
        tableModel.addColumn("Status venda");

        for (RelatorioConsolidadoDTO relatorioConsolidadoDTO : listaVendasConsolidadas) {
            
            tableModel.addRow(new Object[]{
                relatorioConsolidadoDTO.getIdVenda(),
                relatorioConsolidadoDTO.getNomeCliente(),
                "R$ %.2f".formatted(relatorioConsolidadoDTO.getTotalVenda()),
                relatorioConsolidadoDTO.isStatus() ? "Finalizado" : "Não finalizado"      
            });

        }
        
    }
    
    public List<Venda> filtrarVendas(List<Venda> listaVendas) {
        
        listaVendas = listaVendas.stream().filter(venda -> {
            if (textCodigo.getText().isBlank()) {
                return true;
            } else if (venda.getId().equals(Long.parseLong(textCodigo.getText()))) {
                return true;                
            }
            
            return false;
            
        }).toList();
        
        listaVendas = listaVendas.stream().filter(venda -> {
            if (textCliente.getText().isBlank()) {
                return true;
            } else if (venda.getCliente().getNome().contains(textCliente.getText())) {
                return true;                
            }
            
            return false;
            
        }).toList();
        
        return listaVendas;
        
    }
    
    public List<RelatorioConsolidadoDTO> filtrarVendasConsolidadas(List<RelatorioConsolidadoDTO> listaVendas) {
        
        listaVendas = listaVendas.stream().filter(venda -> {
            if (textCodigo.getText().isBlank()) {
                return true;
            } else if (venda.getIdVenda().equals(Long.parseLong(textCodigo.getText()))) {
                return true;                
            }
            
            return false;
            
        }).toList();
        
        listaVendas = listaVendas.stream().filter(venda -> {
            if (textCliente.getText().isBlank()) {
                return true;
            } else if (venda.getNomeCliente().contains(textCliente.getText())) {
                return true;                
            }
            
            return false;
            
        }).toList();
        
        return listaVendas;
        
    }
    
    public void limparTabelaVenda() {
        
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        
    }
    
    private float getTotalVenda(Venda venda) {
        
        float totalVenda = 0;
        
        for (VendaProduto produto : venda.getListaProdutos()) {
            
            totalVenda += produto.getValorTotal();
            
        }
        
        return totalVenda;
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JRadioButton vendaConsolidada;
    private javax.swing.JRadioButton vendaDetalhada;
    // End of variables declaration//GEN-END:variables
}
