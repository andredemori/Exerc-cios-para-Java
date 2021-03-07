/* Dadas duas sequências com n números inteiros entre 0 e 9 interptretadas como dois números inteiros de n algarismos,
calcular a sequência de números que representa a soma dos dois inteiros.
 Exemplo n = 8 
 1 sequencia:   8 2 4 3 4 2 5 1
 2 sequencia: + 3 3 7 5 2 3 3 7
              1 1 6 1 8 6 5 8 8 */
import javax.swing.JOptionPane;

public class ler_duas_sequencias_que_formam_dois_numeros_e_somar
{
	
	private static int soma (int n)
	{
		
		String seq1 = "";
		String seq2 = "";
		String aux;
		String aux2;
	
		for(int i = 0 ; i <= n-1 ; i++)
		{
			aux = JOptionPane.showInputDialog("Digite um numero:(seq1) ");
			seq1 = seq1+aux;
		}
		
		for(int i = 0 ; i <= n-1 ; i++)
		{
			aux2 = JOptionPane.showInputDialog("Digite um numero:(seq2) ");
			seq2 = seq2+aux2;
		}
		
		int num1 = Integer.parseInt(seq1);
		int num2 = Integer.parseInt(seq2);
		
		int soma = num1 + num2;
		
		return soma;
		
	}
	
	public static void main(String args[])
	{
	
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da sequencia: 0-9"));

		
		JOptionPane.showMessageDialog(null, "Soma dos numeros = "+soma(numero));
		
	}
}
