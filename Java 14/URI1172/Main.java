package URI1172;

import java.io.IOException;
import java.util.Scanner;
 
/**
Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do 
vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado 
quela posição.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
       int i;
       
       int X [] = new int[10];       
       
       for (i = 0; i < X.length; i ++){
           X[i] = in.nextInt();
           if(X[i] <= 0){
                X[i] = 1;
           }
       }      
      
       for(i = 0; i < X.length; i ++){
          System.out.println("X["+i+"] = "+X[i]);
       }

       in.close();
       
 
    }
    
 
}