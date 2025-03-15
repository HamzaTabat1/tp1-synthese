package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.printf("Version web service");
        double temp = 41;
        return temp;
    }
}
