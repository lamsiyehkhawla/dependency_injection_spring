package net.lamsiyeh.pres;

import net.lamsiyeh.dao.IDao;
import net.lamsiyeh.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        //IMetier metier= (IMetier) cMetier.newInstance();
        //Method setDaoMethod = cMetier.getMethod("setDao", IDao.class);
        //setDaoMethod.invoke(metier, dao);
        System.out.println("RES"+metier.calcule());

    }

}
