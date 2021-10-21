
package cap3_classes.banco;


public class Account {
   
    String name;
    private double balanco;
        
    public Account (String name, double balanco){
        this.name = name;
        
        if (balanco>0){
            this.balanco=balanco;
        }
    }
    
    public void Deposito(double valor_deposito){
        if (valor_deposito>0){
            balanco+=valor_deposito;
        }
    }
    
    public double Consultar(){
        return balanco;
    }
    
    public void Sacar(double valor_saque){
        if (valor_saque>0){
            balanco -= valor_saque;
        }
    }
    
}
