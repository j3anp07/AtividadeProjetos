package computador;

import java.util.ArrayList;
import java.util.List;

public class PlacaVideo implements ComponenteComputador {
    private String modelo;
    private double custoProprio;
    private double lucroMinProprio;
    private double lucroMaxProprio;
    private List<ComponenteComputador> componentes = new ArrayList<>();

    public PlacaVideo(String modelo, double custo, double lucroMin, double lucroMax) {
        this.modelo = modelo;
        this.custoProprio = custo;
        this.lucroMinProprio = lucroMin;
        this.lucroMaxProprio = lucroMax;
    }

    public void add(ComponenteComputador componente) {
        componentes.add(componente);
    }

    @Override
    public String getNome() {
        return "Placa de Vídeo " + modelo;
    }

    @Override
    public double getPrecoCusto() {
        double total = custoProprio;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoCusto();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMinimo() {
        double total = lucroMinProprio;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoLucroMinimo();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMaximo() {
        double total = lucroMaxProprio;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoLucroMaximo();
        }
        return total;
    }
}