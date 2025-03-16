package example.org.pres;
import example.org.dao.iDao;
import example.org.metier.MetierImpl;
import example.org.metier.iMetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();

//        System.out.println(daoClassName);

        Class cDao = Class.forName(daoClassName);
        iDao dao = (iDao) cDao.newInstance();
        System.out.println(dao.getClass());
        System.out.println(dao.getData());


        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
//        iMetier metier = (iMetier) cMetier.getConstructor(iDao.class).newInstance();
        iMetier metier = (iMetier) cMetier.getConstructor().newInstance();
        Method setDao = cMetier.getDeclaredMethod("setDao", iDao.class);
        setDao.invoke(metier, dao);
        System.out.println(metier.getClass());
        System.out.println("RES = "+metier.Calcul());

        System.out.println("=====================");

        String daoClassNameV2 = scanner.nextLine();
        Class cDaov2 = Class.forName(daoClassNameV2);
        iDao daov2 = (iDao) cDaov2.newInstance();
        System.out.println(daov2.getClass());
        System.out.println(daov2.getData());

        setDao.invoke(metier, daov2);
        System.out.println(metier.getClass());
        System.out.println("RES = "+metier.Calcul());

    }
}
