package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioSimples extends JFrame {
    private JTextField campoNome;
    private JTextField campoIdade;
    
    public FormularioSimples() {
        // Configurando a janela
        setTitle("Formulário Simples");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        // Criando JLabel e JTextField para Nome
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(30, 30, 100, 30);
        add(labelNome);
        
        campoNome = new JTextField();
        campoNome.setBounds(100, 30, 150, 30);
        add(campoNome);
        
        // Criando JLabel e JTextField para Idade
        JLabel labelIdade = new JLabel("Idade:");
        labelIdade.setBounds(30, 70, 100, 30);
        add(labelIdade);

        campoIdade = new JTextField();
        campoIdade.setBounds(100, 70, 150, 30);
        add(campoIdade);

        // Criando o JButton
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(100, 110, 100, 30);
        add(botaoEnviar);
        
        // Adicionando um ActionListener
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String idade = campoIdade.getText();
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
            }
        });
        
        // Tornando a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioSimples();
    }
}
