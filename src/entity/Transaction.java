package entity;

import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private String type;
    private double amount;
    private Date date;


    public Transaction(UUID id, String type, double amount, Date date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }
}
