/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm306.usocad.vista;

import java.util.Arrays;
import org.utl.ldsm306.usocad.controlador.ControladorCadena;

/**
 *
 * @author do_al
 */
public class PrincipalCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      generarConteos(); 
      invertirCadena();
        
    }
    
    public static void generarConteos (){
        
        ControladorCadena  cc = new ControladorCadena (); 
        System.out.println(Arrays.toString(cc.contadorVocales("pajaro") [0]) );
        System.out.println(Arrays.toString(cc.contadorVocales("pajaro") [1]) );
        System.out.println(Arrays.toString(cc.contadorVocales("pajaro") [2]) );
        System.out.println(Arrays.toString(cc.contadorVocales("pajaro") [3]) );
        System.out.println(Arrays.toString(cc.contadorVocales("pajaro") [4]) );

    }
    
   public static void   invertirCadena (){
       String  pal ="caso" ;
       ControladorCadena invc = new ControladorCadena (); 

        System.out.println("La cadena original es  " + (pal));
        System.out.println("La cadena invertida es "  + invc.invCad(pal)); 
        
    }

}
