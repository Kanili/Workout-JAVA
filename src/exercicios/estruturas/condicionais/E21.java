package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E21 {
    public static void main(String[] args) {
        // Escreva um programa que leia as medidas dos lados de um triângulo e
        //escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
        //− Triângulo Equilátero: possui os 3 lados iguais.
        //− Triângulo Isóscele: possui 2 lados iguais.
        //− Triângulo Escaleno: possui 3 lados diferentes.
        Scanner leitor = new Scanner(System.in);
        System.out.println("primeiro valor");
        int valor1 = leitor.nextInt();
        System.out.println("segundo valor");
        int valor2 = leitor.nextInt();
        System.out.println("terceiro valor");
        int valor3 = leitor.nextInt();
        if(valor1 == valor2 && valor3 == valor2){
            System.out.println("Equilatero");
        }else if(valor1 == valor2 || valor2 == valor3 || valor3 == valor1){
            System.out.println("Isoscele");
        }else if(valor1 != valor2 && valor1 != valor3 && valor3 != valor2){
            System.out.println("Escaleno");
        }
    }
}
