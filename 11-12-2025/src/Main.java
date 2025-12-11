void main() {
}
public static int Fibonacci(int n){
    if(n==0)return 1;
    if(n==1) return 1;
    return Fibonacci(n-1) + Fibonacci(n-2);
}
public static int üsal(int taban,int üs){
    int sonuç= 1;
    for (int i = 1; i <= üs; i++) {
        sonuç*= taban;
    }
    int i = 0;
    sonuç = 1;
    while (i < üs) {
        sonuç *= taban;
    }
    return sonuç;
}
public static int faktoriyel(int sayı){
    int sonuç = 1;
    for (int i = 1; i <= sayı; i++) {
        sonuç *= sayı;
        sayı --;
    }
    return sonuç;
}
public static boolean Kontrol(String kullanıcıAdı,String sifre){
    if(!kullanıcıAdı.equals("admin")){
        System.out.println("Böyle bir Kullanıcı Yok");
        return false;
    }
    else if(!sifre.equals("123456")){
        System.out.println("Şifreyi Yanlış Girdiniz");
        return false;
    }
    else{
        System.out.println("Başarıya Giriş Yaptınız");
        return true;
    }
}
public static void Yazdır(String ad,int kere){
    boolean sonuc = Kontrol("Ali","123");
    System.out.println(sonuc);
    Kontrol("admin","123456");
    System.out.println("Merhaba" + ad + kere + "Giriş Yaptınız");
}
