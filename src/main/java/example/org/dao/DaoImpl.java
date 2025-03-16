package example.org.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImpl implements iDao{
    @Override
    public double getData() {
        System.out.println("Version Base De Donnee");
        double t = 34;
        return t;
    }
}
