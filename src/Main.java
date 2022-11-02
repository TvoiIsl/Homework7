public class Main {
    public static void main(String[] args) {
        for (int a = 1; a<=10; a++ )
        {
        System.out.println(a);
        }// Задание 1.1

        for (int a = 10; a>=1; a-- )
        {
            System.out.println(a);
        }// Задание 1.2

        for (int a = 0; a<=17; a=a+2 )
        {
            System.out.println(a);
        }// Задание 1.3

        for (int a = 10; a>=-10; a-- )
        {
            System.out.println(a);
        }// Задание 1.4

        for (int a = 1904; a<2096; a=a+4 )
        {
            System.out.println(a+" год является високосным");
        }// Задание 2.1

        for (int a = 7; a<=98; a=a+7 )
        {
            System.out.println(a);
        }// Задание 2.2

        for (int a = 1; a<=512; a=a*2 )
        {
            System.out.println(a);
        }// Задание 2.3

        int contribution = 29000;
        int total = 0;
        for (int i=0; i<12; i++)
        {
            total=total+contribution;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Итого "+total);// Задание 3.1

        int contribution1 = 29000;
        int total1 = 0;
        for (int i=0; i<12; i++)
        {
            total1=total1+total1/100;
            total1=total1+contribution1;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total1+" рублей");
        }
        System.out.println("Итого "+total1);// Задание 3.2
    }
}