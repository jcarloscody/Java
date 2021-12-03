package cap16_ColecoesGenericas.Mapas;
O aplicativo utiliza um m�todo gen�rico maximum para determinar e retornar o maior dos seus tr�s argumentos do 
mesmo tipo. Infelizmente, o operador relacional > n�o pode ser utilizado com tipos por refer�ncia. Entretanto, � poss�vel comparar 
dois objetos da mesma classe se essa classe implementar a interface gen�rica Comparable<T> (do pacote java.lang). Todas as 
classes empacotadoras de tipo para tipos primitivos implementam essa interface