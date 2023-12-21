package src;

import src.entities.Contract;
import src.entities.Installment;
import src.services.ContractService;
import src.services.OnlinePaymentService;
import src.services.PaypalService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);

        Contract contract = new Contract(8028, new Date(), 600.0);
        ContractService service = new ContractService();
        service.processContract(contract, 3);

        System.out.println(contract);



    }
}
