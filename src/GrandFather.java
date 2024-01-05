public class GrandFather {
    private String name;
    private int age;
    private int weight;
    private Home home;
    private CharacterEnum character;

    public Home getHome() {
        return home;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public CharacterEnum getCharacter() {
        return character;
    }

    public GrandFather(String name, int age, int weight, Home home, CharacterEnum character) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.home = home;
        this.character = character;
    }
}
