import menukeuze3.Menukeuze;

public class MenuChoice3Adapter extends MenuChoice {

    private static final Menukeuze menukeuze3 = new Menukeuze ();

    public MenuChoice3Adapter () {
        super(menukeuze3.getMenukeuze ().substring (4));
    }

    @Override
    public void execute() {
        System.out.println ();
        menukeuze3.voerMenukeuzeUit ();
        System.out.println ();
    }
}
