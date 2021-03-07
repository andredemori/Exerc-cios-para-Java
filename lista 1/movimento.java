/*ler uma sequencia de comandos de movimento e informar a posição x,y final. 
Suponha que a origem é o 0,0 e o soldado esta vindo pela direita.
Comandos: L - left   | virar para esquerda
		  R - right  | virar para direita
		  T - top    | virar para cima
		  B - bottom | virar para baixo
		  M - move   | andar para frente
		  
		  ex: BMMMRMMMMTM
		  
		   ->(0,0)
		  .(1,0)
		  .
		  .       . -fim  (4,-2) coordenadas plano cartesiano
		  . . . . .


*/
import javax.swing.*;

class movimento{
	
		public static void main(String args[]){
			
			int i,x,y,Dx,Dy;
			
			 x = y = Dy = 0;
			 Dx = 1;
			
			String Comandos = JOptionPane.showInputDialog("Digite o movimento desejado: ");
			Comandos = Comandos.toUpperCase();
		
				for(i = 0 ; i < Comandos.length(); i++){
					
					switch(Comandos.charAt(i)){
						
						case 'L': Dx = -1;
								  Dy =  0;
						break;
						
						case 'R': Dx =  1;
								  Dy =  0;
						break;	
						
						case 'T': Dx =  0;
								  Dy =  1;
						break;						
						
						case 'B': Dx =  0;
								  Dy =  -1;
						break;
						
						case 'M': x = x + Dx;
								  y = y + Dy;
						break;
						
						default:
							System.out.println("Caracter ["+Comandos.charAt(i)+"] na posicao " + i + " invalido!");
							
							
					}
					JOptionPane.showMessageDialog(null, "Posicao do soldado: \n x: "+x+" y: "+y);
				}
		
		}		
			
	}