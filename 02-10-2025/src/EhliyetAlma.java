import java.util.Scanner;

public class EhliyetAlma {
    public static void main()
    {
        Scanner inputs = new Scanner(System.in);
        System.out.println("----- *** Ehliyet İçin Yaş Koşulu Saglarmı Programı *** -----");
        System.out.print("Yaşınızı Giriniz:");
        int age = inputs.nextInt();
        if (age >= 18 && age <= 75)
        {
            System.out.println("Ehliyet Alabilirsin");
        } else
        {
            System.out.println("Ehliyet Alamazsın");
        }
        System.out.println("----- *** Sayı Çift/Tek Oldugu Bulma *** -----");
        System.out.print("Sayı Giriniz:");
        int number = inputs.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Sayı Çifttir");
        } else
        {
            System.out.println("Sayı Tektir");
        }
        System.out.println("----- *** 5 => 9 a Kadar Olan Sayıların Çarpımı *** -----");
        int total = 1;
        for (int i = 5; i < 10; i++)
        {
            total *= i;
        }
        System.out.println(total);
        System.out.println("----- *** İstenilen Sayılar Arasındaki Sayıların Toplamı *** -----");
        System.out.print("Başlangıç Sayısını Giriniz:");
        int startNumber = inputs.nextInt();
        System.out.print("Bitiş Sayısını Giriniz:");
        int endNumber = inputs.nextInt();
        total = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println("----- *** Verilen Sayının Basamak Sayısını Bulma *** -----");
        System.out.print("Sayı Giriniz:");
        number = inputs.nextInt();
        int number_of_Digits = 0;
        while (number > 0)
        {
            number = number /10;
            number_of_Digits ++;
        }
        System.out.println(number_of_Digits);
        System.out.println("----- *** Verilen Sayının Basamaklar Toplamını Bulma *** -----");
        System.out.print("Sayı Giriniz:");
        number = inputs.nextInt();
        int digitSum = 0;
        while (number > 0)
        {
            digitSum += number % 10;
            number = number /10;
        }
        System.out.println(digitSum);
        }
    }
