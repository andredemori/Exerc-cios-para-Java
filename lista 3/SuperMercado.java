/*
5-)Faça um programa para simular um caixa de supermercado. 
   Primeiro o programa deve ler a tabela de precos (nome, codigo e preco) de todos os produtos (no maximo 100).
   Depois o programa entra em um loop, para ler as compras de um cliente. 
   o programa deve listar as compras, e mostrar o valor a ser pago.*/

import javax.swing.*;

class Produto
{
	private int    Codigo;
	private float  Preco;
	private String Nome;

	public float  getPreco()                 { return Preco;   }
	public String getNome()             	 { return Nome;    }
	public int    getCodigo()             	 { return codigo;  }
	
	public void   setCodigo(int valor)       { Codigo = valor; }
	public void   setNome(String valor)      { Nome = valor;   }
	public void   setPreco(float valor)      { Preco = valor;  }
	

	public void ler()
	{
		Codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
		Nome = JOptionPane
		Preco = Float.parseFloat()
	}

	public String toString()
	{
	}
	
	public void escrever()
	{
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
	}
	public void inserir(Produto P)
	{
	}	
	public boolean existe(int P)
	{
	}
	public Produto obterProduto(int codigo)
	{
	}	
	public void ler()
	{
	}
}

class ItemCompra
{
	private int Codigo_Item;
	private int Qtd;

	public int getCodigo_Item	{	return Codigo_Item	};
	public int getQtd			{ 	return Qtd	 		};
	
	public void setCodigo_Item(int valor) {	Codigo_Item = valor		};
	public void set setQtd(int valor) 	  {	Qtd = valor	    		};
	
}

class Compra
{
	private ItemCompra Vet[];
	private int 	     Qtd;
	private TabelaPrecos tab;
	public Compra(TabelaPrecos tab) {}
	public void ler()    { }
	public float Total() { }
	public void listar() { }
}


public class SuperMercado
{
	
    public static void main(String []s)
    {

    }
}