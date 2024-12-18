package quiz_form;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class Quiz_Form extends javax.swing.JFrame {

    String[] questoes = {
            // Perguntas de Java
            "O que é encapsulamento em Java?",
            "Qual é a diferença entre ArrayList e LinkedList em Java?",
            "Qual é o resultado da expressão: 10 + 20 + ´30´?",
            "O que é polimorfismo em Java?",
            "Qual é o operador instanceof em Java?",

             // Perguntas de HTML e CSS
            "Qual é a diferença entre HTML e CSS?",
            "O que significa 'DOCTYPE' em HTML?",
            "Qual é a função do seletor 'id' em CSS?",
            "Como você centraliza um elemento no HTML?",

            // Perguntas de JavaScript
            "O que é uma closure em JavaScript?",
            "Explique o que é 'hoisting' em JavaScript.",
            "Qual é a diferença entre '==' e '===' em JavaScript?",

             // Perguntas de Python
            "Qual é a diferença entre uma lista e uma tupla em Python?",
            "Como você realiza a leitura de um arquivo em Python?",
            "O que é o PEP 8 em Python?"

    };

    String[][] opcoes = {
            // Opções de resposta para Java
            {"<html>Ocultação de dados dentro de um objeto</html>",
                    "<html>Capacidade de um objeto se comportar de várias maneiras</html><br/>",
                    "<html>Substituição de métodos em Java</html><br/>",
                    "<html>Um pacote para proteger classes</html><br/>"},
            {"<html>ArrayList é baseado em array</html><br/>",
                    "<html>LinkedList é baseado em lista ligada</html><br/>",
                    "<html>ArrayList permite acesso aleatório</html><br/>",
                    "<html>LinkedList permite acesso sequencial</html><br/>"},
            {"<html>100</html><br/>",
                    "<html>50</html><br/>",
                    "<html>3030</html><br/>",
                    "<html>60</html><br/>"},
            {"<html>Capacidade de um objeto se comportar de várias maneiras</html><br/>",
                    "<html>Substituição de métodos em Java</html><br/>",
                    "<html>Uma técnica para evitar problemas de encapsulamento</html><br/>",
                    "<html>Uma maneira de declarar variáveis globais</html><br/>"},
            {"<html>Verifica se um objeto é uma instância de uma classe ou interface</html><br/>",
                    "<html>Verifica se um objeto é igual a outro objeto</html><br/>",
                    "<html>Verifica se um objeto é diferente de outro objeto</html><br/>",
                    "<html>Verifica se um objeto é null</html><br/>"},

            // Opções de resposta para HTML e CSS
            {"<html>HTML define a estrutura e o conteúdo da página web, CSS define a apresentação e o estilo da página web</html><br/>",
                    "<html>HTML é uma linguagem de programação, CSS é um framework</html><br/>",
                    "<html>HTML é usado apenas para criar formulários, CSS é usado apenas para estilizar páginas</html><br/>",
                    "<html>HTML e CSS são linguagens usadas apenas para programação de servidores web</html><br/>"},
            {"<html>Define o tipo de documento e a versão do HTML usada na página</html><br/>",
                    "<html>Define o estilo da página</html><br/>",
                    "<html>Define o código JavaScript usado na página</html><br/>",
                    "<html>Define a conexão de rede usada pelo navegador</html><br/>"},
            {"<html>Seleciona um elemento HTML com um ID específico para aplicar estilos CSS específicos a ele</html><br/>",
                    "<html>Seleciona todos os elementos HTML com um nome específico para aplicar estilos CSS a eles</html><br/>",
                    "<html>Seleciona um elemento HTML com uma classe específica para aplicar estilos CSS específicos a ele</html><br/>",
                    "<html>Seleciona um elemento HTML com um atributo específico para aplicar estilos CSS específicos a ele</html><br/>"},
           {"<html>Usando a propriedade 'text-align: center' no CSS</html><br/>",
                    "<html>Usando a propriedade 'align: center' no HTML</html><br/>",
                    "<html>Usando a propriedade 'text-align: middle' no CSS</html><br/>",
                   "<html>Usando a propriedade 'margin: auto;'</html><br/>"},


            // Opções de resposta para JavaScript
            {"<html>Uma função definida dentro de outra função que tem acesso ao escopo da função externa</html><br/>",
                    "<html>Uma função que não tem acesso ao escopo da função externa</html><br/>",
                    "<html>Um método usado para declarar variáveis globais em JavaScript</html><br/>",
                    "<html>Uma função que retorna um valor de retorno assíncrono</html><br/>"},
            {"<html>Mover a declaração de variáveis e funções para o topo do escopo atual antes da execução do código</html><br/>",
                    "<html>Mover a declaração de variáveis e funções para o fim do escopo atual depois da execução do código</html><br/>",
                    "<html>Mover a declaração de variáveis e funções para fora do escopo atual antes da execução do código</html><br/>",
                    "<html>Mover a declaração de variáveis e funções para o início do próximo escopo antes da execução do código</html><br/>"},
            {"<html>'==' compara os valores sem verificar o tipo, '===' compara os valores e os tipos de dados</html><br/>",
                    "<html>'==' compara os valores e os tipos de dados, '===' compara apenas os valores</html><br/>",
                   "<html>'==' e '===' são operadores idênticos em JavaScript</html><br/>",
                    "<html>'==' e '===' são usados para comparações lógicas em JavaScript</html><br/>"},


             // Opções de resposta para Python
            {"<html>Uma lista é mutável, uma tupla é imutável</html><br/>",
                    "<html>Uma lista pode conter elementos de diferentes tipos, uma tupla contém elementos do mesmo tipo</html><br/>",
                    "<html>Uma lista pode conter apenas números inteiros, uma tupla pode conter números decimais</html><br/>",
                    "<html>Uma lista é ordenada, uma tupla não é ordenada</html><br/>"},
           {"<html>Usando a função 'open()' built-in</html><br/>",
                    "<html>Usando a função 'readFile()'</html><br/>",
                   "<html>Usando a função 'loadFile()'</html><br/>",
                    "<html>Usando a função 'openFile()'</html><br/>"},
            {"<html>É um conjunto de diretrizes para escrever código Python de forma clara e legível</html><br/>",
                    "<html>É uma convenção para nomear variáveis em Python</html><br/>",
                    "<html>É um método para organizar módulos em Python</html><br/>",
                    "<html>É uma biblioteca de funções úteis para programação Python</html><br/>"}
    };

    String[] respostasCorretas = {
            // Respostas corretas para Java
            "Ocultação de dados dentro de um objeto",
            "ArrayList é baseado em array",
            "60",
            "Capacidade de um objeto se comportar de várias maneiras",
            "Verifica se um objeto é uma instância de uma classe ou interface",


            // Respostas corretas para HTML e CSS
            "HTML define a estrutura e o conteúdo da página web, CSS define a apresentação e o estilo da página web",
            "Define o tipo de documento e a versão do HTML usada na página",
            "Seleciona um elemento HTML com um ID específico para aplicar estilos CSS específicos a ele",
           "Usando a propriedade 'margin: auto;'",

            // Respostas corretas para JavaScript
            "Uma função definida dentro de outra função que tem acesso ao escopo da função externa",
            "Mover a declaração de variáveis e funções para o topo do escopo atual antes da execução do código",
            "'==' compara os valores sem verificar o tipo, '===' compara os valores e os tipos de dados",


           // Respostas corretas para Python
           "Uma lista é mutável, uma tupla é imutável",
           "Usando a função 'open()' built-in",
           "É um conjunto de diretrizes para escrever código Python de forma clara e legível"
    };

    ArrayList<Integer> indicesEmbaralhados;
    int indice = 0, correcta = 0, respostasCertas = 0, respostasErradas = 0;

    ButtonGroup bg = new ButtonGroup();


    public Quiz_Form() {
        initComponents();

        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);

        setLocationRelativeTo(null);

        iniciarQuiz();
    }

    private void iniciarQuiz() {
        // Inicializa e embaralha os índices das perguntas
        indicesEmbaralhados = new ArrayList<>();
        for (int i = 0; i < questoes.length; i++) {
            indicesEmbaralhados.add(i);
        }
        Collections.shuffle(indicesEmbaralhados);

        indice = 0;
        respostasCertas = 0;
        respostasErradas = 0;
         jLabel1.setText("Pergunta " + (indice + 1) + " de " + questoes.length);
        exibirProximaPergunta();
    }

    // Método para capitalizar a primeira letra de cada palavra
    public String capitalizarPergunta(String pergunta) {
        String[] palavras = pergunta.split(" ");
        StringBuilder perguntaCapitalizada = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                perguntaCapitalizada.append(Character.toUpperCase(palavra.charAt(0)))
                        .append(palavra.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return perguntaCapitalizada.toString().trim();
    }
    private void exibirProximaPergunta() {
        if (indice < questoes.length) {
            // Obtém o índice da próxima pergunta
            int idxPergunta = indicesEmbaralhados.get(indice);

            // Define o texto da pergunta e das opções de resposta
            Lbl_Question.setText(questoes[idxPergunta]);

            bg.clearSelection();

            String perguntaCapitalizada = capitalizarPergunta(questoes[idxPergunta]);
            Lbl_Question.setText(perguntaCapitalizada);
             jLabel1.setText((indice + 1) + " de " + questoes.length);
            // Embaralha as opções de resposta correspondentes à pergunta atual
            List<Integer> opcoesEmbaralhadas = new ArrayList<>();
            for (int i = 0; i < opcoes[idxPergunta].length; i++) {
                opcoesEmbaralhadas.add(i);
            }
            Collections.shuffle(opcoesEmbaralhadas);

            // Define o texto dos RadioButtons com as opções embaralhadas
            jRadioButton1_.setText(opcoes[idxPergunta][opcoesEmbaralhadas.get(0)]);
            jRadioButton2_.setText(opcoes[idxPergunta][opcoesEmbaralhadas.get(1)]);
            jRadioButton3_.setText(opcoes[idxPergunta][opcoesEmbaralhadas.get(2)]);
            jRadioButton4_.setText(opcoes[idxPergunta][opcoesEmbaralhadas.get(3)]);

            // Define qual é a resposta correta (posição do índice correto)
            correcta = opcoesEmbaralhadas.indexOf(0);

            // Atualiza o índice para a próxima pergunta
            indice++;
        } else {
             // Exibe a pontuação final ou mensagem de término do quiz
            exibirResultado();
            JOptionPane.showMessageDialog(null,
                "Fim do Quiz!\n\n" +
                "Respostas Corretas: " + respostasCertas + "\n" +
                "Respostas Incorretas: " + respostasErradas,
                 "Resultado do Quiz",
                  JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
    }


    private void verificarResposta() {
        JRadioButton[] rbs = {jRadioButton1_, jRadioButton2_, jRadioButton3_, jRadioButton4_};
        for (int i = 0; i < rbs.length; i++) {
            if (rbs[i].isSelected()) {
                if (i == correcta) {
                    JOptionPane.showMessageDialog(null, "Resposta Correta!");
                    respostasCertas++;

                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Incorreta!\n\nA resposta correta é a : " + (correcta + 1));
                    respostasErradas++;
                }
                exibirProximaPergunta();
                break;
            }
        }
    }

     private void exibirResultado() {
        // Exibe o resultado final
       Lbl_Question.setText("<html>Pontuação Final: <br> <br> Respostas Corretas: " + respostasCertas + "<br> Respostas Incorretas: " + respostasErradas + "</html>");


        // Define a cor de fundo baseado na pontuação
        if (respostasCertas >= (float) questoes.length / 2) {
            jPanel_Q_Container.setBackground(Color.green);
        } else {
            jPanel_Q_Container.setBackground(Color.red);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        btnReiniciar = new java.awt.Button();
        btnVerificar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(176, 224, 230));

        jPanel_Q_Container.setBackground(new java.awt.Color(255, 255, 255));

        Lbl_Question.setBackground(new java.awt.Color(250, 250, 250));
        Lbl_Question.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Perguntas");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Progresso");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jRadioButton1_.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1_.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jRadioButton1_.setText("opcao 1");
        jRadioButton1_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jRadioButton1_.setPreferredSize(new java.awt.Dimension(129, 43));

        jRadioButton2_.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2_.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jRadioButton2_.setText("opcao 2");
        jRadioButton2_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jRadioButton2_.setPreferredSize(new java.awt.Dimension(129, 43));

        jRadioButton3_.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3_.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jRadioButton3_.setText("opcao 3");
        jRadioButton3_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jRadioButton3_.setPreferredSize(new java.awt.Dimension(129, 43));

        jRadioButton4_.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4_.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jRadioButton4_.setText("opcao 4");
        jRadioButton4_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jRadioButton4_.setPreferredSize(new java.awt.Dimension(129, 43));

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReiniciar.setLabel("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnVerificar.setActionCommand("btnVerificar");
        btnVerificar.setBackground(new java.awt.Color(255, 255, 255));
        btnVerificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVerificar.setLabel("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addGap(69, 69, 69)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(416, 416, 416))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton1_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2_, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
         int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente reiniciar o quiz?",
                "Confirmação de Reinício",
                JOptionPane.YES_NO_OPTION
        );

        // Se a resposta for 'Sim', reinicia o quiz
        if (resposta == JOptionPane.YES_OPTION) {
            iniciarQuiz();
        }
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        verificarResposta();
    }//GEN-LAST:event_btnVerificarActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Quiz_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private java.awt.Button btnReiniciar;
    private java.awt.Button btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}