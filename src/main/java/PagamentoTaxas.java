public class PagamentoTaxas extends Requisitos {
    private static PagamentoTaxas pagamentoTaxas = new PagamentoTaxas();

    private PagamentoTaxas() {};

    public static PagamentoTaxas getInstancia() {
        return pagamentoTaxas;
    }
}
