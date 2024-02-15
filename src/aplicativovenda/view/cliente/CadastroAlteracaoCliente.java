package aplicativovenda.view.cliente;

import aplicativovenda.controller.ClienteController;
import javax.swing.JTextField;
import aplicativovenda.model.Cliente;

public class CadastroAlteracaoCliente extends javax.swing.JInternalFrame {

    ClienteController clienteController;
    Cliente cliente;
    public CadastroAlteracaoCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        initController();
        preencherDados();
    }

    public void initController() {
        clienteController = new ClienteController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxTipoPessoa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labelRazaoSocial = new javax.swing.JLabel();
        textRazaoSocial = new javax.swing.JTextField();
        labelTipoPessoa = new javax.swing.JLabel();
        textIdentificacao = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        textNome.setColumns(60);
        textNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limitador(evt);
            }
        });

        jLabel1.setText("Nome");

        comboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jurídica", "Fisica" }));
        comboBoxTipoPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                alterarLayout(evt);
            }
        });

        jLabel2.setText("Tipo pessoa");

        labelRazaoSocial.setText("Razão social");

        textRazaoSocial.setColumns(60);
        textRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limitador(evt);
            }
        });

        labelTipoPessoa.setText("CNPJ");

        textIdentificacao.setColumns(13);
        textIdentificacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limitador(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelRazaoSocial)
                    .addComponent(textRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(comboBoxTipoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textIdentificacao))
                    .addComponent(labelTipoPessoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelTipoPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRazaoSocial)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textRazaoSocial)
                    .addComponent(comboBoxTipoPessoa))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jMenu1.setToolTipText("Salvar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarCliente(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherDados() {
        
        if (cliente != null) {

            textNome.setText(cliente.getNome());
            textIdentificacao.setText(cliente.getIdentificacao());

            if (cliente.getRazaoSocial() != null) {
                
                comboBoxTipoPessoa.setSelectedIndex(0);
                textRazaoSocial.setText(cliente.getRazaoSocial());

            }
        }

    }

    private void limitadorDeCaractere(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limitadorDeCaractere

        JTextField component = (JTextField) evt.getComponent();

        if (component.getText().length() > component.getColumns()) {
            evt.consume();
        }
    }//GEN-LAST:event_limitadorDeCaractere

    private void alterarLayout(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_alterarLayout

        if (comboBoxTipoPessoa.getSelectedItem() == "Fisica") {
            
            textRazaoSocial.setEditable(false);
            labelTipoPessoa.setText("CPF");

        } else {

            textRazaoSocial.setEditable(true);
            labelTipoPessoa.setText("CNPJ");

        }


    }//GEN-LAST:event_alterarLayout

    private void salvarCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarCliente

        if (cliente == null) {

            cliente = new Cliente();

        }

        cliente.setNome(textNome.getText());
        cliente.setIdentificacao(textIdentificacao.getText());

        if (comboBoxTipoPessoa.getSelectedItem() == "Jurídica") {

            cliente.setRazaoSocial(textRazaoSocial.getText());

        }

        cliente = clienteController.cadastrarAlterarCliente(cliente);

    }//GEN-LAST:event_salvarCliente

    private void limitador(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limitador
        JTextField component = (JTextField) evt.getComponent();

        if (component.getText().length() > component.getColumns()) {
            evt.consume();
        }
    }//GEN-LAST:event_limitador


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxTipoPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelRazaoSocial;
    private javax.swing.JLabel labelTipoPessoa;
    private javax.swing.JTextField textIdentificacao;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRazaoSocial;
    // End of variables declaration//GEN-END:variables

}
