
package calculador;

import java.util.Scanner;
public class Calculador {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2;
        double soma, subtracao, multiplicacao, divisao;

        System.out.println("Insira um numero: ");
        num1 = entrada.nextInt();

        System.out.println("Insira outro numero: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;
        System.out.println("O resultado da soma e: "+soma);

        subtracao = num1 - num2;
        System.out.println("O resultado da subtracao e: "+subtracao);

        multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicacao e: "+multiplicacao);

        divisao = num1 / num2;
        System.out.println("O resultado da divisao e: "+divisao);

    }
}
