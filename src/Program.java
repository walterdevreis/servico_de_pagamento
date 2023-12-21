package src;

import src.entities.Contract;
import src.entities.Installment;

import java.util.Date;

public class Program {
    public static void main(String args[]){

        Installment installment = new Installment(new Date(), 600.00);
        Contract contract = new Contract();

    }
}
