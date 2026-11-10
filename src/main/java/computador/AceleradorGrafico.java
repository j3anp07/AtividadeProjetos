package computador;

public class AceleradorGrafico implements ComponenteComputador {
    private String chip;
    private double custo;
    private double lucroMinimo;
    private double lucroMaximo;

    public AceleradorGrafico(String chip, double custo, double lucroMinimo, double lucroMaximo) {
        this.chip = chip;
        this.custo = custo;
        this.lucroMinimo = lucroMinimo;
        this.lucroMaximo = lucroMaximo;
    }

    @Override
    public String getNome() {
        return "Chip Gráfico " + chip;
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