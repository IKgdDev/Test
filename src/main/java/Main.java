public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<String>(3);

        System.out.println(magicBox.add("Petr"));
        System.out.println(magicBox.add("Oleg"));
        System.out.println(magicBox.add("Sasha"));
        System.out.println(magicBox.add("Misha"));

        System.out.println(magicBox.pick());

    }
}
