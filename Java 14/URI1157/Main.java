package URI1157;
import java.io.IOException;
import java.util.Scanner; 
/**
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        for(int i = 1; i<=num;i++){
            
            if(num % i == 0){
                System.out.println(i);
            }
        }
 
    }
 
}