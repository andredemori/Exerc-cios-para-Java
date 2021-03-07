import javax.swing.*; 

public class jogodavelha
{
	
	public static void main(String args[])
	{
		
		String m[][] = new String[3][3];
		
		for(int w = 0 ; w < 3 ; w++)
		{
			for(int h = 0 ; h < 3 ; h++)
			{
				m[w][h] = "  ";
			}
		}

		int i;
		int j;
		int coluna;
		int linha;
		
		int contador = 0;
		
		while(contador < 9)
		{
		
			linha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da linha"));
			coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da coluna"));
					
			m[linha][coluna] = JOptionPane.showInputDialog("Digite o valor da posição "+linha+", "+coluna+ " (O ou X)");
			
			// mostrar valores
			String resultado = "";
			
			for(i = 0 ; i < 3 ; i++)
			{
				for(j = 0 ; j < 3 ; j++)
				{
					resultado = resultado + m[i][j] + "|";
				}
				resultado = resultado + "\n";
			}
			
			JOptionPane.showMessageDialog(null, resultado);
			
			// possibilidades de vitória do O
			
			if(m[0][0].equals("O") && m[0][1].equals("O") && m[0][2].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[1][0].equals("O") && m[1][1].equals("O") && m[1][2].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[2][0].equals("O") && m[2][1].equals("O") && m[2][2].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][0].equals("O") && m[1][0].equals("O") && m[2][0].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][1].equals("O") && m[1][1].equals("O") && m[2][1].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][2].equals("O") && m[1][2].equals("O") && m[2][2].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][0].equals("O") && m[1][1].equals("O") && m[2][2].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][2].equals("O") && m[1][1].equals("O") && m[2][0].equals("O"))
			{
				JOptionPane.showMessageDialog(null, "O venceu.\n"+ resultado);
				System.exit(0);
			}
			
			// possibilidades de votória do X
			
			if(m[0][0].equals("X") && m[0][1].equals("X") && m[0][2].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[1][0].equals("X") && m[1][1].equals("X") && m[1][2].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[2][0].equals("X") && m[2][1].equals("X") && m[2][2].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][0].equals("X") && m[1][0].equals("X") && m[2][0].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][1].equals("X") && m[1][1].equals("X") && m[2][1].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][2].equals("X") && m[1][2].equals("X") && m[2][2].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][0].equals("X") && m[1][1].equals("X") && m[2][2].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
			
			if(m[0][2].equals("X") && m[1][1].equals("X") && m[2][0].equals("X"))
			{
				JOptionPane.showMessageDialog(null, "X venceu.\n"+ resultado);
				System.exit(0);
			}
		
			contador++;
	
		}
		
		String resultado = "";
		
		for(i = 0 ; i < 3 ; i++)
		{
			for(j = 0 ; j < 3 ; j++)
			{
				resultado = resultado + m[i][j] + "|";
			}
			resultado = resultado + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Velha\n"+ resultado);

	}
}