public class Application {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar.SportCarBuilder("Audi").setColor("green").setMaxSpeed(300).build();

    }
}
