 // contar quantidade de cada vogal em um texto
 
import javax.swing.*;

public class conta_vogais{

    public static void main(String args[]) {
        String line = JOptionPane.showInputDialog("Digite algo: ");
        int vogais = 0;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

        line = line.toLowerCase(); //converter tudo para letras minusculas
        for(int j = 0; j < line.length(); ++j){
            char ch = line.charAt(j);  // charAt retorna o caracter da posição atual em um determinado intervalo
            
			if(ch == 'a'){
				a = a+1;
			}else if(ch == 'e'){
				e = e+1;
			}else if(ch == 'i'){
				i = i+1;
			}else if(ch == 'o'){
				o = o+1;
			}else if(ch == 'u'){
				u = u+1;
			}
            
        }

        System.out.println("Vogal A: " + a);
		System.out.println("Vogal E: " + e);
		System.out.println("Vogal I: " + i);
		System.out.println("Vogal O: " + o);
		System.out.println("Vogal U: " + u);
       
    }
}