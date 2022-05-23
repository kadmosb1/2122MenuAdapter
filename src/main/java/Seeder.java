import java.util.ArrayList;

public class Seeder {

    private final ArrayList<MenuChoice> menuChoices;

    public Seeder () {
        menuChoices = new ArrayList<> ();
        menuChoices.add (new MenuChoice1());
        menuChoices.add (new MenuChoice2());
        menuChoices.add (new menukeuze3.Menukeuze());
    }

    public MenuChoice getMenuChoice (int index) {

        if ((index >= 0) && (index < menuChoices.size ())) {
            return menuChoices.get (index);
        }
        else {
            return null;
        }
    }
}
