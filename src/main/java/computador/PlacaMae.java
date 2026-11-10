package computador;

public class PlacaMae implements ComponenteComputador {
    private String nomePlaca;
    private double custo;
    private double lucroMinimo;
    private double lucroMaximo;

    public PlacaMae(String nomePlaca, double custo, double lucroMinimo, double lucroMaximo) {
        this.nomePlaca = nomePlaca;
        this.custo = custo;
        this.lucroMinimo = lucroMinimo;
        this.lucroMaximo = lucroMaximo;
    }

    public String getPlacaNome() {
        return nomePlaca;
    }

    @Override
    public String getNome() {
        return "Placa-Mãe: " + nomePlaca;
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