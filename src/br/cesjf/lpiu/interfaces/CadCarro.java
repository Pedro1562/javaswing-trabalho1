/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.interfaces;

import Classes.Automovel;
import br.cesjf.lpiu.arquivos.ArquivoInCarro;
import br.cesjf.lpiu.arquivos.ArquivoOutCarro;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class CadCarro extends javax.swing.JFrame {
    
   private ArquivoInCarro arqin = new ArquivoInCarro();
    private Automovel car = null;
    int linha;
    private ArquivoOutCarro arqout = new ArquivoOutCarro();

    /**
     * Creates new form NewJFrame
     */
    public CadCarro() {
        initComponents();
        auto = new Automovel();
        try {
            arqout.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CadCarro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CadCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Automovel auto = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoCarro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboMotorizacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtValorBasico = new javax.swing.JTextField();
        rbPasseio = new javax.swing.JRadioButton();
        rbUtilitario = new javax.swing.JRadioButton();
        rbCarga = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAliquota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarro = new javax.swing.JTable();
        btCalcular = new javax.swing.JButton();
        jbAdd = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JTextField();
        txtImposto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Automovel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Placa");

        jLabel2.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de fabricação");

        jLabel4.setText("Motorizacao");

        comboMotorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "1.4", "1.6", "1.8", "2.0" }));
        comboMotorizacao.setSelectedIndex(-1);
        comboMotorizacao.setToolTipText("");
        comboMotorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMotorizacaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Basico");

        txtValorBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorBasicoActionPerformed(evt);
            }
        });

        btTipoCarro.add(rbPasseio);
        rbPasseio.setText("Passeio");
        rbPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPasseioActionPerformed(evt);
            }
        });

        btTipoCarro.add(rbUtilitario);
        rbUtilitario.setText("Utilitario");

        btTipoCarro.add(rbCarga);
        rbCarga.setText("Carga");

        jLabel6.setText("Categoria");

        jLabel7.setText("Aliquota de imposto");

        txtAliquota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliquotaActionPerformed(evt);
            }
        });

        jLabel10.setText("Dados do Automovel");

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jtCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Modelo", "Data Fabricação", "Motorização", "Valor Básico", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCarro.getTableHeader().setReorderingAllowed(false);
        jtCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCarroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCarro);

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jbAdd.setText("Adicionar");
        jbAdd.setEnabled(false);
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        txtValorTotal.setEnabled(false);

        txtImposto.setEnabled(false);

        jLabel9.setText("Valor total de compra");

        jLabel8.setText("Imposto a pagar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel8)
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(rbPasseio))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(rbUtilitario)
                                    .addComponent(comboMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCarga)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtValorBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPasseio)
                            .addComponent(rbUtilitario)
                            .addComponent(rbCarga))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jtCarro.getModel();
        List<Automovel> list = new ArrayList<Automovel>();
        ArrayList<Automovel> nova_list = new ArrayList<Automovel>();
        linha = jtCarro.getSelectedRow();
        Object valor = modelo.getValueAt(linha, 0);
        list = arqin.getTodosCarros();

        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).getPlaca().equals(valor))) {
                nova_list.add(list.get(i));
            }
        }
        try {
            arqout.recadastrar_todos(nova_list);
        } catch (IOException ex) {
            Logger.getLogger(CadCarro.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo.removeRow(linha);
        JOptionPane.showMessageDialog(null, "Registro apagada com sucesso");

        limparCampos();

        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        ArrayList<Automovel> listauto = new ArrayList<Automovel>();
        listauto = (ArrayList<Automovel>) arqin.getTodosCarros();

        rbCarga.setActionCommand("Carga");
        rbPasseio.setActionCommand("Passeio");
        rbUtilitario.setActionCommand("Utilitario");

        listauto.get(linha).setPlaca(txtPlaca.getText());
        listauto.get(linha).setModelo(txtModelo.getText());
        listauto.get(linha).setData(txtData.getText());
        listauto.get(linha).setValorBasico(Double.parseDouble(txtValorBasico.getText()));
        listauto.get(linha).setMotorizacao((String) comboMotorizacao.getSelectedItem());
        listauto.get(linha).setCategoria(btTipoCarro.getSelection().getActionCommand());

        try {
            arqout.recadastrar_todos(listauto);
        } catch (IOException ex) {
            Logger.getLogger(CadCarro.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");

        limparCampos();

        DefaultTableModel modelo = (DefaultTableModel) jtCarro.getModel();

        if (jtCarro.getRowCount() > 0) {
            for (int i = jtCarro.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }

        List<Automovel> listauto2 = new ArrayList<Automovel>();
        listauto2 = arqin.getTodosCarros();

        for (int i = 0; i < listauto2.size(); i++) {
            modelo.addRow(listauto2.get(i).getcarro());
        }

        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        auto = new Automovel();
        auto.setPlaca(txtPlaca.getText());
        auto.setModelo(txtModelo.getText());
        auto.setData(txtData.getText());
        auto.setValorBasico(Double.parseDouble(txtValorBasico.getText()));
        auto.setMotorizacao((String) comboMotorizacao.getSelectedItem());

        rbCarga.setActionCommand("Carga");
        rbPasseio.setActionCommand("Passeio");
        rbUtilitario.setActionCommand("Utilitario");

        auto.setCategoria(btTipoCarro.getSelection().getActionCommand());

        try {
            arqout.Adicionar(auto);
        } catch (IOException ex) {
            Logger.getLogger(CadCarro.class
                .getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(
            null, "Carro Inserido com sucesso!");

        limparCampos();
        jbAdd.setEnabled(false);

        int cont = 1;

        List<Automovel> listacar = new ArrayList<Automovel>();

        listacar = arqin.getTodosCarros();
        DefaultTableModel modelocarro = (DefaultTableModel) jtCarro.getModel();

        for (int i = jtCarro.getRowCount() - 1;
            i >= 0; --i) {
            modelocarro.removeRow(i);
        }

        for (int i = 0;
            i < listacar.size();
            i++) {
            modelocarro.addRow(listacar.get(i).getcarro());
            cont++;
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed

        Double valorBasico = Double.parseDouble(txtValorBasico.getText());
        Double aliquota = Double.parseDouble(txtAliquota.getText());

        Double imposto = auto.calcularImposto(valorBasico, aliquota);
        txtImposto.setText(imposto.toString());

        txtValorTotal.setText(String.valueOf(auto.calcularValorTotal(valorBasico, imposto)));

        jbAdd.setEnabled(true);
    }//GEN-LAST:event_btCalcularActionPerformed

    private void jtCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCarroMouseClicked

        btAlterar.setEnabled(true);
        btExcluir.setEnabled(true);
        linha = jtCarro.getSelectedRow();

        txtPlaca.setText(jtCarro.getValueAt(linha, 0).toString());
        txtModelo.setText(jtCarro.getValueAt(linha, 1).toString());
        txtData.setText(jtCarro.getValueAt(linha, 2).toString());

        String motorizacao = jtCarro.getValueAt(linha, 3).toString();

        switch (motorizacao) {
            case "1.0":
            comboMotorizacao.setSelectedIndex(0);
            break;
            case "1.4":
            comboMotorizacao.setSelectedIndex(1);
            break;
            case "1.6":
            comboMotorizacao.setSelectedIndex(2);
            break;
            case "1.8":
            comboMotorizacao.setSelectedIndex(3);
            break;
            case "2.0":
            comboMotorizacao.setSelectedIndex(4);
            break;
            default:
            comboMotorizacao.setSelectedIndex(-1);
            break;
        }

        txtValorBasico.setText(jtCarro.getValueAt(linha, 4).toString());

        String tipo = jtCarro.getValueAt(linha, 5).toString();

        if (tipo.equals("Carga")) {
            rbCarga.setSelected(true);
        } else if (tipo.equals("Passeio")) {
            rbPasseio.setSelected(true);
        } else {
            rbUtilitario.setSelected(true);
        }
    }//GEN-LAST:event_jtCarroMouseClicked

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtAliquotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliquotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaActionPerformed

    private void rbPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPasseioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPasseioActionPerformed

    private void txtValorBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorBasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorBasicoActionPerformed

    private void comboMotorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMotorizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMotorizacaoActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int cont = 1;

        List<Automovel> listacar = new ArrayList<Automovel>();

        listacar = arqin.getTodosCarros();
        DefaultTableModel modelocarro = (DefaultTableModel) jtCarro.getModel();

        for (int i = jtCarro.getRowCount() - 1; i >= 0; --i) {
            modelocarro.removeRow(i);
        }

        for (int i = 0; i < listacar.size(); i++) {
            modelocarro.addRow(listacar.get(i).getcarro());
            cont++;
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Principal princ = new Principal();
        princ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup btTipoCarro;
    private javax.swing.JComboBox<String> comboMotorizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton jbAdd;
    private javax.swing.JTable jtCarro;
    private javax.swing.JRadioButton rbCarga;
    private javax.swing.JRadioButton rbPasseio;
    private javax.swing.JRadioButton rbUtilitario;
    private javax.swing.JTextField txtAliquota;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtImposto;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JTextField txtValorBasico;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtData.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtValorBasico.setText("");
        txtAliquota.setText("");
        txtValorTotal.setText("");
        txtImposto.setText("");
        comboMotorizacao.setSelectedIndex(-1);
        btTipoCarro.clearSelection();
    }
}
