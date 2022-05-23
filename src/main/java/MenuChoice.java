public abstract class MenuChoice {

    private final String name;

    public MenuChoice (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public abstract void execute ();
}