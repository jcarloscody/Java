
package cap3_classes.banco;

import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {
        

        Account Objeto_conta = new Account("",0);
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        
        JOptionPane.showMessageDialog(null,"Olá " + nome + "\n Sua conta é de R$: " + Objeto_conta.Consultar());
        
        Double valor_deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto vc quer depositar: R$ "));
        
        Objeto_conta.Deposito(valor_deposito);
        
        JOptionPane.showMessageDialog(null, nome + ", Sua conta é de R$: " + Objeto_conta.Consultar());
        
        Double valor_saque = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto vc quer sacar: R$ "));
        
        Objeto_conta.Sacar(valor_saque);
        
        JOptionPane.showMessageDialog(null, nome + ", Sua conta é de R$: " + Objeto_conta.Consultar());
    }
    
}
