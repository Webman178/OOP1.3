package animals;

public class Predators extends Mammals{

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed, typeFood);
    }

    public void hunt() {
        System.out.println("Хищник охотится на жертву ");
    }

    @Override
    public void eat() {
        System.out.println("Хищник питается " + getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью ");

    }

    @Override
    public void moving() {
        System.out.println("Хищник перемещается по суше ");
    }

    @Override
    public void walking() {
        System.out.println("Хищник гуляет по полям ");
    }
}
