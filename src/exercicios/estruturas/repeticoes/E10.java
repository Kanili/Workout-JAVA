package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        //Escreva um algoritmo de conversão de dólar. O algoritmo deve iniciar solicitando a cotação
        //do dólar. Em seguida, deve solicitar um valor em dólares e apresentar na tela o equivalente
        //em reais. Ao final, deve-se perguntar se o usuário se este deseja continuar. Se sim, a
        //operação deve ser repetida, caso contrário o programa deve encerrar.
        Scanner leitor = new Scanner(System.in);
        boolean programaSituacao = true;
        while(programaSituacao){
            System.out.println("Solicitando a cotação do dólar atual: R$5,00");
            System.out.println("Valor em dólares!");
            float valor = leitor.nextFloat();
            System.out.println("Deseja continuar a operação? 1-Continuar / 2-encerrar");
            int selecao = leitor.nextInt();
            if(selecao == 1){
                continue;
            }else if(selecao == 2){
                break;
            }
        }

    }
}
