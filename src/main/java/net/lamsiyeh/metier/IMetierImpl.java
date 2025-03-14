package net.lamsiyeh.metier;

import net.lamsiyeh.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {


    private IDao idao=null;//couplage faible
    @Override
    public double calcule() {
        double t = idao.getData();
        double res=t*12*Math.PI/2*Math.cos(t);
        return res;
    }

    /**
     * Pour injecter dans l'attribue dao
     * un object d'une classe qui implement l'interface IDao
     * apres l'instantstion
     */

    public void setIdao(IDao idao) {
        this.idao = idao;
    }

    public IMetierImpl(@Qualifier("d") IDao idao) {
        this.idao = idao;
    }

   /* public IMetierImpl() {
    }*/
}
