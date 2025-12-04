public class Puan_Hesabı {
    public String NotPuanı(int number) {
        if(number >=90)
            return "AA";
        else if(number >=85)
            return "BA";
        else if(number >=80)
            return "BB";
        else if(number >=75)
            return "CB";
        else if(number >=70)
            return "CC";
        return "FF";
    }
}
