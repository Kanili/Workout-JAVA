package exercicios.estruturas.condicionais;
public class E09 {
    public static void main(String[] args) {
        //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
        //calcule seu peso ideal, utilizando as seguintes fórmulas:
        //● para homens: (72.7 * h) – 58;
        //● para mulheres: (62.1 * h) – 44.7.

        float altura = 1.78F;
        String sexo = "M";
        String resultado;
        if(sexo == "F"){
            resultado = "peso ideal " + ((62.1 * altura) - 44.7);
        }else{
            resultado = "peso ideal " + ((72.7 * altura) - 58);
        }
        System.out.println(resultado);
    }
}
