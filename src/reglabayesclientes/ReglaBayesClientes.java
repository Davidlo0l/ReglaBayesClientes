/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglabayesclientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Davidlo0l
 */
public class ReglaBayesClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Datos dat=new Datos();
    
        double n1,n2,m,d,r,s = 0;
      

          String BuenCliente=JOptionPane.showInputDialog("REGLA BALLESIANA CLIENTES COMPAÑIA SEGUROS"  + 
            "\n"+"Buen Cliente"+  
            "\n"+"[1] Si "+
            "\n"+"[2] No "
                  );
           String Edad=JOptionPane.showInputDialog("¿EL CLIENTE TIENE HIJOS : ?"  +   
            "\n"+"[1] Si "+
            "\n"+"[2] No  ");
          String TieneHijos=JOptionPane.showInputDialog("ELIJA EL TIPO DE CLIENTE"  +   
            "\n"+"[1] Si "+
            "\n"+"[2] No  ");
          String Deporte=JOptionPane.showInputDialog("¿EL CLIENTE PRACTICA ALGUN DEPORTE : ?"  +   
            "\n"+"[1] Si "+
            "\n"+"[2] No  ");
          String Salario=JOptionPane.showInputDialog("¿EL CLIENTE TIENE SALARIO FIJO : ?"  +   
            "\n"+"[1] Si "+
            "\n"+"[2] No  ");
     
          double probsi =0;
          double probno =0;
          if (BuenCliente.equals(1)) {
             probsi= dat.ProbabidadSi(Integer.parseInt(Edad), Integer.parseInt(TieneHijos),Integer.parseInt(Deporte) , Integer.parseInt(Salario));
        } else if(BuenCliente.equals(2)) {
            probno= dat.ProbabilidaNo(Integer.parseInt(Edad), Integer.parseInt(TieneHijos),Integer.parseInt(Deporte) , Integer.parseInt(Salario));
    
}
         
          
          double suma =probsi+ probno;
          
          JOptionPane.showMessageDialog(null,"La Probabilidad de que sea buen cliente es" + probsi/suma + " : " + probsi/suma*100);
          JOptionPane.showMessageDialog(null,"La Probabilidad de que no sea buen cliente es" + probno/suma + " : " + probno/suma*100);
    }

    

}