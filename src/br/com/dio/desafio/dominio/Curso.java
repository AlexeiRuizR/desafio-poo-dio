package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descripcao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcao() {
        return descripcao;
    }

    public void setDescripcao(String descripcao) {
        this.descripcao = descripcao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descripcao='" + descripcao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
