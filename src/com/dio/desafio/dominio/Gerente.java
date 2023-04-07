package com.dio.desafio.dominio;

public class Gerente extends Pessoal {

    private double indiceArea;


    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * (tarifaHoraria + 30d) + indiceArea;
    }

    public double getIndiceArea() {
        return indiceArea;
    }

    public void setIndiceArea(double indiceArea) {
        this.indiceArea = indiceArea;
    }

    @Override
    public String toString() {
        return  "nome: " + getNome() +
                ", telefone: " + getTelefone() +
                ", Horas Trabalhadas=" + getHorasTrabalhadas() +
                ", Salario Mensal= " + calcularSalario() +
                "\n";
    }
}
