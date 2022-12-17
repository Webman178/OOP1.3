package animals;

public class NonFlyingBirds extends Birds{



    public NonFlyingBirds(String name, int age, String livingEnvironment, String movement) {
        super(name, age, livingEnvironment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Нелетающяя птица есть насекомых и рыбу ");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающяя птица спит ночью ");
    }

    @Override
    public void moving() {
        System.out.println("Нелетающяя птица перемещается по " + getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающяя птица охотится на суше ");
    }
}
