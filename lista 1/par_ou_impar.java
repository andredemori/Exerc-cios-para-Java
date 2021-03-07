//mostrar se número é par ou impar

import javax.swing.*;

class par_ou_impar{
	
		public static void main(String args[]){
			
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
			
			if((x % 2) == 0){
				
				JOptionPane.showMessageDialog(null, "Esse numero e par.");
				
			}else{
				
				JOptionPane.showMessageDialog(null, "Esse numero e impar.");
			
			}
		}
}