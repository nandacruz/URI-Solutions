package URI1007;

import java.io.IOException;
import java.util.Scanner;
 
/**
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço 
em branco antes e depois da igualdade.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
       
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       int d = in.nextInt();
       
       int dif = (a*b - c*d);
       
       System.out.println("DIFERENCA = "+dif);

       
    }
 
}