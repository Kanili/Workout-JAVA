package exercicios.estruturas.condicionais;

import java.sql.SQLOutput;

public class E06 {
    public static void main(String[] args){
        // Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são
        //VERDADEIROS ou FALSOS.

        boolean X = false;
        boolean Y = true;

        if(X && Y){
            System.out.println("Ambos TRUE");
        }else if(!X && !Y){
            System.out.println("Ambos FALSE");
        }else if (!X && Y){
            System.out.println("X false and Y true");
        }else {
            System.out.println("X true and Y false");
        }
    }
}
