package URI1142;

import java.io.IOException;
import java.util.Scanner; 
/**
Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão 
apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        int i,a,b;
        int r = 1;
        
        for(i = 1;i<=num;i=i+1){

            a = (r+1);
            b = (r+2);
            System.out.println(r+" "+a+" "+b+" PUM");
            r= r+4;
            
        }
 
    }
 
}