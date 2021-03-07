//Faça um programa que leia um número binário e mostrá-lo em decimal
import javax.swing.JOptionPane;

public class conversao_binario_para_decimal
{


		private static void Converte(String num)
		{
			
			int soma = 0;
			int exp = 0;
			int index;
		
			index = num.length();
		
			while(index != 0){
				if(num.charAt(index-1) == '0'){
					soma = soma + 0;
				}else if(num.charAt(index-1) == '1'){
					soma = (int)(soma + (Math.pow( 2 , exp )));
				}
				exp = exp + 1;
				index = index - 1;
			}
		
			JOptionPane.showMessageDialog(null, "O numero "+num+" em decimal e: "+soma);
		}
		
	
		public static void main (String args[])
		{
			
			String numero = (JOptionPane.showInputDialog("Digite um numero: "));
			
			Converte(numero);
			
		}
}