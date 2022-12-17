package animals;

public class Herbivores extends Mammals {


    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed, typeFood);
    }


    public void graze() {
        System.out.println("Пасущее травоядное ");
    }



    @Override
    public void eat() {
        System.out.println("Травоядное питается " + getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью ");
    }

    @Override
    public void moving() {
        System.out.println("Травоядное перемещается по суше ");
    }

    @Override
    public void walking() {
        System.out.println("Травоядное гуляет по полям ");
    }
}
