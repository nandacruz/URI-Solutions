package URI1065;
import java.io.IOException;
import java.util.Scanner;
 
/**
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e 
mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
       
       int valor,contador=0;
       
       for(int i = 0;i<5;i++){
           
           valor = in.nextInt();
           
           if(valor%2 == 0){
               contador = contador + 1;
           }
           valor = 0;
       }
       System.out.println(contador+" valores pares");
 
    }
 
}