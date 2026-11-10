package computador;

public class HARDDIKS implements ComponenteComputador {
    private String modelo;
    private double custo;
    private double lucroMinimo;
    private double lucroMaximo;

    public HARDDIKS(String modelo, double custo, double lucroMinimo, double lucroMaximo) {
        this.modelo = modelo;
        this.custo = custo;
        this.lucroMinimo = lucroMinimo;
        this.lucroMaximo = lucroMaximo;
    }

    @Override
    public String getNome() {
        return "Armazenamento: " + modelo;
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