public class SportCar {

    private final String name;
    private final String color;
    private final Integer maxSpeed;

    private SportCar(SportCarBuilder sportCarBuilder) {
        this.name = sportCarBuilder.name;
        this.color = sportCarBuilder.color;
        this.maxSpeed = sportCarBuilder.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    static class SportCarBuilder{

        private String name;
        private String color;
        private Integer maxSpeed;

        public SportCarBuilder(String name) {
            this.name = name;
        }

        public SportCarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public SportCarBuilder setMaxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }
    }
}
