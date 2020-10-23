package URI1050;

import java.io.IOException;
import java.util.Scanner; 
/**
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe 
à qual cidade o DDD pertence, considerando a tabela abaixo:

61 - Brasilia
71 - Salvador
11 - Sao Paulo
21 - Rio de Janeiro
32 - Juiz de Fora
19 - Campinas
27 - Vitoria
31 - Belo Horizonte

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá 
informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso 
não existir DDD correspondente ao número digitado.
 */


public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
       
       int num = in.nextInt();
       
       if(num == 61){
           System.out.println("Brasilia");
           
       }else if(num == 71){
           System.out.println("Salvador");
           
       }else if(num == 11){
           System.out.println("Sao Paulo");
           
       }else if(num == 21){
           System.out.println("Rio de Janeiro");
           
       }else if(num == 32){
           System.out.println("Juiz de Fora");
           
       }else if(num == 19){
           System.out.println("Campinas");
           
       }else if(num == 27){
           System.out.println("Vitoria");
           
       }else if(num == 31){
           System.out.println("Belo Horizonte");
       }else{
           System.out.println("DDD nao cadastrado");
       }       
 
    }
 
}