package URI1175;
import java.io.IOException;
import java.util.Scanner;
 
/**
 Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o 
 segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado
naquela posição.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int i, valor;
        
        int [] N = new int[20];
       
        
        for(i = N.length-1; i>=0; i--){
            
            valor = in.nextInt();
            N[i] = valor;
            
        }
        for(i = 0; i<N.length; i++){
            System.out.println("N["+i+"] = " + N[i]);
        }

        in.close();
 
    }
 
}