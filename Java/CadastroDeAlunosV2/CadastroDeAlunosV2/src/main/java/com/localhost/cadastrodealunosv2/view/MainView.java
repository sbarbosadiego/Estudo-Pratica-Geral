package com.localhost.cadastrodealunosv2.view;

import com.localhost.cadastrodealunosv2.controller.AlunoController;
import com.localhost.cadastrodealunosv2.model.AlunoModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego Barbosa da Silva
 */
public class MainView extends javax.swing.JFrame {
    
    // Aluno
    AlunoModel alunoModel = new AlunoModel();
    AlunoController alunoController = new AlunoController();
    ArrayList<AlunoModel> listaAlunoModel = new ArrayList<>();
    
    
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        listarAlunos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        telaAluno = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbAluno = new javax.swing.JTable();
        btnEditarAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisarAluno = new javax.swing.JTextField();
        btnAtualizarTabelaAluno = new javax.swing.JButton();
        btnPesquisarAluno = new javax.swing.JButton();
        btnNovoAluno = new javax.swing.JButton();
        btnExcluirAluno = new javax.swing.JButton();
        telaCurso = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbCurso = new javax.swing.JTable();
        btnEditarCurso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfPesquisarCurso = new javax.swing.JTextField();
        btnAtualizarTabelaCurso = new javax.swing.JButton();
        btnPesquisarCurso = new javax.swing.JButton();
        btnNovoCurso = new javax.swing.JButton();
        btnExcluirCurso = new javax.swing.JButton();
        telaMatricula = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtbMatricula = new javax.swing.JTable();
        btnEditarMatricula = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfPesquisarMatricula = new javax.swing.JTextField();
        btnAtualizarTabelaMatricula = new javax.swing.JButton();
        btnPesquisarMatricula = new javax.swing.JButton();
        btnNovoMatricula = new javax.swing.JButton();
        btnExcluirMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jtbAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtbAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "Data Cadastro"
            }
        ));
        jScrollPane2.setViewportView(jtbAluno);

        btnEditarAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditarAluno.setText("Editar");
        btnEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlunoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisar:");

        jtfPesquisarAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarAlunoActionPerformed(evt);
            }
        });

        btnAtualizarTabelaAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAtualizarTabelaAluno.setText("R");
        btnAtualizarTabelaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaAlunoActionPerformed(evt);
            }
        });

        btnPesquisarAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPesquisarAluno.setText("Pesquisar");
        btnPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAlunoActionPerformed(evt);
            }
        });

        btnNovoAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNovoAluno.setText("Novo");
        btnNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAlunoActionPerformed(evt);
            }
        });

        btnExcluirAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluirAluno.setText("Excluir");
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaAlunoLayout = new javax.swing.GroupLayout(telaAluno);
        telaAluno.setLayout(telaAlunoLayout);
        telaAlunoLayout.setHorizontalGroup(
            telaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addGroup(telaAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarTabelaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaAlunoLayout.createSequentialGroup()
                        .addComponent(btnNovoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaAlunoLayout.setVerticalGroup(
            telaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAlunoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(telaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarTabelaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aluno", telaAluno);

        jtbCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Curso", "Data Cadastro"
            }
        ));
        jScrollPane4.setViewportView(jtbCurso);

        btnEditarCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditarCurso.setText("Editar");
        btnEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCursoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Pesquisar:");

        jtfPesquisarCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfPesquisarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarCursoActionPerformed(evt);
            }
        });

        btnAtualizarTabelaCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAtualizarTabelaCurso.setText("R");
        btnAtualizarTabelaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaCursoActionPerformed(evt);
            }
        });

        btnPesquisarCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPesquisarCurso.setText("Pesquisar");
        btnPesquisarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCursoActionPerformed(evt);
            }
        });

        btnNovoCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNovoCurso.setText("Novo");
        btnNovoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCursoActionPerformed(evt);
            }
        });

        btnExcluirCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluirCurso.setText("Excluir");
        btnExcluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCursoLayout = new javax.swing.GroupLayout(telaCurso);
        telaCurso.setLayout(telaCursoLayout);
        telaCursoLayout.setHorizontalGroup(
            telaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addGroup(telaCursoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisarCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaCursoLayout.createSequentialGroup()
                        .addComponent(btnNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaCursoLayout.setVerticalGroup(
            telaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCursoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(telaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarTabelaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Curso", telaCurso);

        jtbMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Cód. Aluno", "Aluno", "Curso"
            }
        ));
        jScrollPane5.setViewportView(jtbMatricula);

        btnEditarMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditarMatricula.setText("Editar");
        btnEditarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMatriculaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Pesquisar:");

        jtfPesquisarMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfPesquisarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarMatriculaActionPerformed(evt);
            }
        });

        btnAtualizarTabelaMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAtualizarTabelaMatricula.setText("R");
        btnAtualizarTabelaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaMatriculaActionPerformed(evt);
            }
        });

        btnPesquisarMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPesquisarMatricula.setText("Pesquisar");
        btnPesquisarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarMatriculaActionPerformed(evt);
            }
        });

        btnNovoMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNovoMatricula.setText("Novo");
        btnNovoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMatriculaActionPerformed(evt);
            }
        });

        btnExcluirMatricula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluirMatricula.setText("Excluir");
        btnExcluirMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaMatriculaLayout = new javax.swing.GroupLayout(telaMatricula);
        telaMatricula.setLayout(telaMatriculaLayout);
        telaMatriculaLayout.setHorizontalGroup(
            telaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addGroup(telaMatriculaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisarMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarTabelaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMatriculaLayout.createSequentialGroup()
                        .addComponent(btnNovoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaMatriculaLayout.setVerticalGroup(
            telaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMatriculaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(telaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPesquisarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarTabelaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matrícula", telaMatricula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlunoActionPerformed
        int linha = jtbAluno.getSelectedRow();
        new AlunoView().setVisible(true);
        try {
            Long codigoAluno = (Long) jtbAluno.getValueAt(linha, 0);
            alunoModel = alunoController.retornarAlunoController(codigoAluno);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado");
        }
    }//GEN-LAST:event_btnEditarAlunoActionPerformed

    private void jtfPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarAlunoActionPerformed

    private void btnAtualizarTabelaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaAlunoActionPerformed
        listarAlunos();
    }//GEN-LAST:event_btnAtualizarTabelaAlunoActionPerformed

    private void btnPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarAlunoActionPerformed

    private void btnNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAlunoActionPerformed
        AlunoView alunoView = new AlunoView();

        alunoView.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
            }
        });

        alunoView.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_btnNovoAlunoActionPerformed

    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        int linha = jtbAluno.getSelectedRow();
        Long codigoAluno = (Long) jtbAluno.getValueAt(linha, 0);
        if (JOptionPane.showConfirmDialog(this, "Excluir Aluno?", "Excluir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (alunoController.excluirAlunoController(codigoAluno)) {
                JOptionPane.showMessageDialog(this, "Aluno excluído", "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);
                listarAlunos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro de exclusão", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    private void btnEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCursoActionPerformed

    private void jtfPesquisarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarCursoActionPerformed

    private void btnAtualizarTabelaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarTabelaCursoActionPerformed

    private void btnPesquisarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarCursoActionPerformed

    private void btnNovoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCursoActionPerformed
        CursoView cursoView = new CursoView();

        cursoView.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
            }
        });

        cursoView.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_btnNovoCursoActionPerformed

    private void btnExcluirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCursoActionPerformed

    private void btnEditarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMatriculaActionPerformed

    private void jtfPesquisarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarMatriculaActionPerformed

    private void btnAtualizarTabelaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarTabelaMatriculaActionPerformed

    private void btnPesquisarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarMatriculaActionPerformed

    private void btnNovoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMatriculaActionPerformed
        MatriculaView matriculaView = new MatriculaView();

        matriculaView.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
            }
        });

        matriculaView.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_btnNovoMatriculaActionPerformed

    private void btnExcluirMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    public void listarAlunos() {
        listaAlunoModel = (ArrayList<AlunoModel>) alunoController.retornarListarAlunosController();
        DefaultTableModel tabela = (DefaultTableModel) jtbAluno.getModel();
        tabela.setNumRows(0);

        int contador = listaAlunoModel.size();
        for (int c = 0; c < contador; c++) {
            tabela.addRow(new Object[]{
                listaAlunoModel.get(c).getCodigoAluno(),
                listaAlunoModel.get(c).getNomeAluno(),
                listaAlunoModel.get(c).getDataCriacao()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarTabelaAluno;
    private javax.swing.JButton btnAtualizarTabelaCurso;
    private javax.swing.JButton btnAtualizarTabelaMatricula;
    private javax.swing.JButton btnEditarAluno;
    private javax.swing.JButton btnEditarCurso;
    private javax.swing.JButton btnEditarMatricula;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.JButton btnExcluirCurso;
    private javax.swing.JButton btnExcluirMatricula;
    private javax.swing.JButton btnNovoAluno;
    private javax.swing.JButton btnNovoCurso;
    private javax.swing.JButton btnNovoMatricula;
    private javax.swing.JButton btnPesquisarAluno;
    private javax.swing.JButton btnPesquisarCurso;
    private javax.swing.JButton btnPesquisarMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtbAluno;
    private javax.swing.JTable jtbCurso;
    private javax.swing.JTable jtbMatricula;
    private javax.swing.JTextField jtfPesquisarAluno;
    private javax.swing.JTextField jtfPesquisarCurso;
    private javax.swing.JTextField jtfPesquisarMatricula;
    private javax.swing.JPanel telaAluno;
    private javax.swing.JPanel telaCurso;
    private javax.swing.JPanel telaMatricula;
    // End of variables declaration//GEN-END:variables
}
