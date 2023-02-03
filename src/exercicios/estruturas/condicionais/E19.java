package exercicios.estruturas.condicionais;
import java.sql.SQLOutput;
import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        // Escreva um programa para ler o número de lados de um polígono regular
        //e a medida do lado (em cm). Calcular e imprimir o seguinte:
        //− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da
        //área
        //− Se o número de lados for igual a 4 escrever QUADRADO e o valor da
        //sua área.
        //− Se o número de lados for igual a 5 escrever PENTÁGONO.

        Scanner leitor = new Scanner(System.in);
        System.out.println("Numeros de lados:");
        int numerosLados = leitor.nextInt();
        System.out.println("Medida do lado(em cm):");
        float medidaLados = leitor.nextInt();
        float area;
        if(numerosLados == 3){
            System.out.println("triangulo");
            area = (medidaLados*medidaLados)/2;
            System.out.println(area);
        }else if(numerosLados == 4){
            System.out.println("quadrado");
            area = medidaLados*medidaLados;
            System.out.println(area);
        }else if(numerosLados == 5){
            System.out.println("pentagono");
        }else {
            System.out.println("ERRO");
        }
    }
}
