public class Pedido {
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void procesarPedido(double total, boolean esVIP) {
        double descuento = calcularDescuento(total, esVIP);
        double precioFinal = total - descuento;
        mostrarMensaje(precioFinal, descuento, esVIP);
    }

    private double calcularDescuento(double total, boolean esVIP) {
        double porcentajeDescuento = esVIP ? 0.15 : 0.10;
        return (total > 100) ? total * porcentajeDescuento : 0;
    }

    private void mostrarMensaje(double precioFinal, double descuento, boolean esVIP) {
        String tipoPedido = esVIP ? "Pedido VIP" : "Pedido";
        if (descuento > 0) {
            System.out.println(tipoPedido + " aprobado. Total: " + precioFinal +
                    " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println(tipoPedido + " aprobado. Total: " + precioFinal);
        }
    }
}
