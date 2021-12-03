package cap16_ColecoesGenericas.Mapas;
O aplicativo utiliza um método genérico maximum para determinar e retornar o maior dos seus três argumentos do 
mesmo tipo. Infelizmente, o operador relacional > não pode ser utilizado com tipos por referência. Entretanto, é possível comparar 
dois objetos da mesma classe se essa classe implementar a interface genérica Comparable<T> (do pacote java.lang). Todas as 
classes empacotadoras de tipo para tipos primitivos implementam essa interface