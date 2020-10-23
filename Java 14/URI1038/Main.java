package URI1038;
import java.io.IOException;
import java.util.Scanner;
 
/**
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar.

CODIGO      ESPECIFICAÇÃO       PREÇO
1           Cachorro Quente     R$ 4.00
2           X-Salada            R$ 4.50
3           X-Bacon             R$ 5.00
4           Torrada Simples     R$ 2.00
5           Refrigerante        R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item 
conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas 
após o ponto decimal.
 */

 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int cod = in.nextInt();
        int quan = in.nextInt();
        double total = 0;
        
        if(cod == 1){
            total = quan*4.00;
            System.out.printf("Total: R$ %.2f\n",total );
        }else if(cod == 2){
            total = quan*4.50;
            System.out.printf("Total: R$ %.2f\n",total );
        }else if(cod == 3){
            total = quan*5.00;
            System.out.printf("Total: R$ %.2f\n",total );
        }else if(cod == 4){
            total = quan*2.00;
            System.out.printf("Total: R$ %.2f\n",total );
        }else{
            total = quan*1.50;
            System.out.printf("Total: R$ %.2f\n",total );
        }

         
    }
 
}