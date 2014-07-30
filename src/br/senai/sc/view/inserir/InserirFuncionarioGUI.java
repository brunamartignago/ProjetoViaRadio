package br.senai.sc.view.inserir;
import br.senai.sc.controller.CargoController;
import br.senai.sc.controller.CidadeController;
import br.senai.sc.controller.EstadoController;
import br.senai.sc.controller.FuncionarioController;
import br.senai.sc.model.negocio.Cargo;
import br.senai.sc.model.negocio.Cidade;
import br.senai.sc.model.negocio.Endereco;
import br.senai.sc.model.negocio.Estado;
import br.senai.sc.model.negocio.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruna
 */

public class InserirFuncionarioGUI extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private int linhaSelecionada;

    public InserirFuncionarioGUI(DefaultTableModel modelo) {
        initComponents();
        lbIdEndereco.setVisible(false);
        lbIdEndereco.setText(null);
        this.modelo = modelo;
        carregarComboEstado();
        carregarComboCargo();
    }

    public InserirFuncionarioGUI(DefaultTableModel modelo, int linhaSelecionada, int CodigoFuncionario) {
        initComponents();
        lbIdEndereco.setVisible(false);
        lbIdEndereco.setText(null);
        carregarComboEstado();
        carregarComboCargo();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;


        FuncionarioController fc = new FuncionarioController();
        Funcionario fun = fc.listarFuncionarioById(CodigoFuncionario);

        txCodigoFuncionario.setText(String.valueOf(fun.getCodigo()));
        txNomeFuncionario.setText(String.valueOf(fun.getNome()));
        txApelidoFuncionario.setText(String.valueOf(fun.getApelido()));

        SimpleDateFormat formataDataCad1 = new SimpleDateFormat("dd/MM/yyyy");
        String dataCard1 = formataDataCad1.format(fun.getDataNascimento());
        ftDataNascimentoFuncionario.setText(dataCard1);

        ftCpfFuncionario.setText(String.valueOf(fun.getCpf()));
        ftRgFuncionario.setText(String.valueOf(fun.getRg()));
        ftTelefoneCelularFuncionario.setText(String.valueOf(fun.getTelefoneCelular()));
        ftTelefoneResidencialFuncionario.setText(String.valueOf(fun.getTelefoneResidencial()));
        txEmailFuncionario.setText(String.valueOf(fun.getEmail()));
        cbCidade.setSelectedItem(fun.getEndereco().getCidade());
        txBairroFuncionario.setText(String.valueOf(fun.getEndereco().getBairro()));
        txRuaFuncionario.setText(String.valueOf(fun.getEndereco().getRua()));
        txNumeroCasa.setText(String.valueOf(fun.getEndereco().getNumeroCasa()));
        txaComplementoFuncionario.setText(String.valueOf(fun.getEndereco().getComplemento()));
        txCepFuncionario.setText(String.valueOf(fun.getEndereco().getCEP()));
        cbIdCargo.setSelectedItem(fun.getCargo());
        txLoginFuncionario.setText(String.valueOf(fun.getLogin()));
        pwSenhaFuncionario.setText(String.valueOf(fun.getSenha()));
        lbIdEndereco.setText(String.valueOf(fun.getEndereco().getCodigo()));



        try {
            String data1 = ftDataNascimentoFuncionario.getText();
            fun.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data1));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor verifique a data! " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigoFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNomeFuncionario = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txApelidoFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txEmailFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txBairroFuncionario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txRuaFuncionario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txNumeroCasa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ftCpfFuncionario = new javax.swing.JFormattedTextField();
        ftRgFuncionario = new javax.swing.JFormattedTextField();
        cbIdCargo = new javax.swing.JComboBox();
        cbCidade = new javax.swing.JComboBox();
        ftDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        ftTelefoneCelularFuncionario = new javax.swing.JFormattedTextField();
        ftTelefoneResidencialFuncionario = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComplementoFuncionario = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txLoginFuncionario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txCepFuncionario = new javax.swing.JTextField();
        lbIdEndereco = new javax.swing.JLabel();
        pwSenhaFuncionario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ambiente de Inserção de Funcionários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código.:  ");

        txCodigoFuncionario.setEnabled(false);
        txCodigoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome.: *");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apelido.:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Nascimento.: *");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF.: *");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RG.: *");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone Celular.:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefone Residencial.:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email.:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cidade.: *");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bairro.: *");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rua.:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número.:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Complemento.:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cargo: *");

        try {
            ftCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftCpfFuncionarioActionPerformed(evt);
            }
        });

        try {
            ftRgFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado.: *");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        try {
            ftTelefoneCelularFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftTelefoneResidencialFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txaComplementoFuncionario.setColumns(20);
        txaComplementoFuncionario.setRows(5);
        jScrollPane1.setViewportView(txaComplementoFuncionario);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login.: *");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Senha.: *");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CEP.: *");

        lbIdEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIdEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbIdEndereco.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)
                                .addComponent(ftCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ftRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(27, 27, 27)
                                        .addComponent(cbIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(23, 23, 23)
                                        .addComponent(txApelidoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel17))
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txBairroFuncionario)
                                            .addComponent(cbEstado, 0, 210, Short.MAX_VALUE)
                                            .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txNumeroCasa, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(txRuaFuncionario)
                                            .addComponent(txCepFuncionario)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(477, 477, 477)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26)
                                        .addComponent(ftDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(44, 44, 44)
                                            .addComponent(ftTelefoneCelularFuncionario))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(ftTelefoneResidencialFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(lbIdEndereco)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pwSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txLoginFuncionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar)
                                .addGap(57, 57, 57)))
                        .addComponent(btLimpar)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txApelidoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ftDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ftCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txRuaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ftRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ftTelefoneCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ftTelefoneResidencialFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(lbIdEndereco)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(pwSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       
        boolean inserir = true;

        Funcionario fun = new Funcionario();

        //Método para atualizar quando inserir
        if (!(txCodigoFuncionario.equals(null) || txCodigoFuncionario.getText().equals(""))) {
            fun.setCodigo(Integer.parseInt(txCodigoFuncionario.getText()));
            inserir = false;
        }


        fun.setNome(txNomeFuncionario.getText());
        fun.setApelido(txApelidoFuncionario.getText());

        try {
            String data1 = ftDataNascimentoFuncionario.getText();
            fun.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data1));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Por favor verifique a data! " + ex);

        }

        fun.setCpf(ftCpfFuncionario.getText());
        fun.setRg(ftRgFuncionario.getText());
        fun.setTelefoneCelular(ftTelefoneCelularFuncionario.getText());
        fun.setTelefoneResidencial(ftTelefoneResidencialFuncionario.getText());
        fun.setEmail(txEmailFuncionario.getText());
        Cidade cidade = (Cidade) cbCidade.getSelectedItem();
        Estado estado = (Estado) cbEstado.getSelectedItem();

        Endereco e = new Endereco();
        e.setCidade(cidade);
        e.setEstado(estado);
        e.setBairro(txBairroFuncionario.getText());
        e.setRua(txRuaFuncionario.getText());
        e.setNumeroCasa(txNumeroCasa.getText());
        e.setComplemento(txaComplementoFuncionario.getText());
        e.setCEP(txCepFuncionario.getText());
        
        if (lbIdEndereco.getText() != null) {
            e.setCodigo(Integer.parseInt(lbIdEndereco.getText()));
        }
        fun.setEndereco(e);

        Cargo cargo = (Cargo) cbIdCargo.getSelectedItem();
        fun.setCargo(cargo);
        fun.setLogin(txLoginFuncionario.getText());
        fun.setSenha(pwSenhaFuncionario.getText());


        FuncionarioController fc = new FuncionarioController();
        Funcionario f = fc.salvar(fun);


        //Método para atualizar a linha sem remover a outra do lugar
        if (f != null) {
            if (inserir == false) {
                modelo.removeRow(linhaSelecionada);
            }


            //Caso o usuário não queira inserir novo, ele vem para cá para editar 
            if (f != null) {
                modelo.addRow(new Object[]{f.getCodigo()});
                dispose();
            }
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        txNomeFuncionario.setText("");
        txApelidoFuncionario.setText("");
        ftDataNascimentoFuncionario.setText("");
        ftCpfFuncionario.setText("");
        ftRgFuncionario.setText("");
        ftTelefoneCelularFuncionario.setText("");
        ftTelefoneResidencialFuncionario.setText("");
        txEmailFuncionario.setText("");
        cbCidade.setSelectedItem("");
        txBairroFuncionario.setText("");
        txRuaFuncionario.setText("");
        txNumeroCasa.setText("");
        txaComplementoFuncionario.setText("");
        txCepFuncionario.setText("");
        cbIdCargo.setSelectedItem("");
        txLoginFuncionario.setText("");
        pwSenhaFuncionario.setText("");

    }//GEN-LAST:event_btLimparActionPerformed

    private void ftCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftCpfFuncionarioActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        Estado estado = (Estado) cbEstado.getSelectedItem();
        carregarComboCidade(estado);
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void txCodigoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoFuncionarioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JComboBox cbIdCargo;
    private javax.swing.JFormattedTextField ftCpfFuncionario;
    private javax.swing.JFormattedTextField ftDataNascimentoFuncionario;
    private javax.swing.JFormattedTextField ftRgFuncionario;
    private javax.swing.JFormattedTextField ftTelefoneCelularFuncionario;
    private javax.swing.JFormattedTextField ftTelefoneResidencialFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIdEndereco;
    private javax.swing.JPasswordField pwSenhaFuncionario;
    private javax.swing.JTextField txApelidoFuncionario;
    private javax.swing.JTextField txBairroFuncionario;
    private javax.swing.JTextField txCepFuncionario;
    private javax.swing.JTextField txCodigoFuncionario;
    private javax.swing.JTextField txEmailFuncionario;
    private javax.swing.JTextField txLoginFuncionario;
    private javax.swing.JTextField txNomeFuncionario;
    private javax.swing.JTextField txNumeroCasa;
    private javax.swing.JTextField txRuaFuncionario;
    private javax.swing.JTextArea txaComplementoFuncionario;
    // End of variables declaration//GEN-END:variables

    private void carregarComboEstado() {

        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbEstado.getModel();
        comboModel.removeAllElements();
        List<Estado> lmc = new ArrayList<>();
        EstadoController ec = new EstadoController();
        lmc = ec.listarEstado();

        for (int linha = 0; linha < lmc.size(); linha++) {
            Estado e = lmc.get(linha);
            comboModel.addElement(e);
        }
    }

//    //VER COM A ROSI
    private void carregarComboCidade(Estado estado) {
        if (estado != null) {
            DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCidade.getModel();
            comboModel.removeAllElements();
            List<Cidade> lmc = new ArrayList<>();
            CidadeController cc = new CidadeController();
            lmc = cc.buscarEstado(estado);

            for (int linha = 0; linha < lmc.size(); linha++) {
                Cidade c = lmc.get(linha);
                comboModel.addElement(c);
            }
        }
    }

    private void carregarComboCargo() {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbIdCargo.getModel();
        comboModel.removeAllElements();
        List<Cargo> lmc = new ArrayList<>();
        CargoController ccar = new CargoController();
        lmc = ccar.listarCargo();

        for (int linha = 0; linha < lmc.size(); linha++) {
            Cargo ca = lmc.get(linha);
            comboModel.addElement(ca);
        }
    }
}
