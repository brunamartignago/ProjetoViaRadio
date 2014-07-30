package br.senai.sc.view.list;

import br.senai.sc.controller.FuncionarioController;
import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.view.inserir.InserirFuncionarioGUI;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */
public class ListarFuncionarioGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ListarFuncionarioGUI() {
        initComponents();
        criaTabela();
        scrollFuncionario.setViewportView(tabela);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirFuncionario = new javax.swing.JButton();
        btEditarFuncionario = new javax.swing.JButton();
        btExcluirFuncionario = new javax.swing.JButton();
        txPesquisaFuncionario = new javax.swing.JTextField();
        scrollFuncionario = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente Listagem de Funcionários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        btInserirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_padrao.png"))); // NOI18N
        btInserirFuncionario.setToolTipText("Inserir");
        btInserirFuncionario.setOpaque(false);
        btInserirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirFuncionarioActionPerformed(evt);
            }
        });

        btEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit_padrao.png"))); // NOI18N
        btEditarFuncionario.setToolTipText("Editar");
        btEditarFuncionario.setOpaque(false);
        btEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFuncionarioActionPerformed(evt);
            }
        });

        btExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_padrao.png"))); // NOI18N
        btExcluirFuncionario.setToolTipText("Excluir");
        btExcluirFuncionario.setOpaque(false);
        btExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFuncionarioActionPerformed(evt);
            }
        });

        txPesquisaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaFuncionarioActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollFuncionario.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txPesquisaFuncionario)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollFuncionario)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(txPesquisaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
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

    private void btInserirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirFuncionarioActionPerformed

        InserirFuncionarioGUI ifg = new InserirFuncionarioGUI(modelo);
        ifg.setVisible(true);

    }//GEN-LAST:event_btInserirFuncionarioActionPerformed

    private void btEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFuncionarioActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int CodigoFuncionario = (int) tabela.getValueAt(linhaSelecionada, 0);

            FuncionarioController fc = new FuncionarioController();
            InserirFuncionarioGUI ifg = new InserirFuncionarioGUI(modelo, linhaSelecionada, CodigoFuncionario);
            ifg.setVisible(true);
        }
    }//GEN-LAST:event_btEditarFuncionarioActionPerformed

    private void btExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFuncionarioActionPerformed

        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);

            FuncionarioController fc = new FuncionarioController();
            if (fc.excluir(id)) {
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_btExcluirFuncionarioActionPerformed

    private void txPesquisaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaFuncionarioActionPerformed

        FuncionarioController fc = new FuncionarioController();
        modelo.setNumRows(0);

        for (Funcionario f : fc.pesquisaFuncionario(txPesquisaFuncionario.getText())) {

            modelo.addRow(new Object[]{f.getCodigo(), f.getNome(), f.getDataNascimento(),
            f.getCpf(), f.getTelefoneCelular(), f.getCargo()});


        }
    }//GEN-LAST:event_txPesquisaFuncionarioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarFuncionario;
    private javax.swing.JButton btExcluirFuncionario;
    private javax.swing.JButton btInserirFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scrollFuncionario;
    private javax.swing.JTextField txPesquisaFuncionario;
    // End of variables declaration//GEN-END:variables

    private void criaTabela() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Data de Nascimento");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone Celular");
        modelo.addColumn("Cargo");
        preecherTabela();
    }

    private void preecherTabela() {

        FuncionarioController fc = new FuncionarioController();
        for (Funcionario f : fc.listarFuncionario()) {
            SimpleDateFormat formataDataCad1 = new SimpleDateFormat("dd/MM/yyyy");
            String dataCard1 = formataDataCad1.format(f.getDataNascimento());
           

            modelo.addRow(new Object[]{f.getCodigo(), f.getNome(), dataCard1,
                f.getCpf(), f.getTelefoneCelular(), f.getCargo().getNome()});

        }
    }
}