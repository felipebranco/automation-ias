package page;

public class DoacaoPagamentoCartão {

    DoacaoPage doacao = new DoacaoPage();

    public void PagamentoCartao() {
        doacao.setCartaodeCredito();
        doacao.setVisa();
        doacao.setNomeCartao("Teste Teste");
        doacao.setNumerocartao("0000000000000001");
        doacao.setCartaocodigo("123");
        doacao.setMes("12", "12");
        doacao.setAno("2027", "2027 ");

    }
}
