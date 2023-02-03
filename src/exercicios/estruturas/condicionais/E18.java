package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E18 {
    public static void main(String[] args) {
        //Tendo como entrada a altura e o sexo (codificado da seguinte forma:
        //1:feminino 2:masculino) de uma pessoa, construa um programa que
        //calcule e imprima seu peso ideal, utilizando as seguintes
        //Fórmulas:
        //- para homens: (72.7 * Altura) – 58
        //- para mulheres: (62.1 * Altura) – 44.7

        Scanner leitor = new Scanner(System.in);
        System.out.println("Altura: ");
        float altura = leitor.nextFloat();
        System.out.println("Sexo: (1:feminino 2:masculino)");
        int sexo = leitor.nextInt();
        float pesoIdeal;
        if(sexo == 1){
            pesoIdeal = (62.1F * altura) - 44.7F;
        }else {
            pesoIdeal = (72.7F * altura) - 58;
        }
        System.out.println("O peso ideal = " +pesoIdeal);
    }
}
