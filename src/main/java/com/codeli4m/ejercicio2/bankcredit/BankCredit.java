/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.ejercicio2.bankcredit;

/**
 *
 * @author HP
 */
public class BankCredit {
    String id;
    String deudor;
    String codeudor;
    double tasaInteres;
    double interesMora;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeudor() {
        return deudor;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public String getCodeudor() {
        return codeudor;
    }

    public void setCodeudor(String codeudor) {
        this.codeudor = codeudor;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getInteresMora() {
        return interesMora;
    }

    public void setInteresMora(double interesMora) {
        this.interesMora = interesMora;
    }
    
    public void addBankCredit(){}
    
    public String getInfo(){return "";} // TODO}

    public boolean isApproved(){
        boolean res = true;
        return res;
    }
}
