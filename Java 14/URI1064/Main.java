package URI1064;
import java.io.IOException;
import java.util.Scanner;

/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se 
mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes
números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média 
dos valores positivos digitados.

*/
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        double num;
        int i,cont=0;
        double acum = 0, total;

              
        for(i=0; i<6;i++){
           num = in.nextDouble();
           
           if(num>0){
               cont+= 1;
               acum += num;
           }
           
        }
        total = acum/cont;
        System.out.println(cont+" valores positivos");
        System.out.printf("%.1f\n",total);

        
 
    }
 
}