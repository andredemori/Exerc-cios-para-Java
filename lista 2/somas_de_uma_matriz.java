/*
22.Escreva um algoritmo que lê uma matriz M(5,5) e 
calcula as somas: 
   a) da linha 4 de M 
  b) da coluna 2 de M 
  c) da diagonal principal 
  d) da diagonal secundária 
  e) de todos os elementos da matriz M 
Escrever essas somas e a matriz
*/

import javax.swing.*;

public class somas_de_uma_matriz
{
    private static void trocaFonte(int tam)
    {
       for (java.util.Map.Entry<Object, Object> entry : javax.swing.UIManager.getDefaults().entrySet())
       {
           Object key = entry.getKey();
           Object value = javax.swing.UIManager.get(key);
           if (value != null && value instanceof javax.swing.plaf.FontUIResource)
           {
              javax.swing.plaf.FontUIResource fr=(javax.swing.plaf.FontUIResource)value;
              javax.swing.plaf.FontUIResource f = new javax.swing.plaf.FontUIResource(fr.getFamily(), java.awt.Font.PLAIN, tam);
              javax.swing.UIManager.put(key, f);
           }
       }
    }
    public static float SomarLinha(float M[][], int Linha)
    {
        float soma = 0;
        int i;
        for (i=0;i<M[Linha].length;i++)
            soma = soma + M[Linha][i];
        return soma;        
    }
    public static float SomarColuna(float M[][], int Coluna)
    {
        float soma = 0;
        int i;
        for (i=0;i<M.length;i++)
            soma = soma + M[i][Coluna];
        return soma;        
    }
    public static float SomarDiagonalPrincipal(float M[][])
    {
        float soma = 0;
        int i;
        for (i=0;i<M.length;i++)
            soma = soma + M[i][i];
        return soma;        
    }

    public static float SomarDiagonalSecundaria(float M[][])
    {
        float soma = 0;
        int i;
        for (i=0;i<M.length;i++)
            soma = soma + M[i][M.length-i-1];
        return soma;        
    }
    public static float Somatorio(float M[][])
    {
        float soma = 0;
        int i,j;
        for (i=0;i<M.length;i++)
            for (j=0;j<M[i].length;j++)
                soma = soma + M[i][j];
        return soma;        
    }

    public static String StrValores(float M[][])
    {
        String Resp="";
        int i,j;
        for (i=0;i<M.length;i++)
        {
            for (j=0;j<M[i].length;j++)
                Resp = Resp + M[i][j]+ " ";
            Resp = Resp + "\n";
        }
        return Resp;        
    }

    
    public static void main(String []s)
    {
        float M[][];
        int n,i,j;

        trocaFonte(26);

        n = Integer.parseInt(
            JOptionPane.showInputDialog("Entre com a dimencao da matriz"));
        M = new float[n][n];
        for (i=0;i<n;i++)
            for(j=0;j<n;j++)
                M[i][j] = Float.parseFloat(
                JOptionPane.showInputDialog("M["+i+","+j+"]="));
        
        JOptionPane.showMessageDialog(null, "Resultados\n"+
            "\nsomatorio da linha 4 de M  = "+SomarLinha(M,4)+
            "\nsomatorio da coluna 2 de M = "+SomarColuna(M,2)+
            "\nsomatorio da diagonal principal de M = "+SomarDiagonalPrincipal(M)+
            "\nsomatorio da diagonal secundaria de M = "+SomarDiagonalSecundaria(M)+
            "\nsomatorio dos elementos de M = "+Somatorio(M)+
            "\n\n"+StrValores(M));
    }
}