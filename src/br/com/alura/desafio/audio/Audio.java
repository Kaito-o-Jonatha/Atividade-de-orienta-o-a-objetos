package br.com.alura.desafio.audio;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }


    public void classifica(){
        if(this.curtidas >= 3){
            this.classificacao = 1;
        } else if (this.curtidas >= 2){
            this.classificacao = 2;
        } else {
            this.classificacao = 3;
        }
    }

    public int getClassificacao() {
        return classificacao;
    }

}
