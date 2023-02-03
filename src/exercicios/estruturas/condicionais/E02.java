package exercicios.estruturas.condicionais;

public class E02 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
        //estado civil seja “CASADA”, solicitar o tempo de casada (anos).

        String nome = "Marisa";
        String sexo = "F";
        String estadoCivil = "CASADA";

        if(sexo == "F" && estadoCivil == "CASADA"){
            System.out.println("SOLICITAÇÃO DE QUANTDOS ANOS DE CASADA");
        }else {
            System.out.println("Tudo certo!");
        }
    }
}
