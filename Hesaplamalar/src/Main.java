void main() {
    Matamatik_Fonksiyonlar matamatikFonksiyonlar = new Matamatik_Fonksiyonlar();
    Puan_Hesabı puanHesabı = new Puan_Hesabı();
    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen Sayı giriniz");
    int number = scan.nextInt();
    System.out.println(matamatikFonksiyonlar.KupAl(number));
    System.out.println("Lütfen Notunuzu Giriniz:");
    int not = scan.nextInt();
    String HarfNotu = puanHesabı.NotPuanı(not);
    System.out.println(HarfNotu);
    int[] dizi = {5,1,3,7,11,2,6,4,3};
    System.out.println(Arrays.toString(dizi));
    System.out.println("Aradıgınız Sayıyı Giriniz:");
    int number1 = scan.nextInt();
    int aranansayıIndex = DiziKarakterIndex(dizi, number1);
    System.out.println("Aradıgınız Sayının İndexi:" + aranansayıIndex);
}
public static int DiziKarakterIndex(int[] array,int aranansayı){
    int result = Arrays.binarySearch(array,aranansayı);
    return  result;
}
public static double DiziOrtalaması(int[] array){
    int diziuzunlugu = array.length;
    int total = 0;
    for (int i = 0; i < diziuzunlugu; i++) {
        total += array[i];
    }
    return total / diziuzunlugu;
}

