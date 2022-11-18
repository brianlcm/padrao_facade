public class ExameMedico extends Requisitos {

    private static ExameMedico exameMedico = new ExameMedico();

    private ExameMedico() {};

    public static ExameMedico getInstancia() {
        return exameMedico;
    }
}
