package br.senai.sc.view.list;
import br.senai.sc.controller.RecebimentoController;
import br.senai.sc.model.negocio.Recebimento;
import br.senai.sc.view.inserir.InserirRecebimentoGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class ListarRecebimentoGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarRecebimentoGUI() {
        initComponents();
        criaTabela();
        scrollRecebimento.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirRecebimento = new javax.swing.JButton();
        btEditarRecebimento = new javax.swing.JButton();
        btExcluirRecebimento = new javax.swing.JButton();
        txPesquisaRecebimento = new javax.swing.JTextField();
        scrollRecebimento = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Recebimentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btInserirRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirRecebimento.setToolTipText("Inserir");
        btInserirRecebimento.setOpaque(false);
        btInserirRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirRecebimentoActionPerformed(evt);
            }
        });

        btEditarRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarRecebimento.setToolTipText("Editar");
        btEditarRecebimento.setOpaque(false);
        btEditarRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRecebimentoActionPerformed(evt);
            }
        });

        btExcluirRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirRecebimento.setToolTipText("Excluir");
        btExcluirRecebimento.setOpaque(false);
        btExcluirRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRecebimentoActionPerformed(evt);
            }
        });

        txPesquisaRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaRecebimentoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollRecebimento.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btInserirRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btEditarRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btExcluirRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaRecebimento)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollRecebimento)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserirRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txPesquisaRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
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

    private void btInserirRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirRecebimentoActionPerformed

        InserirRecebimentoGUI irg = new InserirRecebimentoGUI(modelo);
        irg.setVisible(true);
    }//GEN-LAST:event_btInserirRecebimentoActionPerformed

    private void btEditarRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRecebimentoActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoRecebimento = (int) tabela.getValueAt(linhaSelecionada, 0);

            RecebimentoController rc  = new RecebimentoController();
            InserirRecebimentoGUI irg = new InserirRecebimentoGUI(modelo, linhaSelecionada, CodigoRecebimento);
            irg.setVisible(true);
        }

    }//GEN-LAST:event_btEditarRecebimentoActionPerformed

    private void btExcluirRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRecebimentoActionPerformed
        
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            RecebimentoController rc = new RecebimentoController();
            if (rc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirRecebimentoActionPerformed

    private void txPesquisaRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaRecebimentoActionPerformed
        
        RecebimentoController rc = new RecebimentoController();
        modelo.setNumRows(0);

        for (Recebimento r : rc.pesquisaRecebimento(txPesquisaRecebimento.getText())) {

            modelo.addRow(new Object[]{r.getCodigo()});
        }
    }//GEN-LAST:event_txPesquisaRecebimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarRecebimento;
    private javax.swing.JButton btExcluirRecebimento;
    private javax.swing.JButton btInserirRecebimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollRecebimento;
    private javax.swing.JTextField txPesquisaRecebimento;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {
        
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        preecherTabela();
    }

    private void preecherTabela() {
        
        RecebimentoController rc = new RecebimentoController();
        for (Recebimento r : rc.listarRecebimento()) {

            modelo.addRow(new Object[]{r.getCodigo()});
            
        }
    }
}
