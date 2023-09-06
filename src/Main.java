public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        for (byte a = 1; a <= 10; a++) System.out.println("Итерация цикла " + a);
        System.out.println();

        System.out.println("ЗАДАЧА 2");
        for (byte b = 10; b >= 1; b--) System.out.println("Итерация цикла " + b);
        System.out.println();

        System.out.println("ЗАДАЧА 3");
        for (int c = 0; c <= 17; c = c + 2) System.out.println("Четное число " + c);
        System.out.println();

        System.out.println("ЗАДАЧА 4");
        for (byte d = 10; d >=-10; d--) System.out.println("Итерация цикла " + d);
        System.out.println();

        System.out.println("ЗАДАЧА 5");
        for (int e = 1904; e <= 2096; e = e + 4) System.out.println("Високосный год: " + e);
        System.out.println();

        System.out.println("ЗАДАЧА 6");
        for (int f = 7; f <= 98; f = f + 7) System.out.println("Итерация цикла " + f);
        System.out.println();

        System.out.println("ЗАДАЧА 7");
        for (int g = 1; g <= 512; g = g * 2) System.out.println("Итерация цикла " + g);
        System.out.println();

        System.out.println("ЗАДАЧА 8");
        int capital = 29_000;
        int total = 0;
        for (byte month = 1; month <= 12; month++) {
            total = total + capital;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("ЗАДАЧА 9");
        capital = 29_000;
        total = 0;
        for (byte month = 1; month <= 12; month++) {
            total = total + total/100;
            total = total + capital;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("ЗАДАЧА 10");
        byte h1 = 2;
        for (byte h2 = 1; h2 <= 10; h2++) {
            int res = h1 * h2;
            System.out.println(h1 + "*" + h2 + "=" + res);
        }
    }
}