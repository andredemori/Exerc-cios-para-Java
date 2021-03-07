public class Pessoa
{
	//atributos da classe
	public String nome;
	public int idade;
	public double peso;

	//métodos da classe
	public void andar()
	{
		System.out.println(this.nome+" andando"); // this serve para referenciar um atributo ou método dentro da classe - opcional
	}
	
	public void idade()
	{
		System.out.println(this.nome+" tem "+this.idade+" anos.");
	}
	
}