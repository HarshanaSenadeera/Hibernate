package lk.ijse.hibernate.util;

public class Factoryconfigaration {

    private static Factoryconfigaration factoryconfigaration;

    private Factoryconfigaration(){

    }

    public static Factoryconfigaration getInstance(){
        return (factoryconfigaration==null) ? factoryconfigaration=new Factoryconfigaration():
                factoryconfigaration;
    }
}
