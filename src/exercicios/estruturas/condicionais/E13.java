package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E13 {
    public static void main(String[] args) {
        //Escreva um programa para ler 2 valores (considere que não serão
        //informados valores iguais) e escrever o maior deles.

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        if(valor1>valor2){
            System.out.println("Valor1");
        }else{
            System.out.println("Valor2");
        }
    }
}
