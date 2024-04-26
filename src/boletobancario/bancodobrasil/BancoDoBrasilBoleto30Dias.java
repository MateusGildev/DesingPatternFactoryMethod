package boletobancario.bancodobrasil;

import boletobancario.Boleto;

public class BancoDoBrasilBoleto30Dias extends Boleto {

    public BancoDoBrasilBoleto30Dias(double valor){
        this.valor = valor;
        this.juros = 0.05;
        this.desconto=0.02;
        this.multa = 0.05;
    }
}
