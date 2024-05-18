package ProjetosTreinos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    output = num1 / num2;
                } else {
                    System.out.println("Erro! Dividindo por zero não é permitido.");
                    return;
                }
                break;

            default:
                System.out.println("Você digitou uma operação inválida.");
                return;
        }

        System.out.println("O resultado é: " + output);
    }
}
