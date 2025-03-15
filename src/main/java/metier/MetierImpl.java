package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

   private IDao dao;
   //injection dépendances via le constructeur
   public MetierImpl(IDao dao){
       this.dao = dao;
   }

    @Override
    public double calcul() {
       double t = dao.getData();
        return t*43/3;
    }
}
