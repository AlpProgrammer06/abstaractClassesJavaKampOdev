package interfaces;

public class Main {
    public static void main(String[] args) {
       //ICustomerDal iCustomerDal =new OracleCustomerDal();   //bir lass birden fazla interfaces 'i implemete edebilir.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();



    }
}


// interfacesler newlenemez.