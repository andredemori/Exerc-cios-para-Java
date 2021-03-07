/*23.Faça um algoritmo que leia n valores reais 
e mostre os 5 menores valores do vetor. 
(Não ordene o vetor e mostre o 5 primeiros). 
*/ 

import javax.swing.JOptionPane;

public class cinco_menores_valores_de_um_vetor
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

    private static int IndiceMaior(float V[])
    {
        int i,im;
        im=0;
        for (i=0;i<V.length;i++)
           if (V[i]>V[im])
            im = i;
        return im;
    }

    private static int atualizar(float V[], int qtd, float x)
    {
        if (qtd<V.length)
        {
            V[qtd]=x;
            qtd++;
        }
        else
        {
            int pos = IndiceMaior(V);
            if (V[pos]>x)
                V[pos]=x;
        }

        return qtd;
    }

    public static void main(String s[])
    {
        float V[],num;
        int i,n,qtd;
        String Resp="";
        trocaFonte(26);

        n = Integer.parseInt(
            JOptionPane.showInputDialog("Entre com a quantidade de numeros"));
        V = new float[5];
        qtd = 0;
        for (i=0;i<n;i++)
        {
            num = Float.parseFloat(
                JOptionPane.showInputDialog("entre o valor "+(i+1)+" de "+n));
            Resp = Resp + num+" ";
            qtd = atualizar(V,qtd,num);
        }
        
        Resp = Resp + "\n\nMenores =   "; 
        for(i=0;i<qtd;i++)
            Resp = Resp + V[i]+" ";
                        
        JOptionPane.showMessageDialog(null,Resp);
    }
}
