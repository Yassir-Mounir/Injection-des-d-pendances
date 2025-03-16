package example.org.metier;

import example.org.dao.iDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements iMetier {
//    @Autowired
//    @Qualifier("d")
    private iDao dao;


    public MetierImpl(@Qualifier("d2") iDao dao) {
        this.dao = dao;
    }

    @Override
    public double Calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }

    public void setDao(iDao dao) {
        this.dao = dao;
    }
}
