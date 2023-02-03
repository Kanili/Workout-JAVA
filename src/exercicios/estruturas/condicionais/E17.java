package exercicios.estruturas.condicionais;
import java.util.Scanner;
public class E17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        float n1 = leitor.nextFloat();
        System.out.println("digite o segundo numero");
        float n2 = leitor.nextFloat();
        System.out.println("digite o terceiro numero");
        float n3 = leitor.nextFloat();
        String resultado = "";

        if(n1 > n2 && n1 > n3){
            if(n2>n3){
                resultado = "n1,n2.n3";
            }else{
                resultado = "n1,n3.n2";
            }
        }

        if(n2 > n1 && n2 > n3){
            if(n1>n3){
                resultado = "n2,n1.n3";
            }else{
                resultado = "n2,n3.n1";
            }
        }

        if(n3 > n2 && n3 > n1){
            if(n2>n1){
                resultado = "n3,n2.n1";
            }else{
                resultado = "n3,n1.n2";
            }
        }
        System.out.println("N1 = " + n1 + ", N2 = " + n2 + ", N3 = " + n3);
        System.out.println("Resultado da ordem (" + resultado + ")");
    }
}
