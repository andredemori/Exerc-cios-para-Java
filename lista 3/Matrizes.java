/*Programa para trabalhar com matrizes, onde teremos as seguintes operações: 
  - soma entre matrizes 
  - multiplicação entre matrizes 
  - subtração entre matrizes 
  - Multiplicação por escalar 

*/

import javax.swing.JOptionPane;

class Matriz
{
	private float m[][];
	private int linhas,colunas;
	private float x;
	
	public void ler()
	{
		linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: 	"));
		colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas: "));
		
		m = new float[linhas][colunas];
		
		for(int i = 0 ; i < linhas ; i++){
			for(int j = 0 ; j < colunas ; j++)
				m[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da posicao "+i+"x"+j+": "));
		}
	}
	
	public void somar(Matriz a , Matriz b)
	{
		if(a.linhas != b.linhas || a.colunas != b.colunas)
			JOptionPane.showInputDialog(null, "Matrizes incompativeis. ");
		else{
			linhas = a.linhas; // linhas da matriz c recebe qtd de linhas da matriz a
			colunas = a.colunas;
			
			m = new float[linhas][colunas];
			
			for(int i = 0 ; i < linhas ; i++){
				for(int j = 0 ; j < colunas ; j++)
					m[i][j] = a.m[i][j] + b.m[i][j];
			}
		}
	}
	
	
	public void multiplicar(Matriz a , Matriz b)
	{
		if(a.linhas != b.linhas || a.colunas != b.colunas)
			JOptionPane.showInputDialog(null, "Matrizes incompativeis. ");
		else{
			linhas = a.linhas; // linhas da matriz c recebe qtd de linhas da matriz a
			colunas = a.colunas;
			
			m = new float[linhas][colunas];
			
			for(int i = 0 ; i < linhas ; i++){
				for(int j = 0 ; j < colunas ; j++)
					m[i][j] = a.m[i][j] * b.m[i][j];
			}
		}
	}
	
	public void subtracao(Matriz a , Matriz b)
	{
		if(a.linhas != b.linhas || a.colunas != b.colunas)
			JOptionPane.showInputDialog(null, "Matrizes incompativeis. ");
		else{
			linhas = a.linhas; // linhas da matriz c recebe qtd de linhas da matriz a
			colunas = a.colunas;
			
			m = new float[linhas][colunas];
			
			for(int i = 0 ; i < linhas ; i++){
				for(int j = 0 ; j < colunas ; j++)
					m[i][j] = a.m[i][j] - b.m[i][j];
			}
		}
	}
	
	public void mult_por_escalar(Matriz a , float x)
	{
			linhas = a.linhas; // linhas da matriz c recebe qtd de linhas da matriz a
			colunas = a.colunas;
					
			m = new float[linhas][colunas];
			
			for(int i = 0 ; i < linhas ; i++){
				for(int j = 0 ; j < colunas ; j++)
					m[i][j] = a.m[i][j] * x;
			}
		}
	
	public void escrever(Matriz c)
	{
		
		for(int i = 0 ; i < c.linhas ; i++){
			System.out.println(" ");
				for(int j = 0 ; j < c.colunas ; j++)
					System.out.print(" "+c.m[i][j]+" ");
		}
	}
}
public class Matrizes
{	
		public static void main(String args[])
		{

			Matriz a,b,c,d,e,f,g;
			
			a = new Matriz();
			b = new Matriz();
			c = new Matriz();
			d = new Matriz();
			e = new Matriz();
			f = new Matriz();
			g = new Matriz();
			
			a.ler();
			b.ler();
			
			System.out.println("Soma: ");
			c.somar(a , b);
			c.escrever(c);
			
			System.out.println("\n\nMultiplicacao: ");
			d.multiplicar(a , b);
			d.escrever(d);
			
			System.out.println("\n\nSubtracao: ");			
			e.subtracao(a , b);
			e.escrever(e);
			
			System.out.println("\n\nMultiplicacao por escalar: ");
			float x = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do escalar: ")); 			
			f.mult_por_escalar(a , x);
			f.escrever(f);
			System.out.println("\n");
			g.mult_por_escalar(b , x);
			g.escrever(g);
		}
}