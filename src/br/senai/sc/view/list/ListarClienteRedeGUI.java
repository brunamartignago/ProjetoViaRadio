package br.senai.sc.view.list;
import br.senai.sc.controller.ClienteRedeController;
import br.senai.sc.model.negocio.ClienteRede;
import br.senai.sc.view.inserir.InserirClienteRedeGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class ListarClienteRedeGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarClienteRedeGUI() {
        initComponents();
        criaTabela();
        scrollClienteRede.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirClienteRede = new javax.swing.JButton();
        btEditarClienteRede = new javax.swing.JButton();
        btExcluirClienteRede = new javax.swing.JButton();
        txPesquisaClienteRede = new javax.swing.JTextField();
        scrollClienteRede = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente Listagem de Cliente Redes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btInserirClienteRede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirClienteRede.setToolTipText("Inserir");
        btInserirClienteRede.setOpaque(false);
        btInserirClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClienteRedeActionPerformed(evt);
            }
        });

        btEditarClienteRede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarClienteRede.setToolTipText("Editar");
        btEditarClienteRede.setOpaque(false);
        btEditarClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteRedeActionPerformed(evt);
            }
        });

        btExcluirClienteRede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirClienteRede.setToolTipText("Excluir");
        btExcluirClienteRede.setOpaque(false);
        btExcluirClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteRedeActionPerformed(evt);
            }
        });

        txPesquisaClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaClienteRedeActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollClienteRede.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btInserirClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btEditarClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btExcluirClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaClienteRede)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollClienteRede)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btInserirClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btExcluirClienteRede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(txPesquisaClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollClienteRede, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
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

    private void btInserirClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteRedeActionPerformed
        InserirClienteRedeGUI icrg = new InserirClienteRedeGUI(modelo);
        icrg.setVisible(true);
    }//GEN-LAST:event_btInserirClienteRedeActionPerformed

    private void btEditarClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClienteRedeActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoClienteRede = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteRedeController crc = new ClienteRedeController();
            InserirClienteRedeGUI icrg = new InserirClienteRedeGUI(modelo, linhaSelecionada, CodigoClienteRede);
            icrg.setVisible(true);
        }

    }//GEN-LAST:event_btEditarClienteRedeActionPerformed

    private void btExcluirClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteRedeActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            ClienteRedeController crc = new ClienteRedeController();
            if (crc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }

        }
    }//GEN-LAST:event_btExcluirClienteRedeActionPerformed

    private void txPesquisaClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaClienteRedeActionPerformed

        ClienteRedeController crc = new ClienteRedeController();
        modelo.setNumRows(0);

        for (ClienteRede cr : crc.pesquisaClienteRede(txPesquisaClienteRede.getText())){

            modelo.addRow(new Object[]{cr.getCodigo(), cr.getDataInicio(), cr.getSequencia()});
        }
        
    }//GEN-LAST:event_txPesquisaClienteRedeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarClienteRede;
    private javax.swing.JButton btExcluirClienteRede;
    private javax.swing.JButton btInserirClienteRede;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollClienteRede;
    private javax.swing.JTextField txPesquisaClienteRede;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {
        
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Cliente");
        modelo.addColumn("Data Início");
        modelo.addColumn("Situação Rede");
        preecherTabela();
    }

    private void preecherTabela() {
        
        ClienteRedeController crc = new ClienteRedeController();
        for (ClienteRede cre : crc.listarClienteRede()) {

            modelo.addRow(new Object[]{cre.getCodigo(),  cre.getDataInicio(),
            cre.getSequencia()});
            
        }
    }
    
}
