public class ExamePsicotecnico extends Requisitos {

    private static ExamePsicotecnico examePsicotecnico = new ExamePsicotecnico();

    private ExamePsicotecnico() {};

    public static ExamePsicotecnico getInstancia() {
        return examePsicotecnico;
    }
}
