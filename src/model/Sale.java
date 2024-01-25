package model;

import java.util.Date;

public class Sale {

    private int idSale;
    private Date date;
    private double total;
    private String issuerName;
    private String recipientName;
    private boolean paymentMade;

    public Sale() {
    }

    public Sale(int idSale, Date date, double total, String issuerName, String recipientName, boolean paymentMade) {
        this.idSale = idSale;
        this.date = date;
        this.total = total;
        this.issuerName = issuerName;
        this.recipientName = recipientName;
        this.paymentMade = paymentMade;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public boolean isPaymentMade() {
        return paymentMade;
    }

    public void setPaymentMade(boolean paymentMade) {
        this.paymentMade = paymentMade;
    }

    

}
