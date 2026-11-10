package computador;

public class CPU implements ComponenteComputador {
    private String modelo;
    private double custo;
    private double lucroMinimo;
    private double lucroMaximo;

    public CPU(String modelo, double custo, double lucroMinimo, double lucroMaximo) {
        this.modelo = modelo;
        this.custo = custo;
        this.lucroMinimo = lucroMinimo;
        this.lucroMaximo = lucroMaximo;
    }

    @Override
    public String getNome() {
        return "CPU: " + modelo;
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