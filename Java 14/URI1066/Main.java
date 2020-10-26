package URI1066;

import java.io.IOException;
import java.util.Scanner; 
/**
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram
ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de
linha após cada uma.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int valor, pos=0,par=0,neg=0,imp=0;
        
        for (int i = 0; i<5;i++){
            
            valor = in.nextInt();
            
            if(valor%2==0){
                par = par+1;
            }else {
                imp = imp+1;
            }
            
            if(valor>0){
                pos = pos +1;
            }if(valor<0){
                neg = neg+1;
            }
            
            valor=0;
            
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
 
    }
 
}