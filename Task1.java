import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите цену товара: ");

        double price = in.nextDouble();
        double discount = price * 0.13;
        
        System.out.printf("Скидка: %.2fр\n", discount);
        System.out.printf("Цена со скидкой: %.2fр\n", price - discount);
    }
}
