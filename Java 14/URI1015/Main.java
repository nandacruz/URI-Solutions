package URI1015;

import java.io.IOException;
import java.util.Scanner;
 
/**
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e 
p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a 
fórmula:

Distancia = √ (x2-x1)^2 + (y2-y1)^2

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto 
flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner in = new Scanner(System.in);
       double x1 = in.nextDouble();
       double y1 = in.nextDouble();
       double x2 = in.nextDouble();
       double y2 = in.nextDouble();
       
       double total = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
       
       System.out.printf("%.4f\n", total);

          
 
    }
 
}