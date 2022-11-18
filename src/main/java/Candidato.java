public class Candidato {

    public boolean emitirCNH() {

        return CandidatoCascade.verificarPendenciasCNH(this);
    }
}
