package br.senai.sc.view.list;

import br.senai.sc.controller.StatusRecebimentoController;
import br.senai.sc.model.negocio.StatusRecebimento;
import br.senai.sc.view.inserir.InserirStatusRecebimentoGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class ListarStatusRecebimentoGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarStatusRecebimentoGUI() {
        initComponents();
        criaTabela();
        scrollStatusRecebimento.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirStatusRecebimento = new javax.swing.JButton();
        btEditarStatusRecebimento = new javax.swing.JButton();
        btExcluirStatusRecebimento = new javax.swing.JButton();
        txPesquisaStatusRecebimento = new javax.swing.JTextField();
        scrollStatusRecebimento = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Status de Recebimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btInserirStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirStatusRecebimento.setToolTipText("Inserir");
        btInserirStatusRecebimento.setOpaque(false);
        btInserirStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirStatusRecebimentoActionPerformed(evt);
            }
        });

        btEditarStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarStatusRecebimento.setToolTipText("Editar");
        btEditarStatusRecebimento.setOpaque(false);
        btEditarStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarStatusRecebimentoActionPerformed(evt);
            }
        });

        btExcluirStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirStatusRecebimento.setToolTipText("Excluir");
        btExcluirStatusRecebimento.setOpaque(false);
        btExcluirStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirStatusRecebimentoActionPerformed(evt);
            }
        });

        txPesquisaStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaStatusRecebimentoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollStatusRecebimento.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btInserirStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btEditarStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btExcluirStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaStatusRecebimento)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollStatusRecebimento)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btInserirStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btExcluirStatusRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(txPesquisaStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollStatusRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
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

    private void btInserirStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirStatusRecebimentoActionPerformed

        InserirStatusRecebimentoGUI isrg = new InserirStatusRecebimentoGUI(modelo);
        isrg.setVisible(true);
    }//GEN-LAST:event_btInserirStatusRecebimentoActionPerformed

    private void btEditarStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarStatusRecebimentoActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoStatusRecebimento = (int) tabela.getValueAt(linhaSelecionada, 0);

            StatusRecebimentoController strc = new StatusRecebimentoController();
            InserirStatusRecebimentoGUI isrg2 = new InserirStatusRecebimentoGUI(modelo, linhaSelecionada, CodigoStatusRecebimento);
            isrg2.setVisible(true);
        }
    }//GEN-LAST:event_btEditarStatusRecebimentoActionPerformed

    private void btExcluirStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirStatusRecebimentoActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            StatusRecebimentoController strc = new StatusRecebimentoController();
            if (strc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirStatusRecebimentoActionPerformed

    private void txPesquisaStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaStatusRecebimentoActionPerformed

        StatusRecebimentoController strc = new StatusRecebimentoController();
        modelo.setNumRows(0);

        for (StatusRecebimento s2 : strc.pesquisaStatusRecebimento(txPesquisaStatusRecebimento.getText())) {


            modelo.addRow(new Object[]{s2.getCodigo(), s2.getNome()});
        }

    }//GEN-LAST:event_txPesquisaStatusRecebimentoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarStatusRecebimento;
    private javax.swing.JButton btExcluirStatusRecebimento;
    private javax.swing.JButton btInserirStatusRecebimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollStatusRecebimento;
    private javax.swing.JTextField txPesquisaStatusRecebimento;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        preecherTabela();
    }

    private void preecherTabela() {

        StatusRecebimentoController strc = new StatusRecebimentoController();
        for (StatusRecebimento s2 : strc.listarStatusRecebimento()) {

            modelo.addRow(new Object[]{s2.getCodigo(), s2.getNome()});

        }

    }
}

