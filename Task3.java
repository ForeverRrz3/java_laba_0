import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько кг мяса: ");
        double meat = in.nextDouble() * 285.5;

        System.out.print("Сколько батонов хлеба: ");
        double bread = in.nextDouble() * 25.4;

        System.out.print("Сколько кг огурцов: ");
        double cuc = in.nextDouble() * 40;

        System.out.print("Сколько кг помидоров: ");
        double tom = in.nextDouble() * 51;

        System.out.print("Сколько литров бензина: ");
        double fuel = in.nextDouble() * 43.6;

        double sum = meat + bread + cuc + tom + fuel;
        double share = sum / 3;

        System.out.printf("\nВсего потрачено: %.2fр\n", sum);
        System.out.printf("Каждый должен заплатить: %.2fр\n\n", share);

        // Дополнительное задание
        double paid1 = meat;
        double paid2 = bread + cuc + tom;
        double paid3 = fuel;
        System.out.printf("Первый заплатил %.2fр, второй %.2fр, третий %.2fр\n\n", paid1, paid2, paid3);

        paid1 -= share;
        paid2 -= share;
        paid3 -= share;

        System.out.println("Кто кому должен:");

        if (paid1 < 0 && paid2 < 0) {            
            System.out.printf("Первый -> Третий: %.2fр\n", -paid1);
            System.out.printf("Второй -> Третий: %.2fр\n", -paid2);

        } else if (paid1 < 0 && paid3 < 0) {     
            System.out.printf("Первый -> Второй: %.2fр\n", -paid1);
            System.out.printf("Третий -> Второй: %.2fр\n", -paid3);

        } else if (paid2 < 0 && paid3 < 0) {     
            System.out.printf("Второй -> Первый: %.2fр\n", -paid2);
            System.out.printf("Третий -> Первый: %.2fр\n", -paid3);

        } else if (paid1 < 0) {                  
            System.out.printf("Первый -> Второй: %.2fр\n", paid2);
            System.out.printf("Первый -> Третий: %.2fр\n", paid3);

        } else if (paid2 < 0) {
            System.out.printf("Второй -> Первый: %.2fр\n", paid1);
            System.out.printf("Второй -> Третий: %.2fр\n", paid3);

        } else if (paid3 < 0){
            System.out.printf("Третий -> Первый: %.2fр\n", paid1);
            System.out.printf("Третий -> Второй: %.2fр\n", paid2);
        } else {
            System.out.println("Никто никому не должен");
        }
    }
}
