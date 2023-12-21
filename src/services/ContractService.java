package src.services;

import src.entities.Contract;
import src.entities.Installment;
import java.util.Calendar;

public class ContractService{
    public void processContract(Contract contract, Integer months){

        OnlinePaymentService service = new PaypalService();

        double installments = (double) contract.getTotalValue() / months;

        for(int i = 0; i < months; i++){
            double resultInterest = service.interest(installments, (i + 1));
            double resultPaymentFee = service.paymentFee(resultInterest);
            double result = resultInterest + resultPaymentFee;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contract.getDate());
            calendar.add(Calendar.MONTH, (i + 1));

            contract.addInstallments(new Installment(calendar.getTime(), result));
        }
    }
}
