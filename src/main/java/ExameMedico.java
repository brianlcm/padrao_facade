public class ExameMedico extends Requisito {

    private static ExameMedico exameMedico = new ExameMedico();

    private ExameMedico() {};

    public static ExameMedico getInstancia() {
        return exameMedico;
    }
}
