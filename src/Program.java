package src;

import src.entities.Contract;
import src.services.ContractService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre os dados do contrato:");
            System.out.print("Número: ");
            int number = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Valor do contrato: ");
            double valor = sc.nextDouble();
            System.out.print("Entre com o número de parcelas: ");
            int installments = sc.nextInt();

            Contract contract = new Contract(number, date, valor);
            ContractService contractService = new ContractService();
            contractService.processContract(contract, installments);

            System.out.println("Parcelas:");
            System.out.println(contract);
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
