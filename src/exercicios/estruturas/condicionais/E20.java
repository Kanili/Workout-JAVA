package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E20 {
    public static void main(String[] args) {
        //Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
        //Considere que o usuário não informará valores iguais
        Scanner leitor = new Scanner(System.in);
        System.out.println("primeiro valor");
        int valor1 = leitor.nextInt();
        System.out.println("segundo valor");
        int valor2 = leitor.nextInt();
        System.out.println("terceiro valor");
        int valor3 = leitor.nextInt();

        if(valor1>valor2 && valor1>valor3){
            System.out.println(valor1);
        }
        if(valor2>valor1 && valor2>valor3){
            System.out.println(valor2);
        }
        if(valor3>valor2 && valor3>valor1){
            System.out.println(valor3);
        }
    }
}
