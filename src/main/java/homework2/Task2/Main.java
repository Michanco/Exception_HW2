package homework2.Task2;
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//В противном случае, программа должна выводить результат деления.

import homework2.Task1.InvalidNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите делимое");
        int inputNum1 = scanner.nextInt();
        System.out.println("Введите делитель");
        int inputNum2 = scanner.nextInt();
        try {
            double result = divide(inputNum1, inputNum2);
            System.out.println("Результат: " + result);
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }
    public static double divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0)  throw new DivisionByZeroException();
        return (double) dividend / divisor;
    }
}
