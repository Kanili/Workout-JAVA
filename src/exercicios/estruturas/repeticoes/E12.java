package exercicios.estruturas.repeticoes;



public class E12 {
    public static void main(String[] args) {
        // Faça um programa que imprima a tabuada de 1 até 10.
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                System.out.println(i + " x " + j + " = "+(i*j));
            }
            System.out.println("\n");
        }
    }
}
