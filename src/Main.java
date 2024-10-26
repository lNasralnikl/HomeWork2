public class Main {

    public static void main(String[] args) {
    System.out.println("Задача 1");
    byte a = 1;
    short b = 200;
    int c = 1000;
    long d = 1230L;
    float e =15.156f;
    double f = 1.1231;
    System.out.println("Значение переменной a c типом byte равно " + a);
    System.out.println("Значение переменной b c типом short равно " + b);
    System.out.println("Значение переменной c c типом int равно " + c);
    System.out.println("Значение переменной d c типом long равно " + d);
    System.out.println("Значение переменной e c типом float равно " + e);
    System.out.println("Значение переменной f c типом double равно " + f);

    System.out.println();
    System.out.println("Задача 2");
    e = 27.12f;
    d = 987678965549L;
    f = 2.786;
    b = 569;
    c = -159;
    int g = 27897;
    a = 67;
    System.out.println("Значение переменной a c типом byte равно " + a);
    System.out.println("Значение переменной b c типом short равно " + b);
    System.out.println("Значение переменной c c типом int равно " + c);
    System.out.println("Значение переменной d c типом long равно " + d);
    System.out.println("Значение переменной e c типом float равно " + e);
    System.out.println("Значение переменной f c типом double равно " + f);
    System.out.println("Значение переменной g c типом double равно " + g);

    System.out.println();
    System.out.println("Задача 3");
    a = 23;
    b = 27;
    c = 30;
    d = 480L;
    f = (float) d/(a+b+c);
    System.out.println("На каждого ученика рассчитано " + f + " листов бумаги");

    System.out.println();
    System.out.println("Задача 4");
    a = 16;
    b = 2;
    byte PerMinute = (byte) (a/b);
    short h = (short) (20*PerMinute);
    b = (short) (60*24*PerMinute);
    c = b*3;
    d = b*30;
    System.out.println("За 20 минут машина произвела " + h + " штук бутылок");
    System.out.println("За сутки машина произвела " + b + " штук бутылок");
    System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
    System.out.println("За 1 месяц машина произвела " + d + " штук бутылок");

    System.out.println();
    System.out.println("Задача 5");
    a = 120;
    b = 2;
    c = 4;
    d = a/(b+c);
    byte white = (byte) (d*b);
    byte brown = (byte) (d*c);
    System.out.println("В школе, где " + d + " классов, нужно " + white + " белой краски и " + brown + " коричневной краски");

    System.out.println();
    System.out.println("Задача 6");
    int banan = 80*5;
    int milk = 105*2;
    int iceCream = 100*2;
    int egg = 70*4;
    double weight = (banan+milk+iceCream+egg);
    System.out.println("Вес в граммах равен " + weight + " грамм");
    System.out.println("Вес в килограммах равен " + weight/1000 + " килограмм");

    System.out.println();
    System.out.println("Задача 7");
    a = 7;
    b = 250;
    c = 500;
    byte day1 = (byte) (a*1000/b);
    byte day2 = (byte) (a*1000/c);
    byte day3 = (byte) ((day1+day2)/2);
    System.out.println("При потерее " + b + " грамм в день, понадобится " + day1 + " дней");
    System.out.println("При потерее " + c + " грамм в день, понадобится " + day2 + " дней");
    System.out.println("Среднее количество дней для похедения составит " + day3 + " день");

    System.out.println();
    System.out.println("Задача 8");

    int y11 = 67760*12;
    int y12 = 83690*12;
    int y13 = 76230*12;
    float y21 = (float) (y11 * 1.1);
    float y22 = (float) (y12 * 1.1);
    float y23 = (float) (y13 * 1.1);
    float d1 = y21-y11;
    float d2 = y22-y12;
    float d3 = y23-y13;
    System.out.println("Маша теперь получает " + y21 + " рублей. Годовой доход вырос на " + d1 + " рублей");
    System.out.println("Денис теперь получает " + y22 + " рублей. Годовой доход вырос на " + d2 + " рублей");
    System.out.println("Кристина теперь получает " + y23 + " рублей. Годовой доход вырос на " + d3 + " рублей");
    }
}
