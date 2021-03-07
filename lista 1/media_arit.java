import javax.swing.*;

public class media_arit{

	public static void main(String s[]){

	String nome;
	int p1,p2;
	float n1,n2,media;
	
	nome = JOptionPane.showInputDialog("Digite seu nome: ");
	
	p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da primeira nota: "));
	p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da segunda nota: "));
	
	n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
	n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
	
	media = (p1*n1 + p2*n2)/(p1+p2);
	
	JOptionPane.showMessageDialog( null , "Nome: " +nome+ "\n" + "Nota1: " +n1+ "\n" + "Nota2: " +n2+ "\n" + "Media: " +media+ "\n");
	
	}
}