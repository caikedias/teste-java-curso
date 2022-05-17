package br.com.dio;


import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);

        Livro livro1 = new Livro("naruto", 60);

        /*int a = 3;
        int b = 2;
        System.out.println("Hello World!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}
