public class MenuChoice1 extends MenuChoice {

    public MenuChoice1() {
        super("Menukeuze 1");
    }

    @Override
    public void execute () {
        System.out.println ();
        System.out.printf ("%s wordt uitgevoerd.%n", getName ());
        System.out.println ();
    }
}
