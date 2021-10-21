package s13_Enumeracao_Composicao.Enumeracao;

import java.util.Date;

import s13_Enumeracao_Composicao.Enumeracao.enums.OrderStatus;

public class Pedidos {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Pedidos() {

    }

    public Pedidos(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "O id: " + id + ", está com o seguinte status: " + status + ", com a seguinte data: " + moment;
    }
}
