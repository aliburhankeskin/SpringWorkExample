
public class Personel implements BeanContainer {

    String Ad;
    String Soyad;
    public Address address;

    public Personel(){
        this.Ad = "ali";
        this.Soyad = "keskin";
    }

    public Personel(String ad,String soyad){
        this.Ad = ad;
        this.Soyad = soyad;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public Address getAddress() {
        return address;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }
}
