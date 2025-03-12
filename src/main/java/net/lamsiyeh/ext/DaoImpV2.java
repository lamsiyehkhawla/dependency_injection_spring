package net.lamsiyeh.ext;

import net.lamsiyeh.dao.DaoImpl;
import net.lamsiyeh.dao.IDao;

public class DaoImpV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ....");
        double t = 12;
        return t;
    }
}
