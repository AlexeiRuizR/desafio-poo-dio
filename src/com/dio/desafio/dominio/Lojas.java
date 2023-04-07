package com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Lojas {
    private String nome;

    private double quantidadeVenda = 0;
    private double quantidadeGerente = 0;

    private Set<Vendedor> pessoalVenda = new LinkedHashSet<>();
    private Set<Gerente> pessoalGerencia = new LinkedHashSet<>();

    public void calcularPlantilhaVenda(){
        Optional<Vendedor> pesooasV = this.pessoalVenda.stream().findFirst();
        if(pesooasV.isPresent()){
            this.pessoalVenda.add(pesooasV.get());
        }
        else{
            System.err.println("Voce nao esta registrado nesta loja");
        }
    }
public void calcularPlantilhaGerencia(){
    Optional<Gerente> pessoasG = this.pessoalGerencia.stream().findFirst();
    if(pessoasG.isPresent()){
        this.pessoalGerencia.add(pessoasG.get());
    }
    else{
        System.err.println("Voce nao esta registrado nesta loja");
    }
}
public long calculoPessoasGerencia(){
        return (long) (this.quantidadeGerente = pessoalGerencia.stream().count());
}
    public long calculoPessoasVenda(){
        return (long) (this.quantidadeVenda = pessoalVenda.stream().count());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(double quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getQuantidadeGerente() {
        return quantidadeGerente;
    }

    public void setQuantidadeGerente(double quantidadeGerente) {
        this.quantidadeGerente = quantidadeGerente;
    }

    public Set<Vendedor> getPessoalVenda() {
        return pessoalVenda;
    }

    public void setPessoalVenda(Set<Vendedor> pessoalVenda) {
        this.pessoalVenda = pessoalVenda;
    }

    public Set<Gerente> getPessoalGerencia() {
        return pessoalGerencia;
    }

    public void setPessoalGerencia(Set<Gerente> pessoalGerencia) {
        this.pessoalGerencia = pessoalGerencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lojas lojas = (Lojas) o;
        return Double.compare(lojas.quantidadeVenda, quantidadeVenda) == 0 && Double.compare(lojas.quantidadeGerente, quantidadeGerente) == 0 && Objects.equals(nome, lojas.nome) && Objects.equals(pessoalVenda, lojas.pessoalVenda) && Objects.equals(pessoalGerencia, lojas.pessoalGerencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidadeVenda, quantidadeGerente, pessoalVenda, pessoalGerencia);
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", Quantidade Vendedores= " + calculoPessoasVenda() +
                ", quantidade de Gerentes=" + calculoPessoasGerencia() + "\n" +
                "pessoal de Venda= \n" + pessoalVenda + "\n" +
                "pessoal da Gerencia= \n" + pessoalGerencia +
                ' ';
    }
}
