package exercicios.estruturas.repeticoes;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        //Faça um programa que pergunte ao usuário o preço de vários produtos e mostre ao final o
        //valor total destes. O programa deve pedir ao usuário o valor de um produto e perguntar se o
        //usuário deseja adicionar mais um. Enquanto o usuário responder que sim, o programa deve
        //pedir o valor do novo produto e somar com os valores informados anteriormente. Quando o
        //usuário responder que não, o programa deve sair do laço de repetição e mostrar o total
        Scanner leitor = new Scanner(System.in);
        boolean situacao = true;
        boolean escolha;
        int p1, p2, p3, p4;
        int valorTotal = 0;
        while (situacao) {
            p1 = 30;
            p2 = 20;
            p3 = 5;
            p4 = 25;
            System.out.println("Gostaria de ver os produtos");
            escolha = leitor.nextBoolean();
            if (escolha) {
                System.out.println("Produto 1 preço: " + p1);
                System.out.println("Produto 2 preço: " + p2);
                System.out.println("Produto 3 preço: " + p3);
                System.out.println("Produto 4 preço: " + p4);

                while (situacao) {
                    System.out.println("Qual produto deseja?: ");
                    int escolha2 = leitor.nextInt();
                    switch (escolha2) {
                        case 1:
                            valorTotal += p1;
                            break;
                        case 2:
                            valorTotal += p2;
                            break;
                        case 3:
                            valorTotal += p3;
                            break;
                        case 4:
                            valorTotal += p4;
                            break;
                        default:
                            System.out.println("error");
                            break;
                    }
                    System.out.println("deseja sair?");
                    int desicao3 = leitor.nextInt();
                    if(desicao3 == 1){
                        continue;
                    }else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("valor total " + valorTotal);
    }
}
