//ler um número e informar se é primo
import javax.swing.*;

public class numero_primo
{
	
	public static void main(String args[])
	{
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		if((x == 2) | (x == 3) | (x == 5) | (x == 7) | (x == 11) | (x == 19))
		{
			System.out.println("E primo");
		}else if(((x%2) == 0) | ((x%3) == 0) | ((x%5) == 0) | ((x%7) == 0) | ((x%11) == 0) | ((x%19) == 0))
		{
			System.out.println("Nao e primo.");
		}else
		{
			System.out.println("E primo.");
		}
	}
}