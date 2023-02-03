package exercicios.estruturas.condicionais;

public class E04 {
    public static void main(String[] args){
        //Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
        //somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
        //atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
        int A = 10;
        int B = 15;
        int C;
        if(A == B){
            C = A + B;
        }else {
            C = A * B;
        }

        System.out.println("Result " + C);
    }
}
