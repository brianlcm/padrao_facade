import java.util.ArrayList;
import java.util.List;

public abstract class Requisitos {

    private List<Candidato> candidatosComPendencia = new ArrayList<Candidato>();

    public void addCandidatoPendente(Candidato candidato) {
        this.candidatosComPendencia.add(candidato);
    }

    public boolean verificarCandidatoComPendencia(Candidato candidato) {
        return this.candidatosComPendencia.contains(candidato);
    }
}
