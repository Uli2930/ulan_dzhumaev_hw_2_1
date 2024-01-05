public class Father extends GrandFather{


    public Father(String name, int age, int weight, Home home, CharacterEnum character) {
        super(name, age, weight, home, character);
    }

    public void saySomething () {
        System.out.println("Давайте кушать!");
    }
    final public void saySomething (String say) {
        System.out.println(say);
    }

    public String getInfo() {
        return "Name " + getName() +
                "\nAge " + getAge() +
                "\nAddres" + getHome().getAddresName() +
                "\nCharacter " + getCharacter();
    }

}
