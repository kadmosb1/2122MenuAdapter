public class MenuChoice2 extends MenuChoice {

    public MenuChoice2() {
        super("Menukeuze 2");
    }

    @Override
    public void execute () {
        System.out.println ();
        System.out.printf ("%s wordt uitgevoerd.%n", getName ());
        System.out.println ();
    }
}
