package br.senai.sc.view.list;
import br.senai.sc.controller.ContaReceberController;
import br.senai.sc.model.negocio.ContaReceber;
import br.senai.sc.view.inserir.InserirContaReceberGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class ListarContaReceberGUI extends javax.swing.JFrame {
    
    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    
    public ListarContaReceberGUI() {
        initComponents();
        criaTabela();
        scrollContaReceber.setViewportView(tabela);
        setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirContaReceber = new javax.swing.JButton();
        btEditarContaReceber = new javax.swing.JButton();
        btExcluirContaReceber = new javax.swing.JButton();
        txPesquisaContaReceber = new javax.swing.JTextField();
        scrollContaReceber = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Contas á Receber", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        btInserirContaReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirContaReceber.setToolTipText("Inserir");
        btInserirContaReceber.setOpaque(false);
        btInserirContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirContaReceberActionPerformed(evt);
            }
        });

        btEditarContaReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarContaReceber.setToolTipText("Editar");
        btEditarContaReceber.setOpaque(false);
        btEditarContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarContaReceberActionPerformed(evt);
            }
        });

        btExcluirContaReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirContaReceber.setToolTipText("Excluir");
        btExcluirContaReceber.setOpaque(false);
        btExcluirContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirContaReceberActionPerformed(evt);
            }
        });

        txPesquisaContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaContaReceberActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollContaReceber.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btInserirContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btEditarContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btExcluirContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaContaReceber)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollContaReceber)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(txPesquisaContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollContaReceber, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
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

    private void btInserirContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirContaReceberActionPerformed

        InserirContaReceberGUI icorg = new InserirContaReceberGUI(modelo);
        icorg.setVisible(true);

    }//GEN-LAST:event_btInserirContaReceberActionPerformed

    private void btEditarContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarContaReceberActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoContaReceber = (int) tabela.getValueAt(linhaSelecionada, 0);

            ContaReceberController corc =  new ContaReceberController();
            InserirContaReceberGUI icorg = new InserirContaReceberGUI(modelo, linhaSelecionada, CodigoContaReceber);
            icorg.setVisible(true);
        }
        
    }//GEN-LAST:event_btEditarContaReceberActionPerformed

    private void btExcluirContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirContaReceberActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            ContaReceberController corc = new ContaReceberController();
            if (corc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirContaReceberActionPerformed

    private void txPesquisaContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaContaReceberActionPerformed
        
        ContaReceberController corc = new ContaReceberController();
        modelo.setNumRows(0);

        for (ContaReceber cor : corc.pesquisaContaReceber(txPesquisaContaReceber.getText())) {

            modelo.addRow(new Object[]{cor.getCodigo()});
        }
    }//GEN-LAST:event_txPesquisaContaReceberActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarContaReceber;
    private javax.swing.JButton btExcluirContaReceber;
    private javax.swing.JButton btInserirContaReceber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollContaReceber;
    private javax.swing.JTextField txPesquisaContaReceber;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {
        
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        preecherTabela();
        
    }

    private void preecherTabela() {
        
        ContaReceberController corc = new ContaReceberController();
        for (ContaReceber cor : corc.listarContaReceber()) {

            modelo.addRow(new Object[]{cor.getCodigo()});
            
        }
        
    }
    }

