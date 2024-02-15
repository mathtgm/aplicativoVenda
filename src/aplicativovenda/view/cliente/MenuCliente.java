package aplicativovenda.view.cliente;

import aplicativovenda.controller.ClienteController;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import aplicativovenda.model.Cliente;

public class MenuCliente extends javax.swing.JInternalFrame {
    
    DefaultTableModel tableModel = new DefaultTableModel();

    public MenuCliente() {
        initComponents();
        initTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        identificacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        nome.setColumns(59);
        nome.setName("nomeCliente"); // NOI18N
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomelimitadorDeCaractere(evt);
            }
        });

        jLabel1.setText("Nome cliente");

        cod.setName(""); // NOI18N
        cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codKeyTyped(evt);
            }
        });

        jLabel2.setText("Código");

        identificacao.setColumns(13);
        identificacao.setName("identificacao"); // NOI18N
        identificacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identificacaocodKeyTyped(evt);
                identificacaolimitadorDeCaractere(evt);
            }
        });

        jLabel3.setText("CPF/CNPJ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(identificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaCliente);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(100, 90));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consulta.png"))); // NOI18N
        jMenu3.setToolTipText("Consultar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarCliente(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jMenu1.setToolTipText("Cadastrar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirCadastroCliente(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jMenu2.setToolTipText("Editar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirAlteracaoCliente(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarCliente

        limparTabelaCliente();
        ClienteController clienteController = new ClienteController();

        List<Cliente> listaCliente = clienteController.listarClientes();

        listaCliente = filtrarClientes(listaCliente);

        for (Cliente cliente : listaCliente) {

            tableModel.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getIdentificacao()
            });

        }
    }//GEN-LAST:event_consultarCliente

    private void abrirCadastroCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirCadastroCliente

        CadastroAlteracaoCliente cadastroAlteracaoCliente = new CadastroAlteracaoCliente(null);
        cadastroAlteracaoCliente.setTitle("Cadastro de cliente");
        getParent().add(cadastroAlteracaoCliente);
        cadastroAlteracaoCliente.setVisible(true);

    }//GEN-LAST:event_abrirCadastroCliente

    private void abrirAlteracaoCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirAlteracaoCliente
        
        ClienteController clienteController = new ClienteController();
        
        Long idCliente = Long.parseLong(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
        Cliente cliente = clienteController.consultarCliente(idCliente);
        CadastroAlteracaoCliente cadastroAlteracaoCliente = new CadastroAlteracaoCliente(cliente);
        getParent().add(cadastroAlteracaoCliente);
        cadastroAlteracaoCliente.setTitle("Alteração de cliente");
        cadastroAlteracaoCliente.setVisible(true);


    }//GEN-LAST:event_abrirAlteracaoCliente

    private void nomelimitadorDeCaractere(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomelimitadorDeCaractere

        JTextField component = (JTextField) evt.getComponent();

        if (component.getText().length() > component.getColumns()) {
            evt.consume();
        }
    }//GEN-LAST:event_nomelimitadorDeCaractere

    private void codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_codKeyTyped

    private void identificacaocodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacaocodKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_identificacaocodKeyTyped

    private void identificacaolimitadorDeCaractere(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacaolimitadorDeCaractere

        JTextField component = (JTextField) evt.getComponent();

        if (component.getText().length() > component.getColumns()) {
            evt.consume();
        }
    }//GEN-LAST:event_identificacaolimitadorDeCaractere

    public void initTabela() {
        tabelaCliente.setModel(tableModel);
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome");
        tableModel.addColumn("CPF/CNPJ");
    }

    private void limparTabelaCliente() {

        tableModel.setRowCount(0);

    }

    public List<Cliente> filtrarClientes(List<Cliente> listaClientes) {

        // Filtra por ID
        listaClientes = listaClientes.stream().filter(cliente -> {

            if (cod.getText().isEmpty()) {
                return true;
            } else if (cliente.getId().equals(Long.parseLong(cod.getText()))) {
                return true;
            }

            return false;

        }).toList();

        // Filtra por nome/razao social
        listaClientes = listaClientes.stream().filter(cliente -> {

            if (nome.getText().isBlank()) {
                return true;
            } else if (cliente.getNome().contains(nome.getText())) {
                return true;
            }

            return false;

        }).toList();

        //Filtr por CPF/CNPJ
        listaClientes = listaClientes.stream().filter(cliente -> {
            if (identificacao.getText().isEmpty()) {
                return true;
            } else if (cliente.getIdentificacao().contains(identificacao.getText())) {
                return true;
            }

            return false;

        }).toList();

        return listaClientes;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod;
    private javax.swing.JTextField identificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTable tabelaCliente;
    // End of variables declaration//GEN-END:variables
}
