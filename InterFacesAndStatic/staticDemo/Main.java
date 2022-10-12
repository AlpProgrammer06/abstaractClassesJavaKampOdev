package staticDemo;

public class Main {
    public static void main(String[]args){


        Product product =new Product();
        product.name="Mause";
        product.price=10;
        product.id=1;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DataBaseHelper.Connection.createConnection();   // bu yöntem var inner class ama önerilmiyor.



    }
}


// yardımcı araçlar da static kullanılabilir ama manager sınıflar static kullanılamazlar.

//bir metdodu static yaptğımızda clas ism nokta diyip çağırabiliriz

// static yapıcı blok çalışmasının sebebi statik olması altındaki yapıcı
// blokun çalışmama sebebi static olmadığı için newlenmesi gerekiyor newlemedik o yüzden çalışmadı.

// ana class static olmaz ama ana classın içinde bir class daha açarsak
// bu static olabilir buna innerClass denir ana classın içinde gruplandırma maksatlı kullanılır
