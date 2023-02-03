package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E15 {
    public static void main(String[] args) {
        //Escreva um programa que verifique a validade de uma senha fornecida
        //pelo usuário. A senha válida é o número 1234. Devem ser impressas as
        //seguintes mensagens:
        //ACESSO PERMITIDO caso a senha seja válida.
        //ACESSO NEGADO caso a senha seja inválida.
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira uma senha de 4 digitos: ");
        int password = leitor.nextInt();
        int senhaValida = 1234;
        if(password != 1234){
            System.out.println("Acesso negado");
        }else {
            System.out.println("Acesso permitido");
        }
    }
}
