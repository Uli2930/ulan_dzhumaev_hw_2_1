public class Main {
    public static void main(String[] args) {

        Home home = new Home(" Кызыл-тоо ", 34);
        Home home2 = new Home(" Кызыл-тоо ", 34);
        Father father = new Father("Улан", 35, 98, home, CharacterEnum.GENEROUS);
        System.out.println(father.getInfo());
        father.saySomething();
        father.saySomething("Идите спать!!!");

        System.out.println("---------------------");

        Son son1 = new Son("Режеп", 5, 20, home2, CharacterEnum.GREEDY);
        System.out.println(son1.getInfo());

        System.out.println("---------------------");

        Son son2 = new Son("Эрдем", 3, 15, home2, CharacterEnum.KIND);
        System.out.println(son2.getInfo());
    }
}