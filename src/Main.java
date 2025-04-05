import Models.Carro;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Alfa Romeo", 2021, "Verde"));

        carros.add(new Carro("Nissan GTR", 2020, "Preto"));

        carros.add(new Carro("Honda S2000", 2019, "Branco"));

        for (Carro carro : carros) {
            carro.exibirInfo();

            carro.mover();
        }
    }
}
