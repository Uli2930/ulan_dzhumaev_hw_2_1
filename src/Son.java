final public class Son extends Father{
    public Son(String name,int age, int weight, Home home,CharacterEnum character) {
        super(name, age, weight, home, character);

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName " + getName() +
                "\nWeight " + getWeight() +
                "\nAddress " + getHome().getAddresName() + getHome().getAddresNumber();

    }
}
