/*
3-) Programa para trabalhar com conjunto de numeros reais, onde teremos as seguintes operações: 
  - Uniao de conjuntos 
  - Interseccao de Conjuntos
  - Pertence
  - Subtracao de conjuntos
  - Contem
  - Esta Contido 
  - Inserir elemento
  - Remover elemento 
*/
import javax.swing.*;

class Conjunto
{
	private float V[];
	private int Qtd;

	public Conjunto()
	{
		V = new float[100];
		Qtd = 0;
	}		

	public Conjunto( int MaxElementos)
	{
		V = new float[MaxElementos];
		Qtd = 0;
	}		

	public void ler()
	{
		float x;
		String r;
		r = JOptionPane.showInputDialog("Entre com um numero inteiro ou cancelar para sair");
		while (r!=null && r.trim().length()!=0)
		{
			incluir(Float.parseFloat(r));
			r = JOptionPane.showInputDialog("Entre com um numero inteiro ou cancelar para sair");
		}
	}

	public String toString()
	{
		String Resp="";
		for (int i=0; i<Qtd; i++)
			Resp = Resp + V[i] + " ";
		return Resp;
	}
	
	public void escrever()
	{
		JOptionPane.showMessageDialog(null, toString());
	}

		
	private int obterIndice(float x)
	{
		int i;
		boolean achou;
		i=0;
		achou = false;
		while (!achou && i<Qtd)
			if (V[i] == x)
				achou = true;
			else
				i++;
		return achou ? i : -1;
	}	
		
	public boolean pertence(float x)
	{	
		return obterIndice(x) > -1;
		/*if (obterIndice(x) > -1)	
			return true;
		else
			return false;*/
	}

	public void remover(float x)
	{	
		int pos = obterIndice(x);
		if (pos>-1)
		{
			V[pos] = V[Qtd-1];
			Qtd--;
		}		
	}

	public void incluir(float x)
	{	
		if (!pertence(x))
		{
			V[Qtd] = x;
			Qtd++;
		}
	}
	
	public void uniao(Conjunto A, Conjunto B)
	{
		Qtd = 0;
		for(int i=0;i<A.Qtd;i ++)
			incluir(A.V[i]);
		for(int i=0;i<B.Qtd;i ++)
			incluir(B.V[i]);
	}
	public void intersecao(Conjunto A, Conjunto B)
	{
		Qtd = 0;
		for(int i=0;i<A.Qtd;i++)
			if (B.pertence( A.V[i] ))
				incluir(A.V[i]);
	}

	public void subtracao(Conjunto A, Conjunto B)
	{
		Qtd = 0;
		for(int i=0;i<A.Qtd;i++)
			if (!B.pertence( A.V[i] ))
				incluir(A.V[i]);
	}
	public boolean contem(Conjunto A)
	{
		boolean ok = true;
		for(int i=0;i<A.Qtd && ok;i++)
			if (!pertence( A.V[i] ))
				ok = false;
		return ok;
	}

	public boolean estaContido(Conjunto A)
	{
		return A.contem(this);
	}

}

public class Conjuntos
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
	Conjunto A,B,C;

	trocaFonte(26);
	A = new Conjunto();
	B = new Conjunto();
	C = new Conjunto();
	
	A.ler();	
	B.ler();

	C.uniao(A,B);
	JOptionPane.showMessageDialog(null, "A="+ A + "\nB=" + B +
		 			    "\nA U B= "+C);
	C.intersecao(A,B);
	JOptionPane.showMessageDialog(null, "A="+ A + "\nB=" + B +
		 			    "\nA ^ B= "+C);
	C.subtracao(A,B);
	JOptionPane.showMessageDialog(null, "A="+ A + "\nB=" + B +
		 			    "\nA - B= "+C);
    }
}