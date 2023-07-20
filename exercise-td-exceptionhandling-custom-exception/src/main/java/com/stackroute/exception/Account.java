package com.stackroute.exception;

public class Account {
    private double amount;

    public Account(double amount){
        this.amount=amount;
    }
    public Account()
    {
    }
    public double getAccountBalance()
    {
        return this.amount;
    }

    public double withdraw(int i) throws NegativeIntegerException,InsufficientFundException
    {
        try
        {
            if(i<0)
            {
                throw new NegativeIntegerException("Withdrawing amount less than zero");
            }
            if(i>getAccountBalance())
            {
                throw new InsufficientFundException("Insufficient Amount");
            }
            this.amount=this.amount-i;
            return this.amount;
        }
        catch (NegativeIntegerException | InsufficientFundException e)
        {
            throw e;
        }
    }
}
