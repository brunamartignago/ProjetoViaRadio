package br.senai.sc.view.list;
import br.senai.sc.controller.CargoController;
import br.senai.sc.model.negocio.Cargo;
import br.senai.sc.view.inserir.InserirCargoGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class ListarCargoGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarCargoGUI() {
        initComponents();
        criaTabela();
        scrollCargo.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirCargo = new javax.swing.JButton();
        btEditarCargo = new javax.swing.JButton();
        btExcluirCargo = new javax.swing.JButton();
        txPesquisaCargo = new javax.swing.JTextField();
        scrollCargo = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente Listagem de Cargos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        btInserirCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirCargo.setToolTipText("Inserir");
        btInserirCargo.setOpaque(false);
        btInserirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirCargoActionPerformed(evt);
            }
        });

        btEditarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarCargo.setToolTipText("Editar");
        btEditarCargo.setOpaque(false);
        btEditarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCargoActionPerformed(evt);
            }
        });

        btExcluirCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirCargo.setToolTipText("Excluir");
        btExcluirCargo.setOpaque(false);
        btExcluirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCargoActionPerformed(evt);
            }
        });

        txPesquisaCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaCargoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollCargo.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btInserirCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btEditarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btExcluirCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaCargo)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollCargo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEditarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(txPesquisaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
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

    private void btInserirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirCargoActionPerformed

        InserirCargoGUI icg = new InserirCargoGUI(modelo);
        icg.setVisible(true);
        
    }//GEN-LAST:event_btInserirCargoActionPerformed

    private void btEditarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCargoActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoCargo = (int) tabela.getValueAt(linhaSelecionada, 0);

            CargoController cc = new CargoController();
            InserirCargoGUI icg = new InserirCargoGUI(modelo, linhaSelecionada, CodigoCargo);
            icg.setVisible(true);
        }
    }//GEN-LAST:event_btEditarCargoActionPerformed

    private void btExcluirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCargoActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            CargoController cc = new CargoController();
            if (cc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirCargoActionPerformed

    private void txPesquisaCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaCargoActionPerformed

        CargoController cc = new CargoController();
        modelo.setNumRows(0);

        for (Cargo c : cc.pesquisaCargo(txPesquisaCargo.getText())) {

            modelo.addRow(new Object[]{c.getCodigo(), c.getNome(), c.getDescricao(), c.getValor(),
                c.getCargaHoraria()});
        }
        
    }//GEN-LAST:event_txPesquisaCargoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarCargo;
    private javax.swing.JButton btExcluirCargo;
    private javax.swing.JButton btInserirCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollCargo;
    private javax.swing.JTextField txPesquisaCargo;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Valor");
        preecherTabela();
    }

    private void preecherTabela() {

        CargoController cc = new CargoController();
        for (Cargo c : cc.listarCargo()) {

            modelo.addRow(new Object[]{c.getCodigo(), c.getNome(),c.getValor()});
            
        }
        
    }
}