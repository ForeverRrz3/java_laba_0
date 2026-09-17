import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество стекол, которое хотите заказать: ");
        int n = in.nextInt();

        double vitrazhi = calculateCost(n, 420, 75);
        double stekolshik = calculateCost(n, 440, 65);
        double master = calculateCost(n, 470, 55);

        System.out.printf("Витражи: %.2fр\n", vitrazhi);
        System.out.printf("Стекольщик: %.2fр\n", stekolshik);
        System.out.printf("Мастер: %.2fр\n", master);

        if ( vitrazhi <= stekolshik && vitrazhi <= master){
            System.out.printf("Дешевле всего у Витражи: %.2fр\n", vitrazhi);
        } else if ( stekolshik <= vitrazhi && stekolshik <= master){
            System.out.printf("Дешевле всего у Стекольщик: %.2fр\n", stekolshik);
        } else {
            System.out.printf("Дешевле всего у Мастер: %.2fр\n", master);
        }

    }

    public static double calculateCost(int cntGlass, int priceGlass, int priceCutGrind) {
        double area = 0.25;
        return cntGlass * (priceGlass * area + priceCutGrind);
    }
}
