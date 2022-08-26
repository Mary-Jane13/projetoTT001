
package model;

/**
 *
 * @author mari_
 */
public class Consulta {
    private int id;
    private int data;
    private int hora;
    private String historico;
    
    public Consulta(int id, int data, int hora, String historico) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.historico = historico;
    }

    public int getId() {
        return id;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
