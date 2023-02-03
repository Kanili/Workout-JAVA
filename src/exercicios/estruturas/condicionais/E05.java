package exercicios.estruturas.condicionais;

public class E05 {
    public static void main(String[] args){
        // Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
        //imprimindo o resultado.
        int numero = -2;
        int resultado = numero > 0 ? numero*2 : numero*3;
        System.out.println(resultado);
    }
}
