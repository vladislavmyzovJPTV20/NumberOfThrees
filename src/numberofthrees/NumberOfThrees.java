/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofthrees;

import java.util.Scanner;

/**
 *
 * @author Влад
 */
public class NumberOfThrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt(); // Создаем класс сканнер и вводим трехзначное число
        System.out.println("Ваше число: " + number);
        // Далее выводим количество единиц, десятков и сотен по формуле
        System.out.println("Единицы: " + number % 10); 
        System.out.println("Десятки: " + number / 10 % 10);
        System.out.println("Сотни: " + number / 100);
        // Находим сумма чисел
        int summa = (number % 10) + (number / 10 % 10) + (number / 100);
        System.out.println("Сумма чисел равна: " + summa);
    }
    
}
