
package model;

/**
 *
 * @author mari_
 */
public class Animal {
    private int id;
    private String nome;
    private int idade;
    private int genero;
    private int anoNasc;

    public Animal(int id, String nome, int idade, int genero, int anoNasc) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.anoNasc = anoNasc;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    
    
    
    
}
