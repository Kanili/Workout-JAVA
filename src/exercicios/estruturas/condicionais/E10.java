package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        //O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
        //umaindicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
        //Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
        //com a tabela abaixo.
        //IMC em adultos Condição
        //Abaixo de 18,5 Abaixo do peso
        //Entre 18,5 e 25 Peso normal
        //Entre 25 e 30 Acima do peso
        //Acima de 30 obeso

        Scanner leitor = new Scanner(System.in);
        System.out.println("Write height");
        float altura = leitor.nextFloat();
        System.out.println("Write weight");
        float peso = leitor.nextFloat();

        float calculo = peso / (float) (altura*altura);

        if(calculo < 18.5){
            System.out.println("Abaixo do peso");
        }else if(calculo < 25 && calculo >= 18.5){
            System.out.println("Peso normal");
        }else if(calculo < 30 && calculo >= 25){
            System.out.println("Acima do peso");
        }else {
            System.out.println("Obeso");
        }

    }
}
