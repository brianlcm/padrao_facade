public class Autoescola extends Requisito {
    private static Autoescola autoescola = new Autoescola();

    private Autoescola() {};

    public static Autoescola getInstancia() {
        return autoescola;
    }
}
