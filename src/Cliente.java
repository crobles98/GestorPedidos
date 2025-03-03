public class Cliente {
    public boolean esVip;
    public String nombre;
    public int id;

    public Cliente(boolean vip, String nombre, int id) {
        this.esVip = vip;
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
        return this.id;
    }

    public void setId(String email) {
        this.id = id;
    }

    public boolean isVip() {
        return esVip;
    }

    public void setVip(boolean vip) {
        this.esVip = vip;
    }
}
