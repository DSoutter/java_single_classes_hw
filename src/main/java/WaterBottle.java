public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drinkWater() {
        this.volume = this.volume - 10;
    }

    public void emptyBottle() {
        this.volume = 0;
    }
}
