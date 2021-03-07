/* Faça um programa para ler N formas geométricas e após a leitura dos dados, mostrar a área de cada forma geométrica.

	As formas gemométricas podem ser:
	
	1 - quadrado: lado: real
				  área: lado²
				  
	2 - retângulo: base*altura: real
				   área: base*altura
		
	3 - círculo: raio: real
				 área: pi*raio²
	*/



import javax.swing.JOptionPane;

interface IFormaGeo
{
    void ler();
    float area();
    String getNome();
}

abstract class FormaGeo implements IFormaGeo
{
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

class Terreno implements IFormaGeo
{
    private String Descricao;
    private float Area;
    public void ler() 
    { 
	Area = Float.parseFloat( 
			JOptionPane.showInputDialog("Entre com a area ocupada"));
	Descricao = JOptionPane.showInputDialog("Entre com a descricao");

    };
    public float area() { return Area; }
    public String getNome() { return "Terreno"; }	
    public String toString() { return "Terreno "+Descricao+ " com aprox. "+Area+"m2.";}
}

public class ler_n_formas_geometricas_e_mostrar_area_2
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



    private static IFormaGeo criarForma()
    {
	char Letra;
	do{
           Letra = 'X';
 	   String r =  JOptionPane.showInputDialog
                ("Entre com o tipo: (C)irculo, (Q)uadrado, (R)etangulo, (T)riangulo Retangulo ou T(e)rreno");
	   if (r!=null && r.trim().length()>0)
		Letra = r.toUpperCase().charAt(0); 
        }while (Letra!='C' && Letra!='Q' && Letra!='R' && Letra!='T' && Letra!='E');
        switch(Letra)
	{
		case 'C' : return new Circulo();
		case 'Q' : return new Quadrado();
		case 'R' : return new Retangulo();
		case 'T' : return new TrianguloRetangulo();
		case 'E' : return new Terreno();
		default  : return null;
	}
    }

    public static void main(String s[])
    {
        int i,n;
        IFormaGeo v[];
        trocaFonte(26);

        n = Integer.parseInt( JOptionPane.showInputDialog("Entre com a quantidade de poligonos"));
        
        v = new IFormaGeo[n];

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
