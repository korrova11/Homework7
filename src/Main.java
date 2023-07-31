public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int i = 0;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + 15_000;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            int thousand = totalPopulation / 1000;
            totalPopulation = totalPopulation + (birthRate - mortality) * thousand;


            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation + " человек.");

        }


    }

    public static void task4() {
        System.out.println("Задача 4");

        double totalDeposit = 15_000;
        int i = 1;
        while (totalDeposit <= 12_000_000) {

            totalDeposit = totalDeposit + totalDeposit * 7 / 100;
            // округлим до копеек полученный результат
            int roundTotal = (int) (totalDeposit * 100);
            double total = (double) (roundTotal / 100.0);
            System.out.println("В конце " + i + " месяца сумма вклада равна " + total);
            i++;

        }

        System.out.println("Чтобы накопить нужную сумму Вам понобится " + (i - 1) + " месяцев.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        double totalDeposit = 15_000;
        int i = 1;
        while (totalDeposit <= 12_000_000) {

            totalDeposit = totalDeposit + totalDeposit * 7 / 100;
            // округлим до копеек полученный результат
            int roundTotal = (int) (totalDeposit * 100);
            double total = (double) (roundTotal / 100.0);
            if (i % 6 == 0) {
                System.out.println("В конце " + i + " месяца сумма вклада равна " + total);
            }
            i++;

        }
        System.out.println("Чтобы накопить нужную сумму Вам понобится " + (i - 1) + " месяцев.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        double totalDeposit = 15_000;
        int mounth = 9 * 12;
        for (int i = 1; i <= mounth; i++) {
            totalDeposit = totalDeposit + totalDeposit * 7 / 100;
            // округлим до копеек полученный результат
            int roundTotal = (int) (totalDeposit * 100);
            double total = (double) (roundTotal / 100.0);
            if (i % 6 == 0) {
                System.out.println("В конце " + i + " месяца сумма вклада равна " + total);
            }


        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int previousPeriod = currentYear - 200;
        int nextPeriod = currentYear + 100;
        for (int cometYear = 79; cometYear <= nextPeriod; cometYear+=79) {
            if (cometYear>=previousPeriod) {

                System.out.println(cometYear);
            }

        }
    }
}

