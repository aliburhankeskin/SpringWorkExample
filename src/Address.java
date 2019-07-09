public class Address implements Entity {

    Sehir sehir;

    public Address(){
        this.sehir = new Sehir("Ankara",6);
    }

    public Sehir getSehir() {

        return sehir;
    }
}
