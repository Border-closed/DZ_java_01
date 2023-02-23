// Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.


import java.util.Scanner;
public class chislo_10_20 {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        Scanner iScanner1 = new Scanner (System.in);
        System.out.print("Введите число b: ");
        int b = iScanner1.nextInt();
        iScanner.close();
        iScanner1.close();
        int sum = a+b;
        if (sum>=10 && sum<=20){
            System.out.println(a + " + " + b + " = "+sum + " находится в диапазоне 10-20");
        }
        else {
            System.out.println(a + " + " + b + " = "+sum + " находится вне диапазона 10-20");
        }
    }
}