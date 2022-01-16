
package Treinamento;

public class execucao {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        
        cachorro.setModoOperante("aquatico");
        
        System.out.println(cachorro.getModoOperante());
        
        Cachorro.nome = "lk";
       
    }
}
