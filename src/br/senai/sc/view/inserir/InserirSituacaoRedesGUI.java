package br.senai.sc.view.inserir;
import br.senai.sc.controller.SituacaoRedesController;
import br.senai.sc.model.negocio.SituacaoRedes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class InserirSituacaoRedesGUI extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    private int linhaSelecionada;


    public InserirSituacaoRedesGUI(DefaultTableModel modelo) {
        initComponents();
        this.modelo = modelo;
    }

    public InserirSituacaoRedesGUI(DefaultTableModel modelo, int linhaSelecionada, int CodigoSituacaoRede) {
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        
        
        SituacaoRedesController src1 = new SituacaoRedesController();
        SituacaoRedes sitred = src1.listarSituacaoRedesById(CodigoSituacaoRede);
        
        txCodigoSituacaoRede.setText(String.valueOf(sitred.getCodigo()));
        txNomeSituacaoRede.setText(String.valueOf(sitred.getNomeSituacao()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigoSituacaoRede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNomeSituacaoRede = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Inserção de Situação de Redes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código.:");

        txCodigoSituacaoRede.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome da Situação.:");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salvar_1.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setOpaque(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/limpar.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        btLimpar.setOpaque(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalvar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCodigoSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomeSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigoSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNomeSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        boolean inserir = true;

        SituacaoRedes sitr = new SituacaoRedes();

        //Método para atualizar quando inserir
        if (!(txCodigoSituacaoRede.equals(null) || txCodigoSituacaoRede.getText().equals(""))) {
            sitr.setCodigo(Integer.parseInt(txCodigoSituacaoRede.getText()));
            inserir = false;
        }
        
        sitr.setNomeSituacao(txNomeSituacaoRede.getText());
        
        
        SituacaoRedesController src = new SituacaoRedesController();
        SituacaoRedes sr = src.salvar(sitr);
        
        
        if (sr != null) {
            if (inserir == false) {
                modelo.removeRow(linhaSelecionada);
            }


            if (sr != null) {
                modelo.addRow(new Object[]{sr.getCodigo(), sr.getNomeSituacao()});
                dispose();
            }
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        
        txNomeSituacaoRede.setText("");
    }//GEN-LAST:event_btLimparActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txCodigoSituacaoRede;
    private javax.swing.JTextField txNomeSituacaoRede;
    // End of variables declaration//GEN-END:variables
}
