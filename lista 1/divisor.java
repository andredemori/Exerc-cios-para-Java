//leia um numero inteiro e liste os seus divisores
import javax.swing.*;

public class divisor
{
	
	public static void main(String args[])
	{
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		int y = 1;
		
		while(y < x){
			if((x%y) == 0){
				System.out.println(y+" e divisor de "+x);
				y = y + 1;
			}else{
				y = y + 1;
			}
		}
	}
}