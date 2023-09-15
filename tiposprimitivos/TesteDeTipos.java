package tiposprimitivos;

public class TesteDeTipos {
    public static void main(String[] args) {
        /* Testando de int para string
        int idade = 30;
        // String valor = idade; O java não aceita essa atribuição já que as variáveis são de tipos diferentes
        // String valor = (String) idade; O java também não aceita esse tipo de atribuição
        String valor = Integer.toString(idade); // Essa é a forma correta, receber idado como Integer com a função de converter para String
        System.out.println(valor); */

        /* Testando de String para int */
        String valor = "30";
        int idade = Integer.parseInt(valor); // Essa é a forma de converter de string para int
        System.out.println(idade);

        // Fazendo com o Float
        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor2); // Essa é a forma de converter de string para int
        System.out.println(idade2);
    }
}
