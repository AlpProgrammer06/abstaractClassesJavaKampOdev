package interfaces;

import interfaces.ICustomerDal;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Oracle eklendi. ");
    }
}
