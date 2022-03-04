package Aula1BigONotationEArrays;

public class ArrayReview {
    public static void main(String[] args) {
        //https://medium.com/linkapi-solutions/o-que-%C3%A9-big-o-notation-32f171e4a045
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] =55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    /*

    -> São armazenados em memória
    -> comprimento estático
    -> todo elemento ocupa o mesmo espaço
    ->
    * */
}
