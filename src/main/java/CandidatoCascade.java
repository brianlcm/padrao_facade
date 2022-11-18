public class CandidatoCascade {
    public static boolean verificarPendenciasCNH(Candidato candidato) {
        if (Autoescola.getInstancia().verificarCandidatoComPendencia(candidato)) {
            return false;
        }
        if (ExameMedico.getInstancia().verificarCandidatoComPendencia(candidato)) {
            return false;
        }
        if (ExamePsicotecnico.getInstancia().verificarCandidatoComPendencia(candidato)) {
            return false;
        }
        if (PagamentoTaxas.getInstancia().verificarCandidatoComPendencia(candidato)) {
            return false;
        }
        return true;
    }
}
