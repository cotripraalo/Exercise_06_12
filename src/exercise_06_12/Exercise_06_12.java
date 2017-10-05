/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_06_12;

/**
 *
 * @author alumno
 */
public class Exercise_06_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Imprimir diez caracteres por linea de 1 a Z
        final int n_de_chars_per_linea = 10;   //Numero de caracteres por linea
        char ch1 = '1'; //Inicio del rango
        char ch2 = 'z'; //Fin del rango
        
        System.out.println("\n Caracteres por 1 a Z");
        printChars(ch1,ch2,n_de_chars_per_linea);
        System.out.println();
    }
    //Metodo printChars: Imprime los caracteres ch1 y ch2 con los caracteres especificados numeros por linea.
    public static void printChars(char ch1, char ch2, int numeroPerLinea ){
        for(char c=ch1, count = 1; c<=ch2; c++, count++){
        if(count % numeroPerLinea==0)
                System.out.println(c);
        else
                System.out.println(c + "");
        
        }
    }
}
    
    
       

