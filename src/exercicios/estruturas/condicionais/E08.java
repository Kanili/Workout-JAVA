package exercicios.estruturas.condicionais;

public class E08 {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem
        //decrescente.
        int X = 12;
        int Z = 17;
        int Y = 10;

        if(X == Z || X == Y || Y == Z){
            System.out.println("Numeros iguais");
        }else {
            if(X>Z && X>Y){
                if(Z > Y){
                    System.out.println(X+", "+Z+", "+Y);
                }else{
                    System.out.println(X+", "+Y+", "+Z);
                }
            }

            if(Z>X && Z>Y){
                if(X > Y){
                    System.out.println(Z+", "+X+", "+Y);
                }else{
                    System.out.println(Z+", "+Y+", "+X);
                }
            }

            if(Y>Z && Y>X){
                if(X > Z){
                    System.out.println(Y+", "+X+", "+Z);
                }else{
                    System.out.println(Y+", "+Z+", "+Y);
                }
            }
        }

    }
}
