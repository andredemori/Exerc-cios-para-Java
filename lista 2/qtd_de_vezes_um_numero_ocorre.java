/*20.Dada uma seqüência de n números reais, 
determinar os números que compõem a seqüência e 
o número de vezes que cada um deles ocorre na mesma.  
Exemplo: n = 8 
Seqüência: -1.7,  3.0, 0.0, 1.5, 0.0,-1.7, 2.3,-1,7 
Saída:  -1.7 ocorre 3 vezes                     
	3.0 ocorre 1 vez
        0.0 ocorre 2 vezes
        1.5 ocorre 1 vez
        2.3 ocorre 1 vez 
*/ 

import javax.swing.JOptionPane;

public class qtd_de_vezes_um_numero_ocorre
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

    private static int buscar(float v[], int qtd, float chave)
    {
        boolean achou = false;
        int i=0;
        while (!achou && i<qtd)
           if (v[i] == chave)
               achou = true;
           else
               i++;
        return achou?i:-1; 
    }
    
    private static int atualizar(float v[], int cont[], int qtd, float info)
    {
        int pos = buscar(v, qtd, info);
        if (pos==-1)
        {
            v[qtd] = info;
            cont[qtd] = 1;
            qtd++;
        }
        else
            cont[pos]++;
        return qtd;
    }
    
    private static void mostrar(float v[], int cont[], int qtd)
    {
        String resp="";
        for(int i=0; i<qtd; i++)
            resp = resp + v[i]+" ocorre "+cont[i]+" vezes\n"; 
        JOptionPane.showMessageDialog(null, resp);
    }

    public static void main(String s[])
    {
        int i,qtd, max;
        float n, v[];
        int cont[];
        trocaFonte(26);

        max = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de numeros"));
        
        qtd = 0;
        v = new float[max];
        cont = new int[max];

        for (i=0; i<max; i++)
        {
            n = Float.parseFloat(JOptionPane.showInputDialog("Entre com o numero real "+(i+1) + " de "+max));
            qtd = atualizar(v,cont,qtd,n);
        }

        mostrar(v,cont,qtd);
    }
}
