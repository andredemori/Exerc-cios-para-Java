/*
4-) Faça um programa para simular uma conta no banco, o programa deve ter as seguintes operações: 
 
   1- Abrir conta 
   2- Mostrar Saldo 
   3- Realizar Deposito 
   4- Realizar Retirada 
   5- Pagar conta 
   6- Extrato 
   7- Listar as movimentações de Deposito (totalizando no final) 
   8- Listar as movimentações de Retirada (totalizando no final) 
   9- Listar as movimentações de Pagamento (totalizando no final) 
   10- Listar as movimentações de Pagamento (totalizando no final) de um motivo x 
 
Obs: Ao abrir uma conta o usuário deve informar o valor do saldo inicial 
Sempre que o usuario realizar uma movimentacao (Deposito, Retirada, Pagar conta), deverá ser informado o valor e 
no caso de pagamento o motivo (luz, agua, etc). 
*/

import javax.swing.*;

class Movimentacao
{
	public static final int TIPO_DEPOSITO  = 1;
	public static final int TIPO_SAQUE	   = 2;
	public static final int TIPO_PAGAMENTO = 3;
	
	private String Data;
	private float  Valor;
	private int    Tipo;
	private String Descricao;

	public String getData()                  { return Data;       }
	public float  getValor()                 { return Valor;      }
	public int    getTipo()                  { return Tipo;       }
	public String getDescricao()             { return Descricao;  }
	
	public void setData(String Valor)		 { Data = Valor;	  }
	public void setValor(float valor)		 { Valor = valor;	  }
	public void setTipo(int Valor)			 { Tipo = Valor;	  }
	public void setDescricao(String Valor)	 { Descricao = Valor; }

	public void ler()
	{
		Data = JOptionPane.showInputDialog("Digite a data da movimentacao: ");
		Valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: "));
		Tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo: \n 1 - Deposito \n 2 - Saque \n 3 - Pagamento"));
		Descricao = JOptionPane.showInputDialog("Digite a descricao da movimentacao: ");
	}
	
	public String toString()
	{
		String Saida = "";
		Saida = Saida +"Data: "+getData()+" , Valor: "+getValor()+" , Tipo: "+getTipo()+" , Descricao: "+getDescricao();
		
		return Saida;
	}
}

class Conta
{
	private Movimentacao M[];
	private int Qtd;
	private float SaldoInicial;
	private float saldoAtual;

	public void abrirConta(float Saldo)
	{
		SaldoInicial = Saldo;
		saldoAtual = Saldo;
		Qtd = 0;
		M = new Movimentacao[100];
		
	}
	
	public void Saldo()
	{
		JOptionPane.showMessageDialog(null, "Saldo atual: "+saldoAtual);
	}

	public void inserir(Movimentacao M)
	{
		this.M[Qtd] = M; 
		Qtd++;
	}
	
	public void Deposito(float Valor)
	{
		saldoAtual = saldoAtual + Valor;
		
		Movimentacao M = new Movimentacao();
		M.setData(JOptionPane.showInputDialog("Digite a data: "));
		M.setTipo(Movimentacao.TIPO_DEPOSITO);
		M.setValor(Valor);
		M.setDescricao("Deposito");
		inserir(M);
	}
	public void Saque(float Valor)
	{
		saldoAtual = saldoAtual - Valor;
		
		Movimentacao M = new Movimentacao();
		M.setData(JOptionPane.showInputDialog("Digite a data: "));
		M.setTipo(Movimentacao.TIPO_SAQUE);
		M.setValor(Valor);
		M.setDescricao("Saque");
		inserir(M);
	}
	
	public void Pagamento(float Valor, String Motivo)
	{
		saldoAtual = saldoAtual - Valor;
		
		Movimentacao M = new Movimentacao();
		M.setData(JOptionPane.showInputDialog("Digite a data: "));
		M.setTipo(Movimentacao.TIPO_PAGAMENTO);
		M.setValor(Valor);
		M.setDescricao(JOptionPane.showInputDialog("Digite a descricao do pagamento: "));
		inserir(M);
	}
	public void Extrato()
	{
		String Resp = "";
		for(int i = 0 ; i < Qtd ; i++)
			Resp += M[i]+"\n";
		
		JOptionPane.showMessageDialog(null,Resp);
	}
	public void ExtratoDepositos()
	{
		String Resp = "";
		for(int i = 0 ; i < Qtd ; i++){
			if(M[i].getTipo() == Movimentacao.TIPO_DEPOSITO)
				Resp += M[i];
		}
		JOptionPane.showMessageDialog(null,Resp);		
	}
	public void ExtratoRetiradas()
	{
		String Resp = "";
		for(int i = 0 ; i < Qtd ; i++){
			if(M[i].getTipo() == Movimentacao.TIPO_SAQUE)
				Resp += M[i];
		}
		JOptionPane.showMessageDialog(null,Resp);
	}
	public void ExtratoPagamentos()
	{
		String Resp = "";
		for(int i = 0 ; i < Qtd ; i++){
			if(M[i].getTipo() == Movimentacao.TIPO_PAGAMENTO)
				Resp += M[i];
		}
		JOptionPane.showMessageDialog(null,Resp);
	}
	public void ExtratoPagamentos(String Motivo)
	{
		String Resp = "";
		Motivo.toLowerCase().trim();
		for(int i = 0 ; i < Qtd ; i++){
			if(M[i].getTipo() == Movimentacao.TIPO_PAGAMENTO && M[i].getDescricao().toLowerCase().contains(Motivo))
				Resp += M[i];
		}
		JOptionPane.showMessageDialog(null,Resp);
	}
	
}


public class ContaBanco
{
    public static void main(String []s)
    {		
		Conta a;//=null
		a = new Conta();
		
		int opcao = 0;
		
		do{
				
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n 1- Abrir conta \n 2- Mostrar Saldo \n 3- Realizar Deposito \n 4- Realizar Retirada \n 5- Pagar conta \n6- Extrato \n7- Listar as movimentações de Deposito \n8- Listar as movimentações de Retirada \n9- Listar as movimentações de Pagamento \n10- Listar as movimentações de Pagamento de um motivo x \n 11 - SAIR "));
			
			if(opcao == 1)
			{
					float Saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saldo inicial: "));
					a.abrirConta(Saldo);
			}else if(opcao == 2){ 
					a.Saldo();
			}else if (opcao == 3){ 
					float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do deposito: "));
					a.Deposito(valorDeposito);
			}else if (opcao == 4){
					float Valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque: "));
					a.Saque(Valor);
			}else if(opcao == 5){
					String Motivo = JOptionPane.showInputDialog("Digite o motivo do pagamento: ");
					float valor_pagamento  = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do pagamento: "));
					a.Pagamento(valor_pagamento,Motivo);
			}else if(opcao == 6){
					a.Extrato();
			}else if(opcao == 7){
					a.ExtratoDepositos();	
			}else if(opcao == 8){
					a.ExtratoRetiradas();
			}else if(opcao == 9){
					a.ExtratoPagamentos();
			}else if(opcao == 10){
					String Motivo = JOptionPane.showInputDialog("Digite o motivo do pagamento para filtragem: ");
					a.ExtratoPagamentos(Motivo);	
			}else if (opcao == 11){
				JOptionPane.showMessageDialog(null, "Ate logo.");
			}
		}while(opcao != 11);
	}
}