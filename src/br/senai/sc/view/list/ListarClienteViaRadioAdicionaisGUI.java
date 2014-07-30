package br.senai.sc.view.list;
import br.senai.sc.view.inserir.InserirClienteViaRadioAdicionaisGUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class ListarClienteViaRadioAdicionaisGUI extends javax.swing.JFrame {
    
    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();


    public ListarClienteViaRadioAdicionaisGUI() {
        initComponents();
        criaTabela();
        scrollClientesAdicionais.setViewportView(tabela);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirClientesAdicionais = new javax.swing.JButton();
        btEditarClientesAdicionais = new javax.swing.JButton();
        btExcluirClientesAdicionais = new javax.swing.JButton();
        txPesquisaClientesAdicionais = new javax.swing.JTextField();
        scrollClientesAdicionais = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Listagem de Dados Adicionais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        btInserirClientesAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirClientesAdicionais.setToolTipText("Inserir");
        btInserirClientesAdicionais.setOpaque(false);
        btInserirClientesAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClientesAdicionaisActionPerformed(evt);
            }
        });

        btEditarClientesAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarClientesAdicionais.setToolTipText("Editar");
        btEditarClientesAdicionais.setOpaque(false);
        btEditarClientesAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClientesAdicionaisActionPerformed(evt);
            }
        });

        btExcluirClientesAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirClientesAdicionais.setToolTipText("Excluir");
        btExcluirClientesAdicionais.setOpaque(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollClientesAdicionais.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btInserirClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btEditarClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btExcluirClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaClientesAdicionais)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollClientesAdicionais)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txPesquisaClientesAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollClientesAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
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

    private void btInserirClientesAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClientesAdicionaisActionPerformed
        
        InserirClienteViaRadioAdicionaisGUI icvrag = new InserirClienteViaRadioAdicionaisGUI();
        icvrag.setVisible(true);
    }//GEN-LAST:event_btInserirClientesAdicionaisActionPerformed

    private void btEditarClientesAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClientesAdicionaisActionPerformed
        
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoClienteAdicional = (int) tabela.getValueAt(linhaSelecionada, 0);
            
            
            
            

//            CargoController cc = new CargoController();
//            InserirCargoGUI icg = new InserirCargoGUI(modelo, linhaSelecionada, CodigoCargo);
//            icg.setVisible(true);
        }
    }//GEN-LAST:event_btEditarClientesAdicionaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarClientesAdicionais;
    private javax.swing.JButton btExcluirClientesAdicionais;
    private javax.swing.JButton btInserirClientesAdicionais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollClientesAdicionais;
    private javax.swing.JTextField txPesquisaClientesAdicionais;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
