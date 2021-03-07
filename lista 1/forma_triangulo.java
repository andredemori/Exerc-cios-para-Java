//ler 3 números e informar: 1 - se formam um triângulo. 2 - Qual o tipo de triângulo: equilátero, isósceles, escaleno
 
import javax.swing.*;

class forma_triangulo{
	
		public static void main(String args[]){
			
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero: "));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero: "));
			int z = Integer.parseInt(JOptionPane.showInputDialog("Digite um n\u00famero: "));

			if((x == 0) || (y == 0) || (z == 0) || (a + b < c) || (a + c < b) || (b + c < a)){
				JOptionPane.showMessageDialog(null, "Nao forma um triangulo.");
		    }else if((x == y) && (y == z)){
				JOptionPane.showMessageDialog(null, "Esses valores formam um triangulo equilatero.");
			}else if((x == y) && (x != z) || (x == z) && (x != y) || (y == z) && (y != x)){
				JOptionPane.showMessageDialog(null, "Esses valores formam um triangulo is\u00f3sceles.");
			}else if((x != y) && (x != z) && (y != z)){
				JOptionPane.showMessageDialog(null, "Esses valores formam um triangulo escaleno.");
			}
			
		}
	}