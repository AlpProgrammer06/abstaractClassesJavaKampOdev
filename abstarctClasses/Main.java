public class Main {
    public static void main(String[] args) {
       WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
       womanGameCalculator.hesapla();
       womanGameCalculator.GameOver();

      /* GameCalculator gameCalculator = new WomanGameCalculator();
       gameCalculator.hesapla();*/
        GameCalculator gameCalculator = new OlderGameCalculator();
        gameCalculator.hesapla();


    }
}