public class ExamePsicotecnico extends Requisito {

    private static ExamePsicotecnico examePsicotecnico = new ExamePsicotecnico();

    private ExamePsicotecnico() {};

    public static ExamePsicotecnico getInstancia() {
        return examePsicotecnico;
    }
}
