package exercicios.estruturas.condicionais;

public class E07 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
        //imprimir o resultado desta operação.
        int numero = 13;
        String resultado = numero % 2 == 0 ? "Result "+(numero+5) : "Result "+(numero+8);
        System.out.println(resultado);
    }
}
