package exercicios.estruturas.repeticoes;

public class E01 {
    public static void main(String[] args) {
        double valor = 50000;
        for(int parcela = 1; parcela <= valor; parcela++){
            double valorParcela = valor / parcela;
            if(valorParcela<1000){
                break;
            }
            System.out.println("Valor de "+ parcela + "parcela = " + valorParcela);
        }
    }
}
