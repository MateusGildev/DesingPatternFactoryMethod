package boletobancario;

import boletobancario.bancocaixa.BancoCaixaBoleto10Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto30Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto60Dias;

public class BoletoSimpleFactory {

    public Boleto criarBoleto(int vencimento, double valor) throws Exception{
        Boleto boleto;
        switch (vencimento){
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
                throw new Exception("Vencimento Indisponivel");
        } return boleto;
    }
}
