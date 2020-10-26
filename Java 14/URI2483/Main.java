package URI2483;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        String a = "a";
        
        for (int i = 1; i <num;i++){
            a += "a";
        }
        System.out.println("Feliz nat"+a+"l!");
 
    }
 
}