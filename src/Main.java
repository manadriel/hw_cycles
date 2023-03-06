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
        task9();
        task10();
    }

    public static void task1() { //from 1 to 10
        System.out.println("Задача 1");
        for (int i = 1; i<=10; i++) {
            System.out.println(" " + i);
        }
    }
    public static void task2() { //from 10 to 1
        System.out.println("Задача 2");
        for (int i = 10; i>=1; i = i-1) {
            System.out.println(" " + i);
        }
    }
    public static void task3() { //from 0 to 17, but only even numbers
        System.out.println("Задача 3");
        for (int i = 0; i<=17; i = i + 2) {
            System.out.println(" " + i);
        }
    }
    public static void task4() { //from 10 to -10
        System.out.println("Задача 4");
        for (int i = 10; i>=-10; i = i - 1) {
            System.out.println(" " + i);
        }
    }
    public static void task5() { //leap years from 1904 to 2096, if 1904 - leap year
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println(" " + i);
        }
    }
    public static void task6() { //out 7 14 21 28 35 42 49 56 63 70 77 84 91 98 using for
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(" " + i);
        }
    }
    public static void task7() { //out 1 2 4 8 16 32 64 128 256 512 using for
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(" " + i);
        }
    }
    public static void task8() { //savings for the year/month
        System.out.println("Задача 8");
        int accum = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++ ) {
            total = total + accum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Всего " + total + "рублей");
    }
    public static void task9() { //savings for the year/month but 12% per year
        System.out.println("Задача 9");
        int accumBank = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++ ) {
            total = total + total/100;
            total = total + accumBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Всего " + total + "рублей");
    }
    public static void task10() { //multiplication table by 2
        System.out.println("Задача 10");
        int a = 0;
        int mult = 0;
        for (int i = 1; i < 10; i++ ) {
            a = a + 1;
            mult = a * 2;
            System.out.println("2 * " + a + " = " + mult);
        }

    }
}