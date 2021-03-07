/*
5-)Faça um programa para simular um caixa de supermercado. 
   Primeiro o programa deve ler a tabela de precos (nome, codigo e preco) de todos os produtos (no maximo 100).
   Depois o programa entra em um loop, para ler as compras de um cliente. 
   o programa deve listar as compras, e mostrar o valor a ser pago.*/

import javax.swing.*;

class Produto
{
	private int    codigo;
	private float  preco;
	private String nome;

	public float  getPreco()                 { return preco;   }
	public String getNome()             	 { return nome;    }
	public int    getCodigo()             	 { return codigo;  }
	public void   setCodigo(int valor)       { codigo = valor; }
	public void   setNome(String valor)      { nome = valor;   }
	public void   setPreco(float valor)      { preco = valor;  }
	

	public void ler()
	{
		codigo = Integer.parseInt( JOptionPane.showInputDialog("Entre com o codigo"));
		if (codigo>0)
		{
			nome   = JOptionPane.showInputDialog("Entre com o nome");
			preco  = Float.parseFloat( JOptionPane.showInputDialog("Entre com o preco unitario"));
		}	
	}

	public String toString()
	{
		return codigo+" "+nome+" "+preco;
	}
	
	public void escrever()
	{
		JOptionPane.showMessageDialog(null,"Codigo:"+codigo+"\nNome:"+nome+"\nPreco:"+preco);
	}
}

class TabelaPrecos
{
	private Produto          Vet[];
	private int 	         Qtd;	

	public TabelaPrecos()
	{
		Qtd = 0;
		Vet = new Produto[100];
	}
	
	public float obterPreco(int codigo)
	{
		Produto P = obterProduto(codigo);
		return P!=null? P.getPreco() : -1;
	}

	public void inserir(Produto P)
	{
		Vet[Qtd] = P;
		Qtd++;
	}	

	public boolean existe(int codigo)
	{
		return obterProduto(codigo) != null;	
	}

	public Produto obterProduto(int codigo)
	{
		boolean Achou = false;	
		int i=0;
		while (!Achou && i<Qtd)
		    if (Vet[i].getCodigo()==codigo)
			Achou = true;
		    else
		       i++;
		return Achou?Vet[i]:null;
	}	
	public void ler()
	{
		Produto P;
		do{
			P = new Produto();
			P.ler();
			if (P.getCodigo()>0)
			   inserir(P);
		}while (P.getCodigo()>0 && Qtd<100);
	}
}

class ItemCompra
{
	private int     qtd;
	private Produto prod;

	public Produto getProduto()       { return prod;           }
	public int getQtd()               { return qtd;            }
    public void setProduto(Produto P) { prod = P;              }
    public void setQtd(int valor)	  { qtd = valor;           }
	public float Total()		  { return qtd * prod.getPreco(); } 
}

class Compra
{
	private ItemCompra Vet[];
	private int 	     Qtd;
	private TabelaPrecos tab;
	public Compra(TabelaPrecos tab) 
	{
		Qtd = 0;
		Vet = new ItemCompra[100];
		this.tab = tab;
	}
	
	private void inserir(ItemCompra c)
	{
		Vet[Qtd] = c;
		Qtd++; 
	}
	
	public void ler()    
	{
		int codigo;
		Produto p;
		do{
			codigo = Integer.parseInt( JOptionPane.showInputDialog("Entre com o codigo do produto" ) );
			p = tab.obterProduto(codigo);
			if (p!=null)
			{
				ItemCompra item = new ItemCompra();
				item.setProduto(p);
				item.setQtd(Integer.parseInt( JOptionPane.showInputDialog("Entre com a quantidade do produto "+p.getNome() + " preco:"+p.getPreco() ) ) );	
				inserir(item);		
			}
		}while( Qtd<100 && codigo>0);
				 
	}
	public float Total() 
	{
		float total = 0;
		for(int i=0;i<Qtd;i++)
			total = total + Vet[i].Total();
		return total; 
	}

	public void listar() 
	{
		String Resp="";
		for(int i=0;i<Qtd;i++)
			Resp = Resp + Vet[i].getProduto().getCodigo()+" "+Vet[i].getProduto().getNome()+" "+Vet[i].getProduto().getPreco()+" x "+Vet[i].getQtd()+ " = "+ Vet[i].Total()+"\n";
		Resp = Resp + "Valor Total: "+Total();
		JOptionPane.showMessageDialog(null,Resp);
	}
}


public class SuperMercado2
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
	trocaFonte(26);
	TabelaPrecos t = new TabelaPrecos();
	Compra c = new Compra(t);
	t.ler();
	c.ler();
	c.listar();
    }
}