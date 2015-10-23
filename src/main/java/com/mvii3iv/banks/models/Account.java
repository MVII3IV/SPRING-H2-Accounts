package com.mvii3iv.banks.models;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    private String bank;

    @Column(name="card_number")
    private String cardNumber;

    private double debt;

    @Column(name="cut_day")
    private Date cutDay;

    @Column(name="pay_day")
    private Date payDay;

    @Column(name="credit_limit")
    private double creditLimit;

    @Column(name="customer_service_phone")
    private String customerServicePhone;


    public Account(String bankName, String cardNumber, double debt, Date cutDay, Date payDay, double creditLimit, String customerServicePhone) {
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.debt = debt;
        this.cutDay = cutDay;
        this.payDay = payDay;
        this.creditLimit = creditLimit;
        this.customerServicePhone = customerServicePhone;
    }
    public Account(){

    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getBank() {
        return bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getDebt() {
        return debt;
    }

    public Date getCutDay() {
        return cutDay;
    }

    public Date getPayDay() {
        return payDay;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }



    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setBankName(String bankName) {
        this.bank = bank;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setCutDay(Date cutDay) {
        this.cutDay = cutDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }
}
