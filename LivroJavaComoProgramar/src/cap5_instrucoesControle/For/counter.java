
package cap5_instrucoesControle.For;

/**
 *
 * @author josue
 */
public class counter {
    
    public static void main(String[] args) {
    int counter =1;
    
    for(int x=1; x<=10; x++){
        System.out.print(x);
        System.out.println("");
    }
    
    //somando os inteiros pares até 20
    
    int totalP = 0;
    
    for (int i =2; i<=20;i+=2){
       int to = totalP;
        totalP += i;
        System.out.printf("%d + %d = %d%n", to , i , totalP);
        
    }
        
        System.out.printf("o total da soma de pares é: %d%n", totalP);
    
    
    }
    
}
