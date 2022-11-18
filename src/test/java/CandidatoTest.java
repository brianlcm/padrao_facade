import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    @Test
    void deveRetornarPendenciaAutoescolaEmissaoCNH() {
        Candidato candidato = new Candidato();
        Autoescola.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.emitirCNH());
    }

    @Test
    void deveRetornarPendenciaExameMedicoEmissaoCNH() {
        Candidato candidato = new Candidato();
        ExameMedico.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.emitirCNH());
    }

    @Test
    void deveRetornarPendenciaExamePsicotecnicoEmissaoCNH() {
        Candidato candidato = new Candidato();
        ExamePsicotecnico.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.emitirCNH());
    }

    @Test
    void deveRetornarPendenciaPagamentoTaxasEmissaoCNH() {
        Candidato candidato = new Candidato();
        PagamentoTaxas.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.emitirCNH());
    }

    @Test
    void deveRetornarCandidatoSemPendenciaEmissaoCNH() {
        Candidato candidato = new Candidato();

        assertEquals(true, candidato.emitirCNH());
    }

}