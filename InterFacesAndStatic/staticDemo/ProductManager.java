package staticDemo;

public class ProductManager {

    static {
        System.out.println("Static Yapıcı blok çalıştı ");
    }

    public void ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public  void add(Product product){
       //ProductValidator productValidator =new ProductValidator(); bu şekilde kullanmak istemiyor
       if(ProductValidator.isValid(product)){
           System.out.println("Eklendi");
       }else {
           System.out.println("Ürün bilgileri geçersizdir ");
       }
    }
}











// ürünü veri tabanına ekleyen nesne

