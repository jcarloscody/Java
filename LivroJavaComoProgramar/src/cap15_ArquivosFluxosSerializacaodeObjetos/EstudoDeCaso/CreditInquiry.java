package cap15_ArquivosFluxosSerializacaodeObjetos.EstudoDeCaso;

// Esse programa lê um arquivo sequencialmente e exibe o

// conteúdo baseado no tipo de conta que o usuário solicita
// (saldo credor, saldo devedor ou saldo zero).

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        // obtém a solicitação do usuário (por exemplo, saldo zero, credor ou devedor)
        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }

            readRecords(accountType);
            accountType = getRequest(); // obtém a solicitação do usuário
        }
    }

    // obtém a solicitação do usuário
    private static MenuOption getRequest() {
        int request = 4;

        // exibe opções de solicitação
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program");

        try {
            Scanner input = new Scanner(System.in);

            do // insere a solicitação de usuário
            {
                System.out.printf("%n? ");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Invalid input. Terminating.");
        }

        return choices[request - 1]; // retorna o valor enum da opção
    }

    // lê registros de arquivo e exibe somente os registros do tipo apropriado
    private static void readRecords(MenuOption accountType) {
        // abre o arquivo e processa o conteúdo
        try (Scanner input = new Scanner(Paths.get(".\\src\\cap15_ArquivosFluxosSerializacaodeObjetos\\EscrevendoArquivo\\clients.txt"))) {
            while (input.hasNext()) // mais dados para ler
            {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                // se o tipo for a conta adequada, exibe o registro
                if (shouldDisplay(accountType, balance))
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                            firstName, lastName, balance);
                else
                    input.nextLine(); // descarta o restante do registro atual
            }
        } catch (NoSuchElementException |
                IllegalStateException | IOException e) {
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    } // fim do método readRecords

    // utiliza o tipo de registro para determinar se registro deve ser exibido
    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
            return true;

        return false;
    }
}

/*Para recuperar sequencialmente dados de um arquivo, os programas começam no início do arquivo e leem todos os dados de
maneira consecutiva até que as informações desejadas sejam encontradas. Talvez seja necessário processar sequencialmente o arquivo várias vezes (a partir do início dele) durante a execução de um programa. A classe Scanner não permite reposicionamento para
o início do arquivo. Se for preciso ler o arquivo de novo, o programa deverá fechá-lo e reabri-lo.
O programa nas figuras 15.7 e 15.8 permite que um gerente de crédito obtenha listas de clientes com saldo zero (isto é, clientes
que não devem nada à empresa), clientes com saldos credores (isto é, clientes aos quais a empresa deve dinheiro) e clientes com saldos devedores (isto é, clientes que devem à empresa por bens e serviços recebidos). Um saldo credor é um valor monetário negativo,
e um saldo devedor, um valor positivo*/
