package juegoparaadivinar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuegoParaAdivinar {

    public static void main(String[] args) {
      //La calse Scanner es la obtencion de datos tecleados
      /*  Scanner entrada = new Scanner(System.in);
        int n,num;
        //n es el numero que hay que acertar
        n= (int)(Math.random()*10)+1;
        //Math.random devulve un numero aleatorio entre 1 y 10
        
        //Mensaje
        System.out.println("Intuduce un número");
        //Método para introducir un número por la consola 
        num = entrada.nextInt();
        
        //Bucle
        while(num!=n){//Mientras
            //Condición
            if(num>n){//Si num es menor que n
                System.out.println("Menor");
            }else{//Si num no es menor que n
                System.out.println("Mayor");
            }
            //Mensaje
        System.out.println("Intuduce un número");
        //Método para introducir un número por la consola 
        num = entrada.nextInt();
        }
        // Al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("Acertates....");*/
        
        String entrada;
        int n,num;
        //n es el numero que hay que acertar
        n= (int)(Math.random()*10)+1;
        //Math.random devulve un numero aleatorio entre 1 y 10
       
        //Metodo de entrada por un InputDialog
       entrada = JOptionPane.showInputDialog(null,"Intuduce un número");
       num = Integer.parseInt(entrada);//Esta función lo convierte en un tipo entero
        //Bucle
        while(num!=n){//Mientras
            //Condición
            if(num>n){//Si num es menor que n
                JOptionPane.showMessageDialog(null,"Menor");
            }else{//Si num no es menor que n
                JOptionPane.showMessageDialog(null,"Mayor");
            }
            
         entrada = JOptionPane.showInputDialog(null,"Intuduce un número");
       num = Integer.parseInt(entrada);//Esta función lo convierte en un tipo entero
        }
        // Al salir del mientras tenemos la certeza que num es igual a n
        JOptionPane.showMessageDialog(null,"Acertates....");
    }
}
