package br.com.Senacars.model;

public class Car {

    private String name;
    private int ano;
    private int km;
    private String cor;
    private String combustivel;

    public Car(String name,int ano, int km, String cor, String combustivel) {
        this.name = name;
        this.ano = ano;
        this.km = km;
        this.cor = cor;
        this.combustivel = combustivel;
    }
    public String getName() {
        return name;
    }
    public int getAno() {
        return ano;
    }
    public int getKm() {
        return km;
    }
    public String getCor() {
        return cor;
    }
    public String getCombustivel() {
        return combustivel;
    }

}
