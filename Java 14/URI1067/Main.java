package URI1067;
import java.io.IOException;
import java.util.Scanner;
 
/**
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */


public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        int i;

               
        if(num %2 == 0){
            for (i =1; i < num; i = i+2){
            System.out.println(i);
            }
        }else{
          for (i =1; i <= num; i = i+2){
            System.out.println(i);
        }
 
    }
 
  }
 
}