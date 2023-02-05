package exercicios.estruturas.repeticoes;
import java.util.Scanner;
public class E19 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a soma das idades.
        Scanner leitor = new Scanner(System.in);
        int valorTotalDasIdades = 0;
        for(int i = 1; i <= 20; i++){
            System.out.println("idade do participante "+i);
            int idade = leitor.nextInt();
            valorTotalDasIdades+=idade;
        }
        System.out.println("Soma das idades total: "+valorTotalDasIdades);
    }
}
