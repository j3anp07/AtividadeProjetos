package computador;

public class Main {
    public static void main(String[] args) {
        PlacaMae b550 = new PlacaMae("ASUS B550M", 600.0, 750.0, 900.0);
        CPU ryzen = new CPU("Ryzen 7 5700X", 1100.0, 1300.0, 1500.0);
        MEMORIA ram1 = new MEMORIA("16GB DDR4 3200MHz", 250.0, 300.0, 350.0);
        MEMORIA ram2 = new MEMORIA("16GB DDR4 3200MHz", 250.0, 300.0, 350.0);
        HARDDIKS nvme = new HARDDIKS("NVMe M.2 1TB", 380.0, 450.0, 520.0);

        AceleradorGrafico gpuCore = new AceleradorGrafico("RTX 4060 Ti", 1800.0, 2100.0, 2400.0);
        PlacaVideo rtx = new PlacaVideo("Galax 8GB", 400.0, 500.0, 600.0);
        rtx.add(gpuCore);

        Computador pc = new Computador("PC Desenvolvedor");
        pc.add(b550);
        pc.add(ryzen);
        pc.add(ram1);
        pc.add(ram2);
        pc.add(nvme);
        pc.add(rtx);

        System.out.println("Configuração: " + pc.getNome());
        System.out.println("Custo Total: R$ " + pc.getPrecoCusto());
        System.out.println("Venda Mínima: R$ " + pc.getPrecoLucroMinimo());
        System.out.println("Venda Máxima: R$ " + pc.getPrecoLucroMaximo());
    }
}