package exercicios.estruturas.condicionais;

public class E01 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
        //que C.

        int a = 10;
        int b = 2;
        int c = 50;
        boolean resultado = a + b < c;

        if(resultado){
            System.out.println("Soma de A + B é menor que C");
        }else {
            System.out.println("Soma de A + B é maior que C");
        }

    }
}
