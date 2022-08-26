package model;

/**
 *
 * @author mari_
 */
public class Tratamento {
    private int id;
    private int data;
    private int hora;

    public Tratamento(int id, int data, int hora) {
        this.id = id;
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
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
