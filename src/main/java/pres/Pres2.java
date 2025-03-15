package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));

            String daoClassname = scanner.nextLine();//lire premier ligne du fichier texte
            Class cDao= Class.forName(daoClassname);//forname cherche si la classe existe et la charge en mémoire
            IDao dao = (IDao)cDao.getConstructor().newInstance();

            //MetierImpl metier = new MetierImpl(d);
            String metierClassname = scanner.nextLine();//lire premier ligne du fichier texte
            Class cMetier= Class.forName(metierClassname);//forname cherche si la classe existe et la charge en mémoire
            IMetier metier = (IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);


            System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
