package CalculadoraInterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{

	JLabel n1, n2, exibir;
	JTextField txt1, txt2;
	JButton somar, sub, mult, div;
	
	public Calculadora() {
		super("Calculadora Funcional");
		Container tela = getContentPane();
		setLayout(null);
			n1 = new JLabel("1° Número: ");
			n2 = new JLabel("2° Número: ");
			txt1 = new JTextField(5);
			txt2 = new JTextField(5);
			exibir = new JLabel("");
			somar = new JButton("Somar");
			sub = new JButton("Subtrair");
			mult = new JButton("Multiplicar");
			div = new JButton("Dividir");
			
			n1.setBounds(50,20,100,20);
			txt1.setBounds(120,20,200,20);
			exibir.setBounds(50,200,300,20);
			n2.setBounds(50,60,100,20);
			txt2.setBounds(120,60,200,20);
			somar.setBounds(50,120,100,20);
			sub.setBounds(180,120,100,20);
			mult.setBounds(50,160,100,20);
			div.setBounds(180,160,100,20);
			
			somar.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				int n1,n2,soma;
				soma=0;
					
				n1= Integer.parseInt(txt1.getText());
				n2= Integer.parseInt(txt2.getText());
				soma = n1 + n2;
				exibir.setVisible(true);
				exibir.setText("A soma e: " +soma);
					}
				}
					
			);
			
			sub.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int n1,n2,sub;
					sub=0;
						
					n1= Integer.parseInt(txt1.getText());
					n2= Integer.parseInt(txt2.getText());
					sub = n1 - n2;
					exibir.setVisible(true);
					exibir.setText("A subtracao e: " +sub);
						}
					}
						
				);
			
			mult.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int n1,n2,mult;
					mult=0;
						
					n1= Integer.parseInt(txt1.getText());
					n2= Integer.parseInt(txt2.getText());
					mult = n1 * n2;
					exibir.setVisible(true);
					exibir.setText("A multiplicacao e: " +mult);
						}
					}
						
				);
			
			div.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					int n1,n2,div;
					div=0;
						
					n1= Integer.parseInt(txt1.getText());
					n2= Integer.parseInt(txt2.getText());
					div = n1 / n2;
					exibir.setVisible(true);
					exibir.setText("A divisao e: " +div);
						}
					}
						
				);
			
			
			exibir.setVisible(false);
			
			tela.add(n1);
			tela.add(n2);
			tela.add(txt1);
			tela.add(txt2);
			tela.add(exibir);
			tela.add(somar);
			tela.add(sub);
			tela.add(mult);
			tela.add(div);
			
			setSize(600,400);
			setVisible(true);
	}
	public static void main(String args[]) {
		Calculadora app = new Calculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
