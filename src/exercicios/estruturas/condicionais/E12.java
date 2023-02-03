package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E12 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
        //3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
        //aproveitamento, usando a fórmula:
        //MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
        //A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
        //suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a
        //mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
        //Média de aproveitamento Conceito
        //>= 90 A
        //>= 75 e < 90 B
        //>= 60 e < 75 C
        //>= 40 e < 60 D
        //< 40 E
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = leitor.nextFloat();
        System.out.print("Nota ME: : ");
        float notaME = leitor.nextFloat();
        String mesangem = "";
        float calculo = (nota1 + nota2*2 + nota3*3 + notaME)/7;
        if(calculo >= 90){
            mesangem = "aprovado";
        }else if(calculo >= 75 && calculo < 90){
            mesangem = "aprovado";
        }else if(calculo >= 60 && calculo < 75){
            mesangem = "aprovado";
        }else if(calculo >= 40 && calculo < 60){
            mesangem = "reprovado";
        }else{
            mesangem = "reprovado";
        }
        System.out.println(mesangem);
    }

}
