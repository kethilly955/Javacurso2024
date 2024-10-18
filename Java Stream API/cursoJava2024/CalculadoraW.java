package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraW extends JFrame {

	private JTextField display;
	private StringBuilder currentInput;
	private double num1 = 0, num2 = 0;
	private String operator = "";

	public CalculadoraW () {
		// Montando a tela da calculadora
		setTitle ("Calculadora");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout ());
		
		//Montando campo de texto para mostrar resultados:
		display = new JTextField();
		display.setFont(new Font("Ariel", Font.BOLD, 24));
		display.setEditable(false);
		add(display, BorderLayout.NORTH);
		
		//Montando o painel com os botões
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4,5,5));
		
		//Criando os botões:
		String[] buttons = { 
				"7","8","9","/",
				"4","5","6","*",
				"1","2","3","-",
				"0",".","=","+",
				"C"
				
		};
		  for (String text : buttons) {
	            JButton button = new JButton(text);
	            button.addActionListener(new ButtonClickListener());
	            buttonPanel.add(button);
	        }

	        add(buttonPanel, BorderLayout.CENTER);
	    }

	    private class ButtonClickListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();

	            if ("C".equals(command)) {
	                currentInput = new StringBuilder();
	                display.setText(""); // Corrigido para vazio
	                num1 = num2 = 0;
	                operator = "";
	            } else if ("=".equals(command)) {
	                num2 = Double.parseDouble(currentInput.toString());
	                double result = calculate(num1, num2, operator); // Corrigido para incluir a vírgula
	                display.setText(String.valueOf(result)); // Corrigido para String.valueOf
	                currentInput = new StringBuilder();
	            } else {
	                if ("0123456789.".contains(command)) {
	                    currentInput.append(command);
	                    display.setText(currentInput.toString());
	                } else {
	                    num1 = Double.parseDouble(currentInput.toString());
	                    operator = command;
	                    currentInput = new StringBuilder();
	                }
	            }
	        }
	    }

	    private double calculate(double num1, double num2, String operator) {
	        switch (operator) {
	            case "+":
	                return num1 + num2;
	            case "-":
	                return num1 - num2;
	            case "*":
	                return num1 * num2;
	            case "/":
	                return num1 / num2;
	            default: // Corrigido para "default"
	                return 0;
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            CalculadoraW calc = new CalculadoraW();
	            calc.setVisible(true);
	        });
	    }
	}