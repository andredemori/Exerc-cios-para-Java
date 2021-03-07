// Dados uam sequência de números inteiros, mostre-os em ordem crescente. - selection sort
import javax.swing.JOptionPane;

public class selection_sort
{
	
	private static void ordena_vetor(int q)
	{
		
		int v[];
		v = new int[q];
		
		//insere os numeros no vetor
		for(int j = 0 ; j < q ; j++){
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			v[j] = n;
		}

		//ordena
		int t;	
		
		for(int z = 0 ; z < q-1 ; z++){
			for(int w = z ; w < q ; w++){
				if(w < q-1){
					if(v[z] > v[w+1]){
						t = v[z]; 
						v[z] = v[w+1]; 
						v[w+1] = t; 
					}
				}
			}
		}
		
		//mostra
		for(int a = 0 ; a < q ; a++){
			System.out.print(v[a]);
		}
	}

	
	public static void main(String args[])
	{

		int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros da sequencia: "));
		
		ordena_vetor(quant);
		
	}
	
}