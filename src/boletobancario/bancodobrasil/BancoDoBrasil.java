package boletobancario.bancodobrasil;

import boletobancario.Banco;
import boletobancario.Boleto;
import boletobancario.BoletoSimpleFactory;
import boletobancario.bancocaixa.BancoCaixaBoleto10Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto30Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto60Dias;

public class BancoDoBrasil extends Banco {
    @Override
    protected Boleto criarBoleto(int vencimento, double valor) {
        Boleto boleto = null;

        switch (vencimento) {
            case 10:
                boleto = new BancoDoBrasilBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoDoBrasilBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoDoBrasilBoleto60Dias(valor);
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
