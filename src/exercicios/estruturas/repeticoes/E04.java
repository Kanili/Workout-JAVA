package exercicios.estruturas.repeticoes;

public class E04 {
    public static void main(String[] args) {
        // Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.

        for(int i = 100; i <= 200; i++){
            if(i % 2 == 1){
                System.out.println("Impares = "+i);
            }
        }
    }
}
