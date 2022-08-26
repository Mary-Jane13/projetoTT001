
package model;

/**
 *
 * @author mari_
 */
public class Exam {
    private int id;
    private String descricao;
    private String exame;

    public Exam(int id, String descricao, String exame) {
        this.id = id;
        this.descricao = descricao;
        this.exame = exame;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }
    
    
    
}
