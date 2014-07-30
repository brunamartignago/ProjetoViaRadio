package br.senai.sc.view.inserir;
import br.senai.sc.controller.StatusRecebimentoController;
import br.senai.sc.model.negocio.StatusRecebimento;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class InserirStatusRecebimentoGUI extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    private int linhaSelecionada;


    public InserirStatusRecebimentoGUI(DefaultTableModel modelo) {
        initComponents();
        this.modelo = modelo;
    }

    public InserirStatusRecebimentoGUI(DefaultTableModel modelo, int linhaSelecionada, int CodigoStatusRecebimento) {
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        
        StatusRecebimentoController strc = new StatusRecebimentoController();
        StatusRecebimento sr = strc.listarStatusRecebimentoById(CodigoStatusRecebimento);
        
        txCodigoStatusRecebimento.setText(String.valueOf(sr.getCodigo()));
        txNomeStatusRecebimento.setText(String.valueOf(sr.getNome()));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigoStatusRecebimento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNomeStatusRecebimento = new javax.swing.JTextField();
        btSalvarStatusRecebimento = new javax.swing.JButton();
        btLimparStatusRecebimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Inserção de Status de Recebimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código.:");

        txCodigoStatusRecebimento.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome.:");

        btSalvarStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salvar_1.png"))); // NOI18N
        btSalvarStatusRecebimento.setToolTipText("Salvar");
        btSalvarStatusRecebimento.setOpaque(false);
        btSalvarStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarStatusRecebimentoActionPerformed(evt);
            }
        });

        btLimparStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/limpar.png"))); // NOI18N
        btLimparStatusRecebimento.setToolTipText("Limpar");
        btLimparStatusRecebimento.setOpaque(false);
        btLimparStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparStatusRecebimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txCodigoStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNomeStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarStatusRecebimento)
                .addGap(35, 35, 35)
                .addComponent(btLimparStatusRecebimento)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigoStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNomeStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
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

    private void btSalvarStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarStatusRecebimentoActionPerformed

        boolean inserir = true;
        
        StatusRecebimento str = new StatusRecebimento();
        
        if (!(txCodigoStatusRecebimento.equals(null) || txCodigoStatusRecebimento.getText().equals(""))){
            str.setCodigo(Integer.parseInt(txCodigoStatusRecebimento.getText()));
            inserir = false;
        }
        
        
        str.setNome(txNomeStatusRecebimento.getText());

        StatusRecebimentoController src = new StatusRecebimentoController();
        StatusRecebimento sr = src.salvar(str);

        
        if (sr != null) {
            if (inserir == false) {
                modelo.removeRow(linhaSelecionada);
            }


            if (sr != null) {
                modelo.addRow(new Object[]{sr.getCodigo(), sr.getNome()});
                dispose();
            }
        }
        

    }//GEN-LAST:event_btSalvarStatusRecebimentoActionPerformed

    private void btLimparStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparStatusRecebimentoActionPerformed
        
        txNomeStatusRecebimento.setText("");
        
    }//GEN-LAST:event_btLimparStatusRecebimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimparStatusRecebimento;
    private javax.swing.JButton btSalvarStatusRecebimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txCodigoStatusRecebimento;
    private javax.swing.JTextField txNomeStatusRecebimento;
    // End of variables declaration//GEN-END:variables
}
