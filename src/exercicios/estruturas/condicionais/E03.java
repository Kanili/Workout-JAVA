package exercicios.estruturas.condicionais;

public class E03 {
    public static void main(String[] args) {
        int numero = 4;
        boolean resultado = (float) numero % 2 == 0;

        if(resultado){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
