package br.senai.sc.view.list;
import br.senai.sc.controller.ClienteRedeFaturaController;
import br.senai.sc.model.negocio.ClienteRedeFatura;
import br.senai.sc.view.inserir.InserirClienteRedeFaturaGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class ListarClienteRedeFaturaGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarClienteRedeFaturaGUI() {
        initComponents();
        criaTabela();
        scrollClienteRedeFatura.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSalvarClienteRedeFatura = new javax.swing.JButton();
        btEditarClienteRedeFatura = new javax.swing.JButton();
        btExcluirClienteRedeFatura = new javax.swing.JButton();
        txPesquisaClienteRedeFatura = new javax.swing.JTextField();
        scrollClienteRedeFatura = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Cliente Rede Fatura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btSalvarClienteRedeFatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btSalvarClienteRedeFatura.setToolTipText("Inserir");
        btSalvarClienteRedeFatura.setOpaque(false);
        btSalvarClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteRedeFaturaActionPerformed(evt);
            }
        });

        btEditarClienteRedeFatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarClienteRedeFatura.setToolTipText("Editar");
        btEditarClienteRedeFatura.setOpaque(false);
        btEditarClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteRedeFaturaActionPerformed(evt);
            }
        });

        btExcluirClienteRedeFatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirClienteRedeFatura.setToolTipText("Excluir");
        btExcluirClienteRedeFatura.setOpaque(false);
        btExcluirClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteRedeFaturaActionPerformed(evt);
            }
        });

        txPesquisaClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaClienteRedeFaturaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollClienteRedeFatura.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btSalvarClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btEditarClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btExcluirClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaClienteRedeFatura)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollClienteRedeFatura)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSalvarClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btExcluirClienteRedeFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(txPesquisaClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollClienteRedeFatura, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
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

    private void btSalvarClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarClienteRedeFaturaActionPerformed

        InserirClienteRedeFaturaGUI icrfg = new InserirClienteRedeFaturaGUI(modelo);
        icrfg.setVisible(true);
    }//GEN-LAST:event_btSalvarClienteRedeFaturaActionPerformed

    private void btEditarClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClienteRedeFaturaActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoClienteRedeFatura = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteRedeFaturaController crfc = new ClienteRedeFaturaController();
            InserirClienteRedeFaturaGUI icrfg = new InserirClienteRedeFaturaGUI(modelo, linhaSelecionada, CodigoClienteRedeFatura);
            icrfg.setVisible(true);
        }
    }//GEN-LAST:event_btEditarClienteRedeFaturaActionPerformed

    private void btExcluirClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteRedeFaturaActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteRedeFaturaController crfc = new ClienteRedeFaturaController();
            if (crfc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirClienteRedeFaturaActionPerformed

    private void txPesquisaClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaClienteRedeFaturaActionPerformed

        ClienteRedeFaturaController crfc = new ClienteRedeFaturaController();
        modelo.setNumRows(0);

        for (ClienteRedeFatura crf : crfc.pesquisaClienteRedeFatura(txPesquisaClienteRedeFatura.getText())) {

            modelo.addRow(new Object[]{crf.getCodigo()});
        }
    }//GEN-LAST:event_txPesquisaClienteRedeFaturaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarClienteRedeFatura;
    private javax.swing.JButton btExcluirClienteRedeFatura;
    private javax.swing.JButton btSalvarClienteRedeFatura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollClienteRedeFatura;
    private javax.swing.JTextField txPesquisaClienteRedeFatura;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        preecherTabela();
    }

    private void preecherTabela() {

        ClienteRedeFaturaController crfc = new ClienteRedeFaturaController();
        for (ClienteRedeFatura crf : crfc.listarClienteRedeFatura()) {

            modelo.addRow(new Object[]{crf.getCodigo()});

        }
    
    }
}
