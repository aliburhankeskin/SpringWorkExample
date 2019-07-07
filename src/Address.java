public class Address implements BeanContainer{

    Sehir sehir;

    public Address(){
        this.sehir = new Sehir("Ankara",6);
    }

    public Sehir getSehir() {

        return sehir;
    }
}
