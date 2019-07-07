public class Container {

    public BeanContainer get(String bean){

        if("Personel".equals(bean)){

            return new Personel();
        }
        else if("Sehir".equals(bean)){

            return new Sehir();
        }
        else if("Address".equals(bean)){

            return new Address();
        }
        return null;
    }
}
