package Treinamento;

public class Cachorro extends Animal{
    private String modoOperante; //caracteristica 
    
    public Cachorro(String modoOperante){
        this.modoOperante = modoOperante;
    }

    Cachorro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setModoOperante(String modoOperante){
        this.modoOperante = modoOperante;
    }
    
    public String getModoOperante(){
        return this.modoOperante;
    }
    //set - gravacao
    //get - retornado
    
/*CARRO
    
    atributo - terrestre, rodas, marca, chassi, placa   (verbo é de estado)
    metodos - acelera, freia, toca musica,              (verbo de ação)
    */
    
}
