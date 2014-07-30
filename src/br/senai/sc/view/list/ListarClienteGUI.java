package br.senai.sc.view.list;
import br.senai.sc.controller.ClienteController;
import br.senai.sc.model.negocio.Cliente;
import br.senai.sc.view.inserir.InserirClienteGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// Variables declaration - do not modify                     
// Variables declaration - do not modify                     
/**
 *
 * @author Bruna
 */
public class ListarClienteGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarClienteGUI() {
        initComponents();
        criaTabela();
        scrollCliente.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirCliente = new javax.swing.JButton();
        btEditarCliente = new javax.swing.JButton();
        btExcluirCliente = new javax.swing.JButton();
        txPesquisaCliente = new javax.swing.JTextField();
        scrollCliente = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btInserirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirCliente.setToolTipText("Inserir");
        btInserirCliente.setOpaque(false);
        btInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClienteActionPerformed(evt);
            }
        });

        btEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarCliente.setToolTipText("Editar");
        btEditarCliente.setOpaque(false);
        btEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteActionPerformed(evt);
            }
        });

        btExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirCliente.setToolTipText("Excluir");
        btExcluirCliente.setOpaque(false);
        btExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteActionPerformed(evt);
            }
        });

        txPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaClienteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollCliente.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaCliente)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollCliente)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btExcluirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(txPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteActionPerformed
        InserirClienteGUI iclg = new InserirClienteGUI(modelo);
        iclg.setVisible(true);

    }//GEN-LAST:event_btInserirClienteActionPerformed

    private void btEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClienteActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoCliente = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteController clic = new ClienteController();
            InserirClienteGUI iclg = new InserirClienteGUI(modelo, linhaSelecionada, CodigoCliente);
            iclg.setVisible(true);

        }

    }//GEN-LAST:event_btEditarClienteActionPerformed

    private void btExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteController clic = new ClienteController();
            if (clic.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirClienteActionPerformed

    private void txPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaClienteActionPerformed

        ClienteController clic = new ClienteController();
        modelo.setNumRows(0);

        for (Cliente c: clic.pesquisaCliente(txPesquisaCliente.getText())) {

            modelo.addRow(new Object[]{c.getCodigo(), c.getNome()});

        }

    }//GEN-LAST:event_txPesquisaClienteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarCliente;
    private javax.swing.JButton btExcluirCliente;
    private javax.swing.JButton btInserirCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollCliente;
    private javax.swing.JTextField txPesquisaCliente;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Email");
        preecherTabela();
    }

    private void preecherTabela() {
        
         ClienteController clic = new ClienteController();
        for (Cliente c : clic.listarCliente()) {

            modelo.addRow(new Object[]{c.getCodigo(), c.getNome(),c.getCpf(),c.getEmail()});
            
        }
    }
}