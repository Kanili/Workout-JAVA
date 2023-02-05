package exercicios.estruturas.repeticoes;

public class E15 {
    public static void main(String[] args) {
        // Escreva um algoritmo que calcule a soma dos números de 1 a 15.
        int valorTotal = 0;
        for (int i = 1; i <= 15; i++) {
            valorTotal += i;
        }
        System.out.println(valorTotal);
    }
}
