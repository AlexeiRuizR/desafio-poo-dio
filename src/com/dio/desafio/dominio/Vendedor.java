package com.dio.desafio.dominio;

public class Vendedor extends Pessoal{

    private double comision;

    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * tarifaHoraria * comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
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
