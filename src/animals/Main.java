package animals;

public class Main {
    public static void main(String[] args) {
        Animals gazelle = new Herbivores("Газель", 5, "земля", 40, "сено");
        Animals giraffe = new Herbivores("Жираф", 11, "земя", 15, "листья");
        Animals horse = new Herbivores("Лошадь", 3, "земля", 38, "сено");
        Animals hyena = new Predators("Гиена", 4, "земля", 50, "животные");
        Animals tiger = new Predators("Тигр", 10, "земля", 30, "животные");
        Animals bear = new Predators("Медведь", 7, "земля", 18, "растения");
        Animals frog = new Amphibians("Легушка", 1, "земля-вода");
        Animals uzh = new Amphibians("Уж", 3, "вода");
        Animals peacock = new NonFlyingBirds("Павлин", 2, "земля","лапы");
        Animals penguin  = new NonFlyingBirds("Пингвин", 6, "земля","лапы");
        Animals birdDodo  = new NonFlyingBirds("Птица Додо", 3, "земля", "лапы");
        Animals seagull   = new FlyingBirds("Чайка", 1, "воздух","крылья");
        Animals albatross   = new FlyingBirds("Альбатрос", 2, "воздух", "крылья");
        Animals falcon  = new FlyingBirds("Сокол", 7, "воздух", "крылья");

        bear.getName();
        gazelle.eat();
        hyena.eat();
        tiger.eat();
        falcon.sleep();
        seagull.moving();
        System.out.println(birdDodo.equals(albatross));
        System.out.println(penguin.equals(penguin));

    }

}
