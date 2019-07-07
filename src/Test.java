public class Test {

    public static void main(String[] args) {

        Container container = new Container();
        Address address = (Address)container.get("Address");
        String ad = address.getSehir().getAd();

        System.out.println(ad);
    }
}
