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

class ler_formas_geometricas_e_mostrar_area
{
	
		private static double quadrado(double lado)
		{
			double area_quadrado;
						
			area_quadrado = lado*lado;
			
			return area_quadrado;
		}
		
		private static double retangulo(double base, double altura)
		{
			double area_retangulo;
						
			area_retangulo = base*altura;
			
			return area_retangulo;
		}
		
		
		private static double circulo(double raio)
		{
			double area_circulo;
						
			area_circulo = 3.14*raio*raio;
			
			return area_circulo;
		}
		
		
		public static void main(String args[])
		{
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do lado do quadrado: "));
			JOptionPane.showMessageDialog(null, "\u00c1rea do quadrado = "+quadrado(lado));
			
			double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da base do retangulo: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da altura do retangulo: "));
			JOptionPane.showMessageDialog(null, "\u00c1rea do ret\u00e2ngulo = "+retangulo(base,altura));

			double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do raio do circulo: "));
			JOptionPane.showMessageDialog(null, "\u00c1rea do c\u00edrculo = "+circulo(raio));	
		}
}