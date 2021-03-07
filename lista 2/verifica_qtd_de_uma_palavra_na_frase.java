// Dados dois Strings (um contendo uma frase e outro contendo uma palavra) determine o número de vezes que a palavra ocorre na frase.
import javax.swing.JOptionPane;

public class verifica_qtd_de_uma_palavra_na_frase
{
	
	
	private static void verifica(String palavra,String frase)
	{	
		
		int j = palavra.length();
		int p = frase.length();
		
		char [] v = new char[j];
		char [] vec = new char[p];
		
		int i = 0;
		int c = 0;
		
		while(i < j){
			v[i] = palavra.charAt(i); // armazena a palavra em um vetor
			i++;
		}

 		while(c < p){
			vec[c] = frase.charAt(c); // armazena a frase em um vetor
			c++;
		}
		
		////////////////////////////////////

		int quant = 0;
		
		int h;
		
		char [] aux = new char[j];
		
		for(int k = 0 ; k < p ; k++){	//	varre a frase	
		
			h = k;
		
			for(int l = 0 ; l < j ; l++){ // varre a palavra
				if(h < p){
					if(h == k){
						if(v[l] == vec[h]){ // se l no vetor palavra for igual h no vetor frase      0,0 1,1 2,2 | 0,1 1,2 2,3
							aux[l] = v[l]; //vetor aux recebe a palavra
							if(h < p){
								h = h+1;
							}
						}else{
							if(h < p){
								h = h+1;
							}
						}
						
					}else{		
						if(v[l] == vec[h]){ // se l no vetor palavra for igual h no vetor frase      0,0 1,1 2,2 | 0,1 1,2 2,3
							aux[l] = v[l];//vetor aux recebe a palavra
							if(h < p){
								h = h + 1;
							}
						}else{
							if(h < p){
								h = h + 1;
							}
						}
					}
				}
			}
		
			
				//soma quantidade depois de ler uma sequencia de caracteres do tamanho da palavra e armazenar no aux
					int r = 0;
					
					for(int z = 0 ; z < j ; z++){
						if(aux[z] == v[z]){
							r = r+1;
						}
						if(r == j){
							quant = quant + 1; 
						}
					}
				//--
			
			//zera aux logo após somar a quantidade
				for(int e = 0 ; e < j ; e++){
					aux[e] = 0;
				}
			// --
			
		}

		System.out.println("O n\u00famero de vezes que a palavra '"+palavra+"' aparece na frase '"+frase+"' \u00e9 "+quant);

	}
	
	
	public static void main(String args[])
	{

		String word = (JOptionPane.showInputDialog("Digite uma palavra: "));
		String phrase = (JOptionPane.showInputDialog("Digite uma frase: "));

		verifica(word,phrase);
		
	}
}