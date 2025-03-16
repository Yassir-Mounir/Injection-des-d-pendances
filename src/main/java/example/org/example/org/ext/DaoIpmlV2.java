package example.org.example.org.ext;


import example.org.dao.iDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d2")
public class DaoIpmlV2 implements iDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs .....");
        double t = 24;
        return t;
    }

}
