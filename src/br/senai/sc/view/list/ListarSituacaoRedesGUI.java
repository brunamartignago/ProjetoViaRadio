package br.senai.sc.view.list;
import br.senai.sc.controller.SituacaoRedesController;
import br.senai.sc.model.negocio.SituacaoRedes;
import br.senai.sc.view.inserir.InserirSituacaoRedesGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class ListarSituacaoRedesGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarSituacaoRedesGUI() {
        initComponents();
        criaTabela();
        scrollSituacaoRedes.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirSituacaoRedes = new javax.swing.JButton();
        btEditarSituacaoRedes = new javax.swing.JButton();
        btExcluirSituacaoRedes = new javax.swing.JButton();
        txPesquisaSituacaoRedes = new javax.swing.JTextField();
        scrollSituacaoRedes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente Listagem de Situação de Redes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        btInserirSituacaoRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirSituacaoRedes.setToolTipText("Inserir");
        btInserirSituacaoRedes.setOpaque(false);
        btInserirSituacaoRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirSituacaoRedesActionPerformed(evt);
            }
        });

        btEditarSituacaoRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarSituacaoRedes.setToolTipText("Editar");
        btEditarSituacaoRedes.setOpaque(false);
        btEditarSituacaoRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarSituacaoRedesActionPerformed(evt);
            }
        });

        btExcluirSituacaoRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirSituacaoRedes.setToolTipText("Excluir");
        btExcluirSituacaoRedes.setOpaque(false);
        btExcluirSituacaoRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirSituacaoRedesActionPerformed(evt);
            }
        });

        txPesquisaSituacaoRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaSituacaoRedesActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollSituacaoRedes.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btInserirSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btEditarSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btExcluirSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaSituacaoRedes)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollSituacaoRedes)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEditarSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirSituacaoRedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(txPesquisaSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollSituacaoRedes, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
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

    private void btInserirSituacaoRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirSituacaoRedesActionPerformed

        InserirSituacaoRedesGUI isrg = new InserirSituacaoRedesGUI(modelo);
        isrg.setVisible(true);
        
    }//GEN-LAST:event_btInserirSituacaoRedesActionPerformed

    private void btEditarSituacaoRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarSituacaoRedesActionPerformed


        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoSituacaoRedes = (int) tabela.getValueAt(linhaSelecionada, 0);

            SituacaoRedesController src = new SituacaoRedesController();
            InserirSituacaoRedesGUI isrg = new InserirSituacaoRedesGUI(modelo, linhaSelecionada, CodigoSituacaoRedes);
            isrg.setVisible(true);
        }
    }//GEN-LAST:event_btEditarSituacaoRedesActionPerformed

    private void btExcluirSituacaoRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirSituacaoRedesActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            SituacaoRedesController src = new SituacaoRedesController();
            if (src.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirSituacaoRedesActionPerformed

    private void txPesquisaSituacaoRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaSituacaoRedesActionPerformed

        SituacaoRedesController src = new SituacaoRedesController();
        modelo.setNumRows(0);

        for (SituacaoRedes sr : src.pesquisaSituacaoRedes(txPesquisaSituacaoRedes.getText())) {

            modelo.addRow(new Object[]{sr.getCodigo(), sr.getNomeSituacao()});


        }
    }//GEN-LAST:event_txPesquisaSituacaoRedesActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarSituacaoRedes;
    private javax.swing.JButton btExcluirSituacaoRedes;
    private javax.swing.JButton btInserirSituacaoRedes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollSituacaoRedes;
    private javax.swing.JTextField txPesquisaSituacaoRedes;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        preecherTabela();
    }

    private void preecherTabela() {

        SituacaoRedesController src = new SituacaoRedesController();
        for (SituacaoRedes sr : src.listarSituacaoRedes()) {

            modelo.addRow(new Object[]{sr.getCodigo(), sr.getNomeSituacao()});
            
        }
        
    }
}