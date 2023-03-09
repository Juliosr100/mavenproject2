/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tecmilenio.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String nombre; 
        String CF;
        int suma = 0;
        nombre = JOptionPane.showInputDialog("nombre: ");
        int calificaciones[] = new int [5];
        for(int i = 0 ; i<5; i++){
            calificaciones[i]= Integer.parseInt (JOptionPane.showInputDialog("Escribe tu calificacion numero "+ i+":"));
               suma=suma+calificaciones[i];
                             
            }
           double promedio = (double) suma / calificaciones.length;
        if(promedio<=50){
        CF="F";                        
    }
        else{
            if(promedio>50 & promedio<61){
          CF="E";      
                                     
        }       
            else{
                if(promedio>60 & promedio<71)
                {
                    CF="D";
                }
                else{
                   if(promedio>70 & promedio<81) 
                   {
                       CF="C";
                   }
                                   else{
                   if(promedio>80 & promedio<91) 
                   {
                       CF="B";
                   }
                                   else{
                   if(promedio>90 & promedio<101) 
                   {
                       CF="A";
                   }
                   else{
                    CF="Calificaciones fuera de los parametros para calificar";
                   }
                } 
                    
                } 
                    
                }                                              
                
                
            }
}
        System.out.println("Nombre del estudiante: "+nombre);
         for(int i = 0 ; i<5; i++){
             int x=i+1;
             System.out.println("Calificacion "+x+":"+calificaciones[i]);
            }
         System.out.println("Promedio: "+promedio);
         System.out.println("Calificacion :"+CF);
       
}
}