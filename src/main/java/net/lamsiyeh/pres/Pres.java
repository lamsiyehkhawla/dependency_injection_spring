package net.lamsiyeh.pres;

import net.lamsiyeh.dao.DaoImpl;
import net.lamsiyeh.metier.IMetier;
import net.lamsiyeh.metier.IMetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        IMetier metier= new IMetierImpl(dao);
        //metier.setIdao(dao)
        System.out.println("RES"+metier.calcule());
    }
}
