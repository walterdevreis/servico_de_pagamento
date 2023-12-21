package src.services;

import src.entities.Contract;

public class ContractService implements OnlinePaymentService{
    @Override
    public Double paymentFee(Double amount) {
        return null;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return null;
    }

    public void processContract(Contract contract, Integer months){

    }
}
