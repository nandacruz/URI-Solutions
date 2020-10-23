package URI1070;
import java.io.IOException;
import java.util.Scanner; 

/**
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um 
valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
 */


public class Main {
 
    public static void main(String[] args) throws IOException {
        
            Scanner in = new Scanner(System.in);
            int i;
            int num = in.nextInt();

                       
            if (num % 2 == 0){
            for(i = num+1 ; i <=num+12; i=i+2){
                System.out.println(i);
            }
            }else{
            for(i = num ; i <num +12; i=i+2){
            System.out.println(i);
            
            }
        }        
        
    }
}