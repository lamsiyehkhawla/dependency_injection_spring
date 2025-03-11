package net.lamsiyeh.pres;

import net.lamsiyeh.dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();
        System.out.println(dao.getData());
    }
}
