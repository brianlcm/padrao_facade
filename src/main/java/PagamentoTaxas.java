public class PagamentoTaxas extends Requisito {
    private static PagamentoTaxas pagamentoTaxas = new PagamentoTaxas();

    private PagamentoTaxas() {};

    public static PagamentoTaxas getInstancia() {
        return pagamentoTaxas;
    }
}
