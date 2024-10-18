package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorCliques extends JFrame {
	private int contador = 0;
	// Variável para contar os cliques
	private JLabel labelContador;

	public ContadorCliques() {
		// Configurando a janela
		setTitle("Conta de Cliques");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		// Criando o JLabel para mostrar o contador
		labelContador = new JLabel("Clique no botão!");
		labelContador.setBounds(100, 30, 150, 30);
		add(labelContador);

		// Criando o JButton
		JButton botaoClique = new JButton("Clique aqui!");
		botaoClique.setBounds(100, 80, 100, 30);
		add(botaoClique);

		// Adicionado um ActionListener ao botão
		botaoClique.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contador++;
				// Inceementar o contador
				labelContador.setText("Contador:" + contador);
				// Atualiza o JLabel

			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContadorCliques();

	}

}
