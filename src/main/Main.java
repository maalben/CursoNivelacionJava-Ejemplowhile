package main;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        int contador = 11;
//        boolean estado = true;
//        while (estado == true){
//            contador++;
//            System.out.println("Contador: " + contador);
//            if(contador == 5){
//                estado = false;
//            }
//        }

        while (contador <= 10){
            System.out.println("Contador " + contador);
            contador++;
        }

//        do{
//            System.out.println("Contador " + contador);
//            contador++;
//        }while (contador <= 10);

    }

}
