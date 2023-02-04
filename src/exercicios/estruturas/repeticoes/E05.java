package exercicios.estruturas.repeticoes;
import java.util.Scanner;
public class E05 {
    public static void main(String[] args) {
        //Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
        //N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual tabuada será calculada?");
        int numero = leitor.nextInt();
        for(int i = 0; i <= 10; i++){
            int valor = i * numero;
            System.out.println(i+" x "+numero+" = " + valor);
        }
    }
}
