import javax.swing.JOptionPane;

class Vetores
{
	float v[];
	int tam_vetor;
	
	public void ler()
	{
		tam_vetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		
		v = new float [tam_vetor];
		
		for(int i = 0 ; i < tam_vetor ; i++)
			v[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
	}
	
	public float somar(Vetores vec)
	{
		float soma = 0;
		
		for(int i = 0 ; i < vec.tam_vetor ; i++)
			soma = soma + vec.v[i];
		
		return soma;
		
	}
	
	public float maior_elemento(Vetores vec)
	{
		
		int l = 0;
		
		float maior = vec.v[l];
		
		for(int i = 0 ; i < vec.tam_vetor ; i++)
		{
			if(v[i] > maior)
				maior = vec.v[i];
		}
		
		return maior;
		
	}
	
	public float menor_elemento(Vetores vec)
	{
		
		int l = 0;
		
		float menor = vec.v[l];
		
		for(int i = 0 ; i < vec.tam_vetor ; i++)
		{
			if(v[i] < menor)
				menor = vec.v[i];
		}
		
		return menor;
		
	}
	
	public float media(Vetores vec)
	{
		float media = vec.somar(vec)/vec.tam_vetor;
	
		return media;
	}
	
}

public class Vetor
{
	public static void main(String args[])
	{
		
		Vetores vec;
		
		vec = new Vetores();
		
		vec.ler();
		System.out.println(vec.somar(vec));
		System.out.println(vec.maior_elemento(vec));
		System.out.println(vec.menor_elemento(vec));
		System.out.println(vec.media(vec));

	}
}