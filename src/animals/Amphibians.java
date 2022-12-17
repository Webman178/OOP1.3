package animals;

public class Amphibians extends Animals{

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void hunt() {
        System.out.println("Земноводное охотится ");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное питается зеленью и насекомыми ");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит ночью и иногда днем ");
    }

    @Override
    public void moving() {
        System.out.println("Земноводное перемещается по земле или плавает ");
    }
}
