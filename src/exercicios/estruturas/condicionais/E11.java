package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E11 {
    //Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
    //normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
    //para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
    //Código Condição de pagamento
    //1 À vista em dinheiro ou cheque, recebe 10% de desconto
    //2 À vista no cartão de crédito, recebe 15% de desconto
    //3 Em duas vezes, preço normal de etiqueta sem juros
    //4 Em duas vezes, preço normal de etiqueta mais juros de 10%

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preco do produto");
        float proPreco = leitor.nextFloat();
        System.out.println("METODOS DE PAGAMENTO");
        System.out.println("1 À vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2 À vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3 Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int metodoPagamento = leitor.nextInt();
        float resultado = 0;
        if(metodoPagamento == 1){
            resultado = proPreco-(proPreco*0.1F);
        }else if(metodoPagamento == 2){
            resultado = proPreco-(proPreco*0.15F);
        }else if(metodoPagamento == 3){
            resultado = proPreco;
        }else if(metodoPagamento == 4){
            resultado = (proPreco*0.1F) + proPreco;
        }else{
            System.out.println("ERRO NO METODO");
        }
        System.out.println("preco do produto " + resultado);
    }
}
