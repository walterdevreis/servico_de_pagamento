package src;

import src.entities.Contract;
import src.entities.Installment;
import src.services.OnlinePaymentService;
import src.services.PaypalService;

import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String args[]){

        Locale.setDefault(Locale.US);

        OnlinePaymentService service = new PaypalService();
        double resultado = service.interest(200.0, 3);
        System.out.printf("%.2f", service.paymentFee(resultado));


    }
}
