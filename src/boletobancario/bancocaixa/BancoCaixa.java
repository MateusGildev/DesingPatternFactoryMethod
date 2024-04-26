package boletobancario.bancocaixa;

import boletobancario.Banco;
import boletobancario.Boleto;

public class BancoCaixa extends Banco {


    @Override
    protected Boleto criarBoleto(int vencimento, double valor) {
        Boleto boleto = null;

        switch (vencimento) {
            case 10:
                boleto = new BancoCaixaBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoCaixaBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoCaixaBoleto60Dias(valor);
                break;
            default:
                try {
                    throw new Exception("Vencimento Indisponivel");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
        return boleto;
    }
}
