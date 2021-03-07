public class Start
{
	public static void main(String args[])
	{
			
		Carro c1 = new Carro();
		
		c1.nome = "Mustang";
		c1.ano  = 1976;	
		
		Pessoa p1 = new Pessoa();
		
		p1.nome  = "Helio";
		p1.idade = 55;
		p1.carro = c1;
		
		p1.carro.andar("69 Km/h"); //objeto carro de pessoa executa o método andar
	}
}