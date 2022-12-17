package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String ColorBody;
    private int maxSpeed;
    protected double fuelPercentage;
    protected String typeFuel;


    public Transport(String brand, String model, int year, String country, String colorBody, int maxSpeed,double fuelPercentage,String typeFuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setFuelPercentage(fuelPercentage);
        this.typeFuel = typeFuel;
        if (typeFuel == null || typeFuel.isEmpty()) {
            this.typeFuel = "бензин";
            System.out.println("Неверный вид топлива!");
        } else {
            typeFuel=typeFuel.trim();
            if(typeFuel.equals("бензин"))
                    this.typeFuel = "бензин";
            else if (typeFuel.equals("дизель"))
                    this.typeFuel = "дизель";
            else if (typeFuel.equals("электро"))
                    this.typeFuel = "электро";
            else {

                    this.typeFuel = "бензин";
                    System.out.println("Неверный вид топлива!");
                }
            }

        this.ColorBody = colorBody;
        setColorBody(colorBody);
        setMaxSpeed(maxSpeed);
    }

    public void refill() {
        System.out.printf("Тип топлива %s %.2f",typeFuel,fuelPercentage);
        System.out.println("%");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColorBody() {
        return ColorBody;
    }

    public void setColorBody(String colorBody) {
        if (colorBody == null || colorBody.isEmpty()) {
            colorBody = "Черный";
        }
            this.ColorBody = colorBody;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage >= 0 && fuelPercentage <= 100) {
            this.fuelPercentage = fuelPercentage;
        } else {
            this.fuelPercentage = 60.00;
            System.out.println("Ошибка, неверное значение!");
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", ColorBody='" + ColorBody + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
