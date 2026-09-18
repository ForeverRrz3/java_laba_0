import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double timeBasedFee = 135;
        double timeBasedRate = 0.3;

        double comboFee = 255;
        int comboLimit = 450;
        double comboRate = 0.28;
        
        double unlimitedFee = 380;

        System.out.print("Длительность разговоров за месяц (минут): ");
        int minutes = in.nextInt();

        double timeBased = timeBasedFee + timeBasedRate * minutes;

        double combo = comboFee;
        if (minutes > comboLimit) {
            combo = comboFee + comboRate * (minutes - comboLimit);
        }

        System.out.printf("Повременный: %.2fр\n", timeBased);
        System.out.printf("Комбинированный: %.2fр\n", combo);
        System.out.printf("Безлимитный: %.2fр\n", unlimitedFee);

        if (timeBased <= combo && timeBased <= unlimitedFee) {
            System.out.println("Выгоднее всего: Повременный\n");
        } else if (combo <= unlimitedFee) {
            System.out.println("Выгоднее всего: Комбинированный\n");
        } else {
            System.out.println("Выгоднее всего: Безлимитный\n");
        }

        // Дополнительное задание
        System.out.println("Диапазоны выгодности:");

        String previousPlan = "";
        int rangeStart = 0;
        int m = 0;
        boolean unlimitedWon = false;

        while (!unlimitedWon) {
            double t = timeBasedFee + timeBasedRate * m;

            double c = comboFee;
            if (m > comboLimit) {
                c = comboFee + comboRate * (m - comboLimit);
            }

            String currentPlan;
            if (t <= c && t <= unlimitedFee) {
                currentPlan = "Повременный";
            } else if (c <= unlimitedFee) {
                currentPlan = "Комбинированный";
            } else {
                currentPlan = "Безлимитный";
                unlimitedWon = true;
            }

            if (m == 0) {
                previousPlan = currentPlan;
            } else if (!currentPlan.equals(previousPlan)) {
                System.out.println("от " + rangeStart + " до " + (m - 1) + " минут: " + previousPlan);
                previousPlan = currentPlan;
                rangeStart = m;
            }

            m++;
        }

        System.out.println("от " + rangeStart + " минут и больше: " + previousPlan);

    }
}


System.out.println("Минус сменился плюсом: " + changes + " раз");
        System.out.println("Самая длинная череда плюсовых дней: " + best);
        System.out.println();

        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.printf("%2d марта %4d ", i + 1, temp[i]);

            if (temp[i] < 0) {
                System.out.print(" ".repeat(-min + temp[i]));
                System.out.print("#".repeat(-temp[i]));
                System.out.println("|");
            } else {
                System.out.print(" ".repeat(-min));
                System.out.print("|");
                System.out.println("#".repeat(temp[i]));
            }
        }
