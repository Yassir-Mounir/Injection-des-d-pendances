package example.org.pres;

import example.org.dao.DaoImpl;
import example.org.example.org.ext.DaoIpmlV2;
import example.org.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        DaoIpmlV2 d2 = new DaoIpmlV2();
        MetierImpl metier = new MetierImpl(d2);
//        metier.setDao(d);
        System.out.println("RES = "+metier.Calcul());
    }
}
