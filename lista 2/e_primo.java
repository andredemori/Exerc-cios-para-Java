import javax.swing.*;
import java.lang.Math;

public class teste
{
	
	private static boolean e_primo(int n)
	{
	
		boolean eh = true;
		int i = 2;
											
		while(i < n)
			if(n % i == 0)
				eh = false;
			else
				i++;
			return eh;
	}

	
	public static void main(String s[])
	{
		
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro: "));
		
		if(e_primo(x))
			JOptionPane.showMessageDialog(null, "O numero e primo. ");
		else
			JOptionPane.showMessageDialog(null, "O numero nao e primo. ");

	}
}