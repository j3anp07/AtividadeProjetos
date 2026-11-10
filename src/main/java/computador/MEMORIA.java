package computador;

public class MEMORIA implements ComponenteComputador {
    private String capacidade;
    private double custo;
    private double lucroMinimo;
    private double lucroMaximo;

    public MEMORIA(String capacidade, double custo, double lucroMinimo, double lucroMaximo) {
        this.capacidade = capacidade;
        this.custo = custo;
        this.lucroMinimo = lucroMinimo;
        this.lucroMaximo = lucroMaximo;
    }

    @Override
    public String getNome() {
        return "Memória " + capacidade;
    }

    @Override
    public double getPrecoCusto() {
        return custo;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return lucroMinimo;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return lucroMaximo;
    }
}