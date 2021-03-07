/*
4-) Faça um programa para simular uma conta no banco, o programa dever ter as seguintes operações: 
 
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
sempre que o usuario realizar uma movimentacao (Deposito, Retirada, Pagar conta), deverá ser informado o valor e 
no caso de pagamento o motivo (luz, agua, etc). 
*/

import javax.swing.*;

class Movimentacao
{
	public static final int TIPO_DEPOSITO  = 1;
	public static final int TIPO_RETIRADA  = 2;
	public static final int TIPO_PAGAMENTO = 3;
	public static final String _STR_TIPO_[] = new String[]{"Deposito","Retirada","Pagamento"};
 
	private String Data;
	private float  Valor;
	private int    Tipo;
	private String Descricao;

	public String getData()                  { return Data;       }
	public float  getValor()                 { return Valor;      }
	public int    getTipo()                  { return Tipo;       }
	public String getDescricao()             { return Descricao;  }
	public void   setData(String valor)      { Data = valor;      }
	public void   setValor(float valor)      { Valor = valor;     }
	public void   setTipo(int valor)         { Tipo = valor;      }
	public void   setDescricao(String valor) { Descricao = valor; }


	public void ler()
	{
		Data = JOptionPane.showInputDialog("Entre com Data da operação");	
		do{
			Tipo = Integer.parseInt(JOptionPane.showInputDialog("1 - Deposito\n2-Retirada\n3-Pagamento"));
		}while (Tipo<1 || Tipo>3);
		Valor = Float.parseFloat(JOptionPane.showInputDialog("Entre com o Valor:"));
		Descricao = JOptionPane.showInputDialog("Entre com a descriçao da movimentacao");
	}

	public String toString()
	{
		String Resp=Data+"\t ";
		Resp = Resp + _STR_TIPO_[Tipo-1] + "\t ";
		Resp = Resp + "R$"+ Valor +"\t "+Descricao;
		return Resp;
	}
	
	public void escrever()
	{
		JOptionPane.showMessageDialog(null, 
		  "Data:"+Data+"\nTipo:"+ _STR_TIPO_[Tipo-1]+"\nValor:"+Valor+"\nDescricao:"+Descricao);
	}
}

class Conta
{
	private Movimentacao          M[];
	private int 	              Qtd;	
	private float 	     SaldoInicial;

	public Conta(float Saldo)
	{
		SaldoInicial = Saldo;
		Qtd = 0;
		M = new Movimentacao[100];
	}
	
	public float saldo()
	{
		float calculado=SaldoInicial;
		for(int i=0;i<Qtd;i++)
			calculado = calculado + M[i].getValor();
		return calculado;
	}
	public void inserir(Movimentacao M)
	{	
		if (Qtd>=100)
			JOptionPane.showMessageDialog(null,"Vc ja Alcançou o limite maximo de movimentaçoes desta versao trial!");
		else
		{		
			this.M[Qtd] = M;
			Qtd++;
		}
			
	}	
	public void deposito(float Valor)
	{
		Movimentacao M = new Movimentacao();
		M.setData("17/10/2018");
		M.setTipo(Movimentacao.TIPO_DEPOSITO);
		M.setValor(Math.abs(Valor));
		M.setDescricao(""); 
		inserir(M);
	}
	public void saque(float Valor)
	{
		Movimentacao M = new Movimentacao();
		M.setData("17/10/2018");
		M.setTipo(Movimentacao.TIPO_RETIRADA);
		M.setValor(-Math.abs(Valor));
		M.setDescricao(""); 
		inserir(M);
	}
	public void pagamento(float Valor, String Motivo)
	{
		Movimentacao M = new Movimentacao();
		M.setData("17/10/2018");
		M.setTipo(Movimentacao.TIPO_PAGAMENTO);
		M.setValor(-Math.abs(Valor));
		M.setDescricao(Motivo); 
		inserir(M);
	}
	public void extrato()
	{
		float Total=SaldoInicial;
		String Resp = "";
		for(int i=0;i<Qtd;i++)
		{
			Resp += M[i]+"\n";
			Total += M[i].getValor();
		}
		Resp += "Total = R$ "+Total;
		JOptionPane.showMessageDialog(null, Resp);
	}
	public void extratoDepositos()
	{
		float Total=0;
		String Resp = "";
		for(int i=0;i<Qtd;i++)
			if (M[i].getTipo() == Movimentacao.TIPO_DEPOSITO)
			{
				Resp += M[i]+"\n";
				Total += M[i].getValor();
			}
		Resp += "Total = R$ "+Total;
		JOptionPane.showMessageDialog(null, Resp);
	}
	public void extratoRetiradas()
	{
		float Total=0;
		String Resp = "";
		for(int i=0;i<Qtd;i++)
			if (M[i].getTipo() == Movimentacao.TIPO_RETIRADA)
			{
				Resp += M[i]+"\n";
				Total += M[i].getValor();
			}
		Resp += "Total = R$ "+Total;
		JOptionPane.showMessageDialog(null, Resp);
	}
	public void extratoPagamentos()
	{
		float Total=0;
		String Resp = "";
		for(int i=0;i<Qtd;i++)
			if (M[i].getTipo() == Movimentacao.TIPO_PAGAMENTO)
			{
				Resp += M[i]+"\n";
				Total += M[i].getValor();
			}
		Resp += "Total = R$ "+Total;
		JOptionPane.showMessageDialog(null, Resp);
	}
	public void extratoPagamentos(String Motivo)
	{
		float Total=0;	
	        String Resp = "";
		Motivo = Motivo.toLowerCase().trim();
		for(int i=0;i<Qtd;i++)
			if (M[i].getTipo() == Movimentacao.TIPO_PAGAMENTO && M[i].getDescricao().toLowerCase().contains(Motivo))
			{
				Resp += M[i]+"\n";
				Total += M[i].getValor();
			}
		Resp += "Total = R$ "+Total;
		JOptionPane.showMessageDialog(null, Resp);	
	}
}


public class ContaBanco2
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

    private static int menu()
    {
	 int opc;
	 do{
	    opc = Integer.parseInt( JOptionPane.showInputDialog(
			"1- Abrir conta\n2- Mostrar Saldo\n3- Realizar Deposito\n"+
        		"4- Realizar Retirada\n5- Pagar conta\n6- Extrato\n"+
        		"7- Listar as movimentações de Deposito\n"+
   			"8- Listar as movimentações de Retirada\n"+
   			"9- Listar as movimentações de Pagamento\n"+
   			"10- Listar as movimentações de Pagamento de um motivo x \n"+
        		"11- Sair\nEntre com a sua Opcao:"));
	 }while (opc<1 || opc>11);
	 return opc;
    }

    public static void main(String []s)
    {
	trocaFonte(26);
	Conta c=new Conta(0);
	Movimentacao m;
	boolean Fim = false;
	while (!Fim)
	{
		switch(menu())
		{
			case 1: c = new Conta( Float.parseFloat( JOptionPane.showInputDialog("Entre com o saldo inicial")));
				break;
			case 2: JOptionPane.showMessageDialog(null,"Saldo = R$ "+c.saldo());
				break;
			case 3: c.deposito(Float.parseFloat( JOptionPane.showInputDialog("Entre a valor depositado")));
				break; 
			case 4: c.saque(Float.parseFloat( JOptionPane.showInputDialog("Entre a valor retirado")));
				break; 
			case 5: c.pagamento(Float.parseFloat( JOptionPane.showInputDialog("Entre a valor do pagamento")), 
					JOptionPane.showInputDialog("Entre com o motivo"));
				break; 
			case 6: c.extrato();
				break;
			case 7: c.extratoDepositos();
				break;
			case 8: c.extratoRetiradas();
				break;
			case 9: c.extratoPagamentos();
				break;
			case 10: c.extratoPagamentos(JOptionPane.showInputDialog("Entre com o motivo para filtar"));
				break;
			case 11: Fim = true;
				break;
			default: System.out.println("Opcao invalida!");	
				break;	
		}
	}
    }
}