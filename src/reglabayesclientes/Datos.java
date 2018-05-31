/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglabayesclientes;
/**
 *
 * @author Davidlo0l
 */
public class Datos {
    
    String BuenCliente[]={"si","0.6","no","0,4"};
    
    String EdadSi[]={"Joven","0.5","Mayor","0.5"};
    String EdadnNo[]={"Joven","0,.75","Mayor","0.25"};
    String HijosSi[]={"si","0.666","no","0.333"};
    String HijosNo[]={"si","0.5","no","0.5"};        
    String DeporteSi[]={"si","0.333","no","0.666"}; 
    String DeporteNo[]={"si","0.5","no","0.5"};
    String SalarioSi[]={"Alto","0.166","Medio","0.5","Bajo","0.333"};
    String SalarioNo[]={"Alto","0.25","Medio","0.5","Bajo","0.25"};
    public Datos(){

} 
    public double ProbabidadSi(int edad,int hijos,int deportes, int salario  ){
        
         double valorSi= Double.parseDouble(BuenCliente[1])* Double.parseDouble(EdadSi[edad])* Double.parseDouble(HijosSi[hijos])* Double.parseDouble(DeporteSi[deportes])* Double.parseDouble(SalarioSi[salario]);
         return valorSi;
    } 
     public double ProbabilidaNo(int edad,int hijos,int deportes, int salario  ){
        
         double valorNo= Double.parseDouble(BuenCliente[3])* Double.parseDouble(EdadnNo[edad])* Double.parseDouble(HijosNo[hijos])*Double.parseDouble(DeporteNo[deportes])* Double.parseDouble(SalarioNo[salario]);
         return valorNo;
    } 
}

