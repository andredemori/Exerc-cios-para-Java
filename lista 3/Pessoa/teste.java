import javax.swing.JOptionPane;

public class teste
{
	public static void main(String args[])
	{
		Pessoa p1 = new Pessoa(); // cria objeto pessoa chamado p1
		
		p1.idade = 22;
		p1.nome = "Andre";
		p1.peso = 55.0;
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Joao";
		p2.idade = 18;
		p2.peso = 55.0;
	
		System.out.println(p1.nome);
		p1.andar();
		p2.idade();
	}
	
}