package br.senai.sc.app;
import br.senai.sc.view.list.ListarCargoGUI;
import br.senai.sc.view.list.ListarClienteGUI;
import br.senai.sc.view.list.ListarClienteRedeFaturaGUI;
import br.senai.sc.view.list.ListarClienteRedeGUI;
import br.senai.sc.view.list.ListarClienteViaRadioAdicionaisGUI;
import br.senai.sc.view.list.ListarContaReceberGUI;
import br.senai.sc.view.list.ListarFuncionarioGUI;
import br.senai.sc.view.list.ListarRecebimentoGUI;
import br.senai.sc.view.list.ListarRedeViaRadioGUI;
import br.senai.sc.view.list.ListarSituacaoRedesGUI;
import br.senai.sc.view.list.ListarStatusRecebimentoGUI;


/**
 * Janela principal que chama todos os botãos criado no sistema
 * @author Bruna
 */

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInfoVargas = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btClienteViaRadioAdicionais = new javax.swing.JButton();
        btClienteRede = new javax.swing.JButton();
        btRedesViaRadio = new javax.swing.JButton();
        btSituacaoRedes = new javax.swing.JButton();
        btClienteRedeFatura = new javax.swing.JButton();
        btRecebimento = new javax.swing.JButton();
        btContaReceber = new javax.swing.JButton();
        btStatusRecebimento = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        btCargos = new javax.swing.JButton();
        btFacebook = new javax.swing.JButton();
        btInstagram = new javax.swing.JButton();
        btTwitter = new javax.swing.JButton();
        btBrowser = new javax.swing.JButton();
        mnMenu = new javax.swing.JMenuBar();
        mnStatusRecebimento = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnClienteViaRadioAdicionais = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnClienteRede = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnRedesViaRadio = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnStatusRede = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnClienteRedeFatura = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnRecebimento = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnStatusRecebimen = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnContaReceber = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mnFuncionario = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnCargos = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        mnSobreEmpresa = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnSobreProduto = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnProblemas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnComoUtilizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(128, 154, 205));

        btInfoVargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/info-vargas.png"))); // NOI18N
        btInfoVargas.setOpaque(false);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente.png"))); // NOI18N
        btCliente.setToolTipText("Ambiente Cliente");
        btCliente.setOpaque(false);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btClienteViaRadioAdicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente_viaradio_adicionais.png"))); // NOI18N
        btClienteViaRadioAdicionais.setToolTipText("Ambiente Dados Adicionais Cliente");
        btClienteViaRadioAdicionais.setOpaque(false);
        btClienteViaRadioAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteViaRadioAdicionaisActionPerformed(evt);
            }
        });

        btClienteRede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente_rede.png"))); // NOI18N
        btClienteRede.setToolTipText("Ambiente Cliente Rede");
        btClienteRede.setOpaque(false);
        btClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteRedeActionPerformed(evt);
            }
        });

        btRedesViaRadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rede_via_radio.png"))); // NOI18N
        btRedesViaRadio.setToolTipText("Ambiente Redes Via Rádio");
        btRedesViaRadio.setOpaque(false);
        btRedesViaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRedesViaRadioActionPerformed(evt);
            }
        });

        btSituacaoRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/situacao_rede.png"))); // NOI18N
        btSituacaoRedes.setToolTipText("Ambiente Situação Redes");
        btSituacaoRedes.setOpaque(false);
        btSituacaoRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSituacaoRedesActionPerformed(evt);
            }
        });

        btClienteRedeFatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fatura.png"))); // NOI18N
        btClienteRedeFatura.setToolTipText("Ambiente Cliente Rede Fatura");
        btClienteRedeFatura.setOpaque(false);
        btClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteRedeFaturaActionPerformed(evt);
            }
        });

        btRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/recebimento.png"))); // NOI18N
        btRecebimento.setToolTipText("Ambiente Recebimento");
        btRecebimento.setOpaque(false);
        btRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecebimentoActionPerformed(evt);
            }
        });

        btContaReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contas_Receber.png"))); // NOI18N
        btContaReceber.setToolTipText("Ambiente Conta á Receber");
        btContaReceber.setOpaque(false);
        btContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContaReceberActionPerformed(evt);
            }
        });

        btStatusRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/status_recebimento.png"))); // NOI18N
        btStatusRecebimento.setToolTipText("Ambiente Status Recebimento");
        btStatusRecebimento.setOpaque(false);
        btStatusRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStatusRecebimentoActionPerformed(evt);
            }
        });

        btFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/funcionario.png"))); // NOI18N
        btFuncionario.setToolTipText("Ambiente Funcionários");
        btFuncionario.setOpaque(false);
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        btCargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cargo.png"))); // NOI18N
        btCargos.setToolTipText("Ambiente Cargos");
        btCargos.setOpaque(false);
        btCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargosActionPerformed(evt);
            }
        });

        btFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/face.png"))); // NOI18N
        btFacebook.setToolTipText("Nosso Facebook");
        btFacebook.setOpaque(false);
        btFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFacebookActionPerformed(evt);
            }
        });

        btInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/insta.png"))); // NOI18N
        btInstagram.setToolTipText("Nosso Instagram");
        btInstagram.setOpaque(false);

        btTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/twitter.png"))); // NOI18N
        btTwitter.setToolTipText("NossoTwitter");
        btTwitter.setOpaque(false);

        btBrowser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/browser.png"))); // NOI18N
        btBrowser.setToolTipText("Nosso Site");
        btBrowser.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btInfoVargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClienteViaRadioAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btRedesViaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btInfoVargas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btClienteViaRadioAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRedesViaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSituacaoRedes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btStatusRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClienteRedeFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btInstagram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFacebook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btTwitter)
                    .addComponent(btBrowser))
                .addContainerGap())
        );

        mnMenu.setBackground(new java.awt.Color(204, 204, 255));
        mnMenu.setForeground(new java.awt.Color(102, 102, 102));

        mnStatusRecebimento.setText("Menu");

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCliente.setText("Ambiente do Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnCliente);
        mnStatusRecebimento.add(jSeparator2);

        mnClienteViaRadioAdicionais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnClienteViaRadioAdicionais.setText("Ambiente Via-Rádio Dados Adicionais");
        mnClienteViaRadioAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteViaRadioAdicionaisActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnClienteViaRadioAdicionais);
        mnStatusRecebimento.add(jSeparator3);

        mnClienteRede.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnClienteRede.setText("Ambiente Cliente Rede");
        mnClienteRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteRedeActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnClienteRede);
        mnStatusRecebimento.add(jSeparator4);

        mnRedesViaRadio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnRedesViaRadio.setText("Ambiente Redes Via-Rádio");
        mnRedesViaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRedesViaRadioActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnRedesViaRadio);
        mnStatusRecebimento.add(jSeparator6);

        mnStatusRede.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD5, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnStatusRede.setText("Ambiente Status da Rede");
        mnStatusRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStatusRedeActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnStatusRede);
        mnStatusRecebimento.add(jSeparator8);

        mnClienteRedeFatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD6, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnClienteRedeFatura.setText("Ambiente Cliente Rede Fatura");
        mnClienteRedeFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteRedeFaturaActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnClienteRedeFatura);
        mnStatusRecebimento.add(jSeparator9);

        mnRecebimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD7, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnRecebimento.setText("Ambiente Recebimento");
        mnRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRecebimentoActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnRecebimento);
        mnStatusRecebimento.add(jSeparator10);

        mnStatusRecebimen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD8, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnStatusRecebimen.setText("Ambiente Status Recebimento");
        mnStatusRecebimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStatusRecebimenActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnStatusRecebimen);
        mnStatusRecebimento.add(jSeparator12);

        mnContaReceber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD9, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnContaReceber.setText("Ambiente Contas á Receber");
        mnContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnContaReceberActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnContaReceber);
        mnStatusRecebimento.add(jSeparator11);

        mnFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnFuncionario.setText("Ambiente Funcionários");
        mnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFuncionarioActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnFuncionario);
        mnStatusRecebimento.add(jSeparator14);

        mnCargos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCargos.setText("Ambiente Cargos");
        mnCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCargosActionPerformed(evt);
            }
        });
        mnStatusRecebimento.add(mnCargos);

        mnMenu.add(mnStatusRecebimento);

        mnSobre.setText("Sobre");

        mnSobreEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnSobreEmpresa.setText("Sobre a Empresa");
        mnSobre.add(mnSobreEmpresa);
        mnSobre.add(jSeparator5);

        mnSobreProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnSobreProduto.setText("Sobre o Produto");
        mnSobre.add(mnSobreProduto);

        mnMenu.add(mnSobre);

        mnAjuda.setText("Ajuda");

        mnProblemas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnProblemas.setText("Problemas No Software?");
        mnProblemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProblemasActionPerformed(evt);
            }
        });
        mnAjuda.add(mnProblemas);
        mnAjuda.add(jSeparator1);

        mnComoUtilizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnComoUtilizar.setText("Não Consegue Utilizar o Software ?");
        mnAjuda.add(mnComoUtilizar);

        mnMenu.add(mnAjuda);

        setJMenuBar(mnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnProblemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProblemasActionPerformed

    }//GEN-LAST:event_mnProblemasActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        ListarClienteGUI gui = new ListarClienteGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteRedeActionPerformed
        ListarClienteRedeGUI gui = new ListarClienteRedeGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnClienteRedeActionPerformed

    private void btRedesViaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRedesViaRadioActionPerformed
        ListarRedeViaRadioGUI gui = new ListarRedeViaRadioGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btRedesViaRadioActionPerformed

    private void mnRedesViaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRedesViaRadioActionPerformed
        ListarRedeViaRadioGUI gui = new ListarRedeViaRadioGUI();
        gui.setVisible(true);
        
    }//GEN-LAST:event_mnRedesViaRadioActionPerformed

    private void btFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFacebookActionPerformed

    }//GEN-LAST:event_btFacebookActionPerformed

    private void mnCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCargosActionPerformed
        ListarCargoGUI gui = new ListarCargoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnCargosActionPerformed

    private void btCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargosActionPerformed
        ListarCargoGUI gui = new ListarCargoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btCargosActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        ListarFuncionarioGUI gui = new ListarFuncionarioGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void mnClienteViaRadioAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteViaRadioAdicionaisActionPerformed
        ListarClienteViaRadioAdicionaisGUI gui = new ListarClienteViaRadioAdicionaisGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnClienteViaRadioAdicionaisActionPerformed

    private void mnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFuncionarioActionPerformed
        ListarFuncionarioGUI gui = new ListarFuncionarioGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnFuncionarioActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        ListarClienteGUI gui = new ListarClienteGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btClienteRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteRedeActionPerformed
        ListarClienteRedeGUI gui = new ListarClienteRedeGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btClienteRedeActionPerformed

    private void btClienteViaRadioAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteViaRadioAdicionaisActionPerformed
        ListarClienteViaRadioAdicionaisGUI gui = new ListarClienteViaRadioAdicionaisGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btClienteViaRadioAdicionaisActionPerformed

    private void btSituacaoRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSituacaoRedesActionPerformed
        ListarSituacaoRedesGUI gui = new ListarSituacaoRedesGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btSituacaoRedesActionPerformed

    private void btStatusRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStatusRecebimentoActionPerformed
        ListarStatusRecebimentoGUI gui = new ListarStatusRecebimentoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btStatusRecebimentoActionPerformed

    private void btRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecebimentoActionPerformed
        ListarRecebimentoGUI gui = new ListarRecebimentoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btRecebimentoActionPerformed

    private void btContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContaReceberActionPerformed
        ListarContaReceberGUI gui = new ListarContaReceberGUI();
        gui.setVisible(true);       
    }//GEN-LAST:event_btContaReceberActionPerformed

    private void btClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteRedeFaturaActionPerformed
        ListarClienteRedeFaturaGUI gui = new ListarClienteRedeFaturaGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_btClienteRedeFaturaActionPerformed

    private void mnStatusRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStatusRedeActionPerformed
        ListarSituacaoRedesGUI gui = new ListarSituacaoRedesGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnStatusRedeActionPerformed

    private void mnClienteRedeFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteRedeFaturaActionPerformed
        ListarClienteRedeFaturaGUI gui = new ListarClienteRedeFaturaGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnClienteRedeFaturaActionPerformed

    private void mnRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRecebimentoActionPerformed
        ListarRecebimentoGUI gui = new ListarRecebimentoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnRecebimentoActionPerformed

    private void mnStatusRecebimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStatusRecebimenActionPerformed
        ListarStatusRecebimentoGUI gui = new ListarStatusRecebimentoGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnStatusRecebimenActionPerformed

    private void mnContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnContaReceberActionPerformed
        ListarContaReceberGUI gui = new ListarContaReceberGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_mnContaReceberActionPerformed


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBrowser;
    private javax.swing.JButton btCargos;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btClienteRede;
    private javax.swing.JButton btClienteRedeFatura;
    private javax.swing.JButton btClienteViaRadioAdicionais;
    private javax.swing.JButton btContaReceber;
    private javax.swing.JButton btFacebook;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btInfoVargas;
    private javax.swing.JButton btInstagram;
    private javax.swing.JButton btRecebimento;
    private javax.swing.JButton btRedesViaRadio;
    private javax.swing.JButton btSituacaoRedes;
    private javax.swing.JButton btStatusRecebimento;
    private javax.swing.JButton btTwitter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnCargos;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnClienteRede;
    private javax.swing.JMenuItem mnClienteRedeFatura;
    private javax.swing.JMenuItem mnClienteViaRadioAdicionais;
    private javax.swing.JMenuItem mnComoUtilizar;
    private javax.swing.JMenuItem mnContaReceber;
    private javax.swing.JMenuItem mnFuncionario;
    private javax.swing.JMenuBar mnMenu;
    private javax.swing.JMenuItem mnProblemas;
    private javax.swing.JMenuItem mnRecebimento;
    private javax.swing.JMenuItem mnRedesViaRadio;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenuItem mnSobreEmpresa;
    private javax.swing.JMenuItem mnSobreProduto;
    private javax.swing.JMenuItem mnStatusRecebimen;
    private javax.swing.JMenu mnStatusRecebimento;
    private javax.swing.JMenuItem mnStatusRede;
    // End of variables declaration//GEN-END:variables
}
