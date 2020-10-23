package URI1060;
import java.io.IOException;
import java.util.Scanner; 
/**
 Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos 
 (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        double num;
       
        int positivo = 0,i;

               
        for(i = 0; i <6;i++){
            
            num = in.nextDouble();
            if(num > 0){
                positivo += 1;
            }
            
        }

        System.out.println( positivo + " valores positivos");
            
        
    }
 
}