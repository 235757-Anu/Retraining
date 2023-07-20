package org.example;

public class MemberAccount
{
    private int accountNo;
    private BorrowedBookInfo[] borrowed;

    public int getAccountNo() {
        return accountNo;
    }

    public BorrowedBookInfo[] getBorrowed() {
        return borrowed;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBorrowed(BorrowedBookInfo[] borrowed) {
        this.borrowed = borrowed;
    }

    public MemberAccount(int accountNo, BorrowedBookInfo[] borrowed) {
        this.accountNo = accountNo;
        this.borrowed = borrowed;
    }
    void borrowBooks()
    {

    }
    void returnBooks()
    {

    }
    void payDues()
    {

    }
}
