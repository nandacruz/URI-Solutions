package URI1036;

import java.io.IOException;
import java.util.Scanner;
 
/**
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for 
 possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma 
 divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso 
contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        
        double delta = Math.pow(B,2)-(4*A*C);
        
        if(delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
        }else{
            double bhaskara = Math.sqrt(delta);
            double r1 = ((-B+bhaskara)/(2*A));
            double r2 = ((-B-bhaskara)/(2*A));
            
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        
    }
 
}