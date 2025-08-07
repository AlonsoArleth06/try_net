/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm306.usocad.controlador;

/**
 *
 * @author do_al
 */
public class ControladorCadena {

    
    public char [][] contadorVocales (String pb ){
        
        byte  cA=0, cE=0, cI=0, cO=0, cU=0; 
       String pal=  pb.toLowerCase();
        for (int i = 0; i <pb.length(); i++) {
            switch (pal.charAt(i)){
                
                case 'a': 
                    cA++;
                    break;
                case 'e': 
                     cE++;
                    break;
                case 'i': 
                    cI++;
                    break;
                case 'o': 
                     cO++;
                    break;
                case 'u':
                    cU++;
                    break; 
            } 
        }
            char [][] tablita = new char  [5][2]; 
            tablita [0][0] ='a';
            tablita [0][1] = (char)(48 +cA);
            tablita [1][0] ='e';
            tablita [1][1] = (char)(48 +cE); 
            tablita [2][0] ='i';
            tablita [2][1] = (char)(48 +cI); 
            tablita [3][0] ='o';
            tablita [3][1] = (char)(48 +cO); 
            tablita [4][0] ='u';
            tablita [4][1] = (char)(48 +cU); 
            
            
            return tablita;

    }
  
    public String invCad (String word ){
   
      
       /*String cadInv;*/
       String  pal ="caso" ;
       String  invertida =""; 
       
        for (int i = pal.length()-1 ; i >=0 ; i--) {
            invertida+= pal.charAt(i); 
        }
        return invertida; 
    
    }
}