public abstract class GameCalculator {
    public abstract void hesapla();

    public final void GameOver(){    // final anahtar kelimesi  GameOver() metodunun override edilmesini engeller
        System.out.println("Oyun bitti...");
    }

}
