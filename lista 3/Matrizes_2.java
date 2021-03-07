/*
1-) Programa para trabalhar com matrizes, onde teremos as seguintes operações: 
  - soma entre matrizes 
  - multiplicação entre matrizes 
  - subtração entre matrizes 
  - Multiplicação por escalar
*/
import javax.swing.*;

class Matriz
{
	private float M[][];
	private int Linhas,Colunas;

	public void ler()
	{
		Linhas = Integer.parseInt( JOptionPane.showInputDialog("Entre com o numero de linhas"));
		Colunas = Integer.parseInt( JOptionPane.showInputDialog("Entre com o numero de colunas"));
		M = new float[Linhas][Colunas];
		for (int i=0; i<Linhas; i++)
			for (int j=0; j<Colunas; j++)
				M[i][j] = Float.parseFloat( JOptionPane.showInputDialog (
					"Matriz["+i+","+j+"]=") );
	}

	public String toString()
	{
		String Resp="";
		for (int i=0; i<Linhas; i++)
		{
			for (int j=0; j<Colunas; j++)
				Resp = Resp + M[i][j] + " ";
			Resp = Resp + "\n";
		}
		return Resp;
	}
	
	public void escrever()
	{
		JOptionPane.showMessageDialog(null, toString());
	}

	public void somar(Matriz A, Matriz B)
	{	
		if (A.Linhas != B.Linhas || A.Colunas!=B.Colunas)
			throw new Error("Matrizes incompativeis para a soma");
		else
		{
			Linhas = A.Linhas;
			Colunas = A.Colunas;
			M = new float[Linhas][Colunas];
			for (int i=0; i<Linhas; i++)
				for (int j=0; j<Colunas; j++)
					M[i][j] = A.M[i][j] + B.M[i][j];
		}
	}
	public void multiplicar(Matriz A, Matriz B)
	{
		if (A.Colunas != B.Linhas)
			throw new Error("Matrizes incompativeis para a multiplicacao");
		else
		{
			Linhas = A.Linhas;
			Colunas = B.Colunas;
			M = new float[Linhas][Colunas];
			for (int i=0; i<Linhas; i++)
				for (int j=0; j<Colunas; j++)
				{
					M[i][j] = 0;
					for (int k=0; k<A.Linhas;k++)
						M[i][j] = M[i][j] + A.M[i][k] * B.M[k][j];
				}
		}
	}

	public void multiplicar(Matriz A, float x)
	{
		Linhas = A.Linhas;
		Colunas = A.Colunas;
		M = new float[Linhas][Colunas];
		for (int i=0; i<Linhas; i++)
			for (int j=0; j<Colunas; j++)
				M[i][j] = A.M[i][j] * x;
	}
}

public class Matrizes_2
{
    private static void trocaFonte(int tam)
    {
       for (java.util.Map.Entry<Object, Object> entry : javax.swing.UIManager.getDefaults().entrySet())
       {
           Object key = entry.getKey();
           Object value = javax.swing.UIManager.get(key);
           if (value != null && value instanceof javax.swing.plaf.FontUIResource)
           {
              javax.swing.plaf.FontUIResource fr=(javax.swing.plaf.FontUIResource)value;
              javax.swing.plaf.FontUIResource f = new javax.swing.plaf.FontUIResource(fr.getFamily(), java.awt.Font.PLAIN, tam);
              javax.swing.UIManager.put(key, f);
           }
       }
    }

    public static void main(String []s)
    {
	Matriz A,B,C,D,E;
        float x;

	trocaFonte(26);
	A = new Matriz();
	B = new Matriz();
	C = new Matriz();
	D = new Matriz();
	E = new Matriz();

	A.ler();
	B.ler();
	C.somar(A,B);
	D.multiplicar(A,B);

	x = Float.parseFloat(JOptionPane.showInputDialog("Entre com um valor real"));
	
	E.multiplicar(A,x);

	JOptionPane.showMessageDialog(null, "Soma:\n"+
		"A=\n"+A+"B=\n"+B+"A+B=\n"+C);	
	JOptionPane.showMessageDialog(null, "Multiplicacao :\n"+
		"A=\n"+A+"B=\n"+B+"AxB=\n"+D);
	JOptionPane.showMessageDialog(null, "Multiplicacao :\n"+
		"A=\n"+A+"A x "+x+"=\n"+E);
    }
}