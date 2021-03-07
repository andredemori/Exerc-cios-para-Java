//ler um inteiro(lado) e mostrar um quadrado usando *

import javax.swing.*;

class desenha_quadrado{
	
		public static void main(String args[]){
	
				int i = 0;
				int j = 1;
				int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (lado): "));
		
			while( j <= x ){
		
				while( i < x ){
					
					System.out.print("*");
					i++;
				}
				
				i = 0;
				System.out.println("");
				j++;
			}
		}
}