package computador;

import java.util.ArrayList;
import java.util.List;

public class Computador implements ComponenteComputador {
    private String nome;
    private List<ComponenteComputador> componentes = new ArrayList<>();

    public Computador(String nome) {
        this.nome = nome;
    }

    public void add(ComponenteComputador componente) {
        componentes.add(componente);
    }

    public void remove(ComponenteComputador componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrecoCusto() {
        double total = 0;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoCusto();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMinimo() {
        double total = 0;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoLucroMinimo();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMaximo() {
        double total = 0;
        for (ComponenteComputador c : componentes) {
            total += c.getPrecoLucroMaximo();
        }
        return total;
    }
}