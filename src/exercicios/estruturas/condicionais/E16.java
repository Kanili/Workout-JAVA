package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //As maçãs custam R$ 0,30 cada se forem compradas menos do que uma
        //dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
        //programa que leia o número de maçãs compradas, calcule e escreva o
        //valor total da compra.
        float valorTotal = 0;
        System.out.print("Numero de macas compradas: ");
        int macasCompradas = leitor.nextInt();
        if(macasCompradas >= 12){
            valorTotal = macasCompradas * 0.25F;
        } else {
            valorTotal = macasCompradas * 0.30F;
        }
        System.out.println("Total macas = " + macasCompradas + "\nValorTotal = " + valorTotal);
    }
}
