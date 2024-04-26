package boletobancario.bancodobrasil;

import boletobancario.Boleto;

public class BancoDoBrasilBoleto10Dias extends Boleto {

    public BancoDoBrasilBoleto10Dias(double valor) {
        this.valor = valor;
        this.juros = 0.3;
        this.desconto = 0.05;
        this.multa = 0.02;
    }
}
