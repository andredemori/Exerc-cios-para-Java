import javax.swing.JOptionPane;

//Faça um programa para ler um número inteiro e mostra-lo em binario com no máximo 16 bits.
public class conversao_binario
{

		private static String calcula_binario(int x)
		{
			
			String sequencia = "";
			String novaString = "";
			int v[];
			v = new int[100];
			int resto;
			
			//calcula binario
			int i = 0;
			while(x > 0){
				resto = (int) x%2;
				v[i] = (int) (x/2);
				x = v[i];
				sequencia +=resto;
				i++;
			}
			
			//inverte o resultado para ficar na ordem correta.
			for(int j = sequencia.length() -1 ; j >= 0 ; j--){
				novaString += sequencia.charAt(j);
			}
			
			int t = novaString.length();
			
			for(int w = t ; w < 16 ; w++){
				novaString = '0' +novaString;
			}

			return novaString;
		}
		
		
		public static void main (String args[])
		{
			
			String novaString = "";

			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
			JOptionPane.showMessageDialog(null, "O numero binario e "+ calcula_binario(num));
			
		}
}

