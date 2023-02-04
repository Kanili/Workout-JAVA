package exercicios.estruturas.condicionais;
import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        // Escreva um programa que leia o valor de 3 ângulos de um triângulo e
        //escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo
        //que:
        //− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
        //− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
        //− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)

        Scanner leitor = new Scanner(System.in);
        System.out.println("Angulo 1");
        int angulo1 = leitor.nextInt();
        System.out.println("Angulo 2");
        int angulo2 = leitor.nextInt();
        System.out.println("Angulo 3");
        int angulo3 = leitor.nextInt();

        if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
            System.out.println("Triangulo retangulo");
        }else if(angulo1 >= 90 || angulo2 >= 90 || angulo3 >= 90){
            System.out.println("Triangulo obtusangulo");
        }else if(angulo1 < 90 || angulo2 < 90 || angulo3 < 90){
            System.out.println("Triangulo acutangulo");
        }
    }
}
