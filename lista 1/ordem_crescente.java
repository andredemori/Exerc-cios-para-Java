//ler três números e mostra-los em ordem crescente

import javax.swing.*;

class ordem_crescente{
	
		public static void main(String args[]){
			
				float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
			
				float maior = x;
				float mediano = 0;
				float menor = 0;
			
			for(int i = 0 ; i < 2 ; i++){
				
				x = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
				
				if ( x > maior ){
					mediano = maior;
					maior = x;
				}else if ((x < maior) & (x < mediano)){
					menor = x;
				}else if ((x < maior) & (x > menor)){				
					mediano = x;
				}
	
			}
		
		System.out.println(menor + "," + mediano + "," + maior);
		
		}
}