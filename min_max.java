//Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.lang.Math;
public class min_max {
    public static void main (String[] args) {
        double []arr = new double [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(Math.random()*10);
            }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.1f"+" ",arr[i]);
        }
        double min_znach=arr[0];
        double max_znach=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min_znach) {
                min_znach=arr[i];
            }
            else {
                max_znach=arr[i];
            }
        }
        System.out.println();
        System.out.printf("Минимальное значение в массиве: ");
        System.out.printf("%.1f",min_znach);
        System.out.println();
        System.out.printf("Максимальное значение в массиве: ");
        System.out.printf("%.1f",max_znach);
}
}
