public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    public Cliente(boolean esVip, String nombre, int id) {
        this.esVip = esVip;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {  // Fix: Correct parameter type
        this.id = id;
    }

    public boolean isVip() {
        return esVip;
    }

    public void setVip(boolean esVip) {
        this.esVip = esVip;
    }
}
