public class Main {
    public static void main(String[] args) {
        // Crea un pedido para un cliente normal
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101, pedido1.getCliente().isVip());

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedido(101, pedido2.getCliente().isVip());

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.getCliente().setVip(true);
        pedido1.procesarPedido(1000, pedido1.getCliente().isVip());
    }
}
