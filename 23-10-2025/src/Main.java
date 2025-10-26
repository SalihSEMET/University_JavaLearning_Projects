void main()
{

     int sonuç = fonk(5);
     System.out.println(sonuç);
     sonuç = fonk(10);
     System.out.println(sonuç);
     fonk(5,3);
     faktoriyel(4);
     faktoriyel(6);
     basamakBul(345);
     System.out.println(asalMi(3));
     System.out.println(asalMi(10));
     System.out.println(asalMi(11));
     System.out.println(asalMi(-9));
}
int fonk(int x)
{
    return (x * x) + 2;
}
int fonk(int x,int y){
    int resoult = 1;
    for (int i = 0; i < y; i++)
    {
        resoult = resoult * x;
    }
    System.out.println(resoult);
    return resoult;
}
int faktoriyel(int x){
    int result = 1;
    for (int i = x; i > 0; i--)
    {
        result = result * i;
    }
    System.out.println(result);
    return result;
}
int basamakBul(int sayi)
{
    int sonuc = 0;
    while (sayi > 0)
    {
        sayi = sayi / 10;
        sonuc++;
    }
    System.out.println(sonuc);
    return sonuc;
}
boolean asalMi(int sayi)
{
    if (sayi < 0)
        return false;
    for (int i = 2; i < sayi; i++)
    {
        if (sayi % i == 0)
            return false;
    }
    return true;
}