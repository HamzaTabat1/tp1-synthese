package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.printf("Version base de données");
        double temp = 23;
        return temp;
    }
}
