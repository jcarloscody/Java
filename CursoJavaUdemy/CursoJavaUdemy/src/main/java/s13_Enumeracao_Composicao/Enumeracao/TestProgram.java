package s13_Enumeracao_Composicao.Enumeracao;

import java.util.Date;

import s13_Enumeracao_Composicao.Enumeracao.enums.OrderStatus;

public class TestProgram {
    public static void main(String[] args) {

        Pedidos pedidoKorea = new Pedidos(1, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(pedidoKorea);

        // CONVERSAO DE STRING PARA ENUM
        OrderStatus os = OrderStatus.valueOf("ENTREGUE");

        Pedidos pedidoKorea2 = new Pedidos(2, new Date(), os);
        System.out.println(pedidoKorea2);
    }
}
