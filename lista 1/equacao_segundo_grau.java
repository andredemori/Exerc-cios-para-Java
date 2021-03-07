//leia 3 números A,B,C e resolva a equação do segundo grau
import javax.swing.*;

public class equacao_segundo_grau
{
	
	public static void main(String args[])
	{
	
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o c: "));
		float xlinha;
		float xlinhalinha;
		
		float delta = (float)((b*b)-(4*a*c));//(float) para ignorar o 'Warning' por causa da perca de precisão
		
		if (delta < 0)
			System.out.println("Nao possui raizes");
		else if (delta == 0){
			xlinha = -b/(2*a);
			System.out.println("Possui 1 raiz real = "+xlinha);
		}else{
		
		xlinha = (float)(-b + Math.sqrt(delta));
		xlinha = xlinha / (2*a);
		xlinhalinha = (float)(-b - Math.sqrt(delta));
		xlinhalinha = xlinhalinha / (2*a);
		
		System.out.println("As ra\u00edzes s\u00e3o: "+xlinha+" e "+xlinhalinha);
		}
	}
}