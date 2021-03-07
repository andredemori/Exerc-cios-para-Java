import javax.swing.JOptionPane;

abstract class FormaGeo
{
    public abstract void ler();
    public abstract float area();
    public abstract String getNome();
    public String toString()	{ return getNome() + " area:"+ area(); }
}

class Quadrado extends FormaGeo
{
	private float Lado;
	public void ler()
	{
		Lado = Float.parseFloat( 
			JOptionPane.showInputDialog("Entre com valor do lado"));
	}
	public float area()		{ return Lado*Lado;  }
	public String getNome() 	{ return "Quadrado"; }
	
}

class Circulo extends FormaGeo
{
	private float Raio;
	public void ler()
	{
		Raio = Float.parseFloat( 
			JOptionPane.showInputDialog("Entre com valor do Raio"));
	}
	public float area()		{ return Raio*Raio*3.1415f;  }
	public String getNome() 	{ return "Circulo";          }
}

class Retangulo extends FormaGeo
{
	private float Base,Altura;
	public void ler()
	{
		Base = Float.parseFloat( 
			JOptionPane.showInputDialog("Entre com valor da Base"));
		Altura = Float.parseFloat( 
			JOptionPane.showInputDialog("Entre com valor da Altura"));
	}
	public float area()		{ return Base*Altura;  }
	public String getNome() 	{ return "Retangulo";  }
}

class TrianguloRetangulo extends Retangulo
{
	public float area()		{ return super.area()/2;  }
	public String getNome() 	{ return "Triangulo Retangulo";  }
}

public class ler_n_formas_geometricas_e_mostrar_area
{
    private static FormaGeo criarForma()
    {
	char Letra;
	do{
       Letra = 'X';
 	   String r =  JOptionPane.showInputDialog
                ("Entre com o tipo: (C)irculo, (Q)uadrado, (R)etangulo ou (T)riangulo Retangulo");
	   if (r!=null && r.trim().length()>0)
		Letra = r.toUpperCase().charAt(0); 
        }while (Letra!='C' && Letra!='Q' && Letra!='R' && Letra!='T');
        switch(Letra)
	{
		case 'C' : return new Circulo();
		case 'Q' : return new Quadrado();
		case 'R' : return new Retangulo();
		case 'T' : return new TrianguloRetangulo();
		default  : return null;
	}
    }

    public static void main(String s[])
    {
        int i,n;
        FormaGeo v[];
		
        n = Integer.parseInt( JOptionPane.showInputDialog("Entre com a quantidade de poligonos"));
        
        v = new FormaGeo[n];

        for (i=0; i<n; i++)
        {
			v[i] = criarForma();
			v[i].ler();
        }

	String resp="As formas geometricas foram:\n";
	for (i=0; i<n; i++)
		resp += (i+1) + "- " + v[i] +"\n";
	JOptionPane.showMessageDialog(null, resp);
    }
}
