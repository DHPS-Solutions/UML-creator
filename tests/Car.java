public class Car {

    private final String model;
    private final int year;
    private int position;
    
    public Car(String model, int year, int position) {
        this.model = model;
        this.year = year;
        this.position = position;
    }

    public void drive(int position) {
        this.position = position;
        return;
    }
}
