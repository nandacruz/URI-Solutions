package URI2763;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String cpf = in.next();

		String primeiro = cpf.substring(0, 3);
		String segundo = cpf.substring(4, 7);
		String terceiro = cpf.substring(8, 11);
        String verificador = cpf.substring(12, 14);
        

		System.out.println(primeiro);
		System.out.println(segundo);
		System.out.println(terceiro);
		System.out.println(verificador); 
       

    
        

        
    }
    
}