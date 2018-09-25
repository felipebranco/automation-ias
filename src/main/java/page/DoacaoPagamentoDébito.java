package page;

public class DoacaoPagamentoDébito {

    DoacaoPage doacao = new DoacaoPage();

    public void PagamentoDébito() {
        doacao.setDébitoemConta();
        doacao.setItau();
        doacao.SetMelhorDiaDebito("data-debito", "1");
        doacao.setdebitoAgencia("0001");
    }
}
