public class Sehir implements Entity {

    int plakaNo;
    String ad;

    public Sehir(){
        this.ad = "Konya";
        this.plakaNo = 42;
    }

    public Sehir(String ad,int plakaNo){
        this.ad = ad;
        this.plakaNo = plakaNo;
    }

    public String getAd() {
        return ad;
    }
}
