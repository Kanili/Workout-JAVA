package exercicios.estruturas.arrays;

public class E08 {
    public static void main(String[] args) {
        // Guarde em um array 6 nomes. Exiba na tela todos os
        //nomes digitados, porém de maneira invertida (do último para
        //o primeiro).

        String[] nomes = new String[]{"Kaio", "Zoro", "Luffy", "Goku", "Ichigo", "Isagi"};

        for (int i = (nomes.length - 1); i >= 0; i--) {
            System.out.println(nomes[i]);
        }

    }
}
