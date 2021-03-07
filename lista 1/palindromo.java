//leia uma string e informe se é palindrome
import javax.swing.*;

public class palindromo
{
	
	public static void main(String args[])
	{

			StringBuffer buffer = new StringBuffer(JOptionPane.showInputDialog("Digite uma palavra: "));
			
			String palavra = buffer.toString();
			
			StringBuffer reverse = buffer.reverse(); // converte Stringbuffer para String
			
			String reverso = reverse.toString();
			
			System.out.println(palavra);
			System.out.println(reverso);
			
			if(palavra.equals(reverso)){
				System.out.println("E palindromo.");
			}else{
				System.out.println("Nao e palindromo.");
			}
		
	}
}
	