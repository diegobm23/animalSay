public class App {

    public static final String COW = "cow";
    public static final String PIKACHU = "pikachu";

    public static void print(String message) {
        System.out.print(message);
    }

    public static void printHelp() {
        String help = "You need to pass two arguments: \n" +
                "animalSay [animal] [message] \n\n" +
                "Example: \n" +
                "animalSay \"cow\" \"Hello World!\"";

        print(help);
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            printHelp();
        }

        String animal = args[0];
        String phrase = args[1];

        switch (animal) {
            case COW -> {
                Cow cow = new Cow(phrase);
                print(cow.say());
            }
            case PIKACHU -> {
                Pikachu pikachu = new Pikachu(phrase);
                print(pikachu.say());
            }
            default -> print("Sorry, Animal not implemented yet.");
        }

        System.exit(0);
    }

}
