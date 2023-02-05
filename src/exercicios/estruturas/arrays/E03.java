package exercicios.estruturas.arrays;

public class E03 {
    public static void main(String[] args) {
        // Crie um programa que leia um array de 5 strings e imprima-as em ordem alfabética.
        String[] nomes = new String[]{"Matheus", "Lucas", "Jose", "Adam", "Zeus"};
        char[] alfabeto = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < alfabeto.length; i++) {
            for (int j = 0; j < nomes.length; j++) {
                char letra = nomes[j].charAt(0);
                if(letra == alfabeto[i]){
                    System.out.println(nomes[j]);
                }
            }
        }
    }
}
