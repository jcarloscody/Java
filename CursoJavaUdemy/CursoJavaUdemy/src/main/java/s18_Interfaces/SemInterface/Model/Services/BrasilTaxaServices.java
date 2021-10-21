package s18_Interfaces.SemInterface.Model.Services;

public class BrasilTaxaServices {

    public double taxa(double quantia) {// diferentemente de outros metodos, aqui estamos usando um tipo primitivo
                                        // double e não a classe Double, pq aqui sempre vai retornar um valor, não
                                        // retornará nulo, nos outros como há risco de a regra de negocio mudar e assim
                                        // suscitando a possibilidade de retorno null, colocamos lá o warraper Double,
                                        // pois aguenta null
        if (quantia <= 100.0) {
            return quantia * 0.2;
        } else {
            return quantia * 0.15;
        }
    }
}
