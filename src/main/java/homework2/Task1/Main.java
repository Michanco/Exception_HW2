package homework2.Task1;

//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
//с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите число");
        int inputNum = scanner.nextInt();
        try {
            testNum(inputNum);
            System.out.println("Корректное число");
        }catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }
    public static void testNum (int num) throws InvalidNumberException{
        if (num <= 0) throw new InvalidNumberException();
    }
}
