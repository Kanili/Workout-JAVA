package exercicios.estruturas.repeticoes;
import java.util.Scanner;
public class E03 {
    public static void main(String[] args) {
        //Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
        //três e que se encontram no conjunto dos números de 1 até 500.
        int valorTotal = 0;
        for(int a = 1; a < 500; a+=2){
            if(a % 3 == 0 ){
                System.out.println(a);
                valorTotal+=a;
            }
        }
        System.out.println(valorTotal);
    }
}
