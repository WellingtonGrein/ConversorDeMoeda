enum TipoMoeda {
    DOLAR("Dolar - US$", 1.0),
    EURO("Euro - €", 0.91064116),
    REAL("Real - R$", 5.4574825),
    LIBRA("Libra Estrelina - £", 0.76193978);

    private final String nome;
    private final double taxaParaDolar;

    TipoMoeda(String nome, double taxaParaDolar) {
        this.nome = nome;
        this.taxaParaDolar = taxaParaDolar;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaParaDolar() {
        return taxaParaDolar;
    }

    public double converterPara(TipoMoeda moedaDestino, double valor) {
        double valorEmDolar = valor / this.taxaParaDolar;
        return valorEmDolar * moedaDestino.getTaxaParaDolar();
    }
}