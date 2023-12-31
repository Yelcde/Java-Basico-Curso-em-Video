package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args){
		try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o nome do Aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota do Aluno: ");
            float nota = teclado.nextFloat();
            System.out.format("A nota do Aluno %s é %.1f \n", nome, nota);
        } // O Scanner será fechado automaticamente após este bloco
    }
}


/* 
Familia		Tipo Primitivo		Classe Invólucro	Tamanho		    Exemplo

Lógico      boolean             Boolean			    1 bit		    true

Literais	char;			    Character		    1 byte		    'A' Aspas simples
		    -			        String			    1 byte/cada	    "Java" Aspas Duplas

Interiros	byte;			    Byte			    1 byte		    127
		    short;			    Short			    2 bytes		    32.767
		    int;			    Integer			    4 bytes		    2.147.483
		    long			    Long			    8 bytes		    2^63

Reais		float;			    Float			    4 bytes		    3.4e^+38
		    double			    Double			    8 bytes		    1.8e^+308
 */