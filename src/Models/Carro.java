package Models;

import javax.swing.plaf.IconUIResource;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }

    public void mover() {
        System.out.println("O carro está se movendo! Velocidade média de 200km/h");
    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Alfa Romeo", 2020, "Verde");

        meuCarro.exibirInfo();

        meuCarro.mover();
    }
}



