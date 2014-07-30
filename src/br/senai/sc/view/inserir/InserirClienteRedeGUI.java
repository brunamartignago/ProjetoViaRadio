package br.senai.sc.view.inserir;
import br.senai.sc.controller.ClienteRedeController;
import br.senai.sc.model.negocio.ClienteRede;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class InserirClienteRedeGUI extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private int linhaSelecionada;

    public InserirClienteRedeGUI(DefaultTableModel model) {
        initComponents();
        this.modelo = modelo;
//        carregarComboCliente();
//        carregarComboStatusRede();
    }

    public InserirClienteRedeGUI(DefaultTableModel modelo, int linhaSelecionada, int CodigoClienteRede) {
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
//        carregarComboCliente();
//        carregarComboStatusRede();


        ClienteRedeController crc = new ClienteRedeController();
        ClienteRede cr = crc.listarClienteRedeById(CodigoClienteRede);


        txCodigoClienteRede.setText(String.valueOf(cr.getCodigo()));
        //cbCliente.setSelectedItem(cr.getCliente());
        SimpleDateFormat formataDataCad1 = new SimpleDateFormat("dd/MM/yyyy");
        String dataCard1 = formataDataCad1.format(cr.getDataInicio());
        ftDataInicioClienteRede.setText(dataCard1);
      //  cbSituacaoRede.setSelectedItem(cr.getSituacaoRede());
        txSequenciaClienteRede.setText(String.valueOf(cr.getSequencia()));


        try {
            String data1 = ftDataInicioClienteRede.getText();
            cr.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(data1));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor verifique a data! " + ex);
        }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigoClienteRede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ftDataInicioClienteRede = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cbSituacaoRede = new javax.swing.JComboBox();
        cbCliente = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txSequenciaClienteRede = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Inserção Cliente Redes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20), java.awt.Color.white)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código.:");

        txCodigoClienteRede.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente.: *");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Inicio.: *");

        try {
            ftDataInicioClienteRede.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Situação Rede.: *");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salvar_1.png"))); // NOI18N
        btSalvar.setToolTipText("Limpar");
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sequencia.:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(57, 57, 57)
                .addComponent(btLimpar)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCodigoClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftDataInicioClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txSequenciaClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigoClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftDataInicioClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSituacaoRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txSequenciaClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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

        ClienteRede cre = new ClienteRede();

        //Método para atualizar quando inserir
        if (!(txCodigoClienteRede.equals(null) || txCodigoClienteRede.getText().equals(""))) {
            cre.setCodigo(Integer.parseInt(txCodigoClienteRede.getText()));
            inserir = false;
        }


       // cre.setCliente((Cliente) cbCliente.getSelectedItem());

        try {
            String data1 = ftDataInicioClienteRede.getText();
            cre.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(data1));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor verifique! " + ex);
        }

        //cre.setSituacaoRede((SituacaoRedes) cbSituacaoRede.getSelectedItem());
        cre.setSequencia(Integer.parseInt(txSequenciaClienteRede.getText()));


        ClienteRedeController crc = new ClienteRedeController();
        ClienteRede cr = crc.salvar(cre);


        //Método para atualizar a linha sem remover a outra do lugar
        if (cr != null) {
            if (inserir == false) {
                modelo.removeRow(linhaSelecionada);
            }


            //Caso o usuário não queira inserir novo, ele vem para cá para editar 
            if (cr != null) {
                modelo.addRow(new Object[]{cr.getCodigo()});
                dispose();
            }
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        ftDataInicioClienteRede.setText("");
        txSequenciaClienteRede.setText("");
        
    }//GEN-LAST:event_btLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbSituacaoRede;
    private javax.swing.JFormattedTextField ftDataInicioClienteRede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txCodigoClienteRede;
    private javax.swing.JTextField txSequenciaClienteRede;
    // End of variables declaration//GEN-END:variables

//    private void carregarComboCliente() {
//
//        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCliente.getModel();
//        comboModel.removeAllElements();
//        List<Cliente> lmc = new ArrayList<>();
//        ClienteController cc = new ClienteController();
//        lmc = cc.listarCliente();
//
//        for (int linha = 0; linha < lmc.size(); linha++) {
//            Cliente cl = lmc.get(linha);
//            comboModel.addElement(cl);
//        }
//    }


//private void carregarComboStatusRede() {
//
//DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbSituacaoRede.getModel();
//        comboModel.removeAllElements();
//        List<SituacaoRedes> lmc = new ArrayList<>();
//        SituacaoRedesController src = new SituacaoRedesController();
//        lmc = src.listarSituacaoRedes();
//
//        for (int linha = 0; linha < lmc.size(); linha++) {
//            SituacaoRedes sr = lmc.get(linha);
//            comboModel.addElement(sr);
//        }
//    }
}
