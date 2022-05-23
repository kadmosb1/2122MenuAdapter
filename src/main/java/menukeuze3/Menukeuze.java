package menukeuze3;

public class Menukeuze {

    int index = 5;
    String keuze = "Toon studenten";

    public String getMenukeuze () {
        return String.format ("%d - %s", index, keuze);
    }

    public void voerMenukeuzeUit () {
        System.out.println ("Ingeschreven studenten: ");
        System.out.println ("Mohammed Pieterse");
        System.out.println ("Sara Albers");
    }
}