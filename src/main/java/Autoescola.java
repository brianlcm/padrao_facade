public class Autoescola extends Requisitos {
    private static Autoescola autoescola = new Autoescola();

    private Autoescola() {};

    public static Autoescola getInstancia() {
        return autoescola;
    }
}
