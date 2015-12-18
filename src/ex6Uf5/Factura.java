package ex6Uf5;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marta
 */
public class Factura {
    private int codi;
    private String client;
    private Date data;
    private int preu;

    public Factura(int codi, String client, Date data, int preu) {
        this.codi = codi;
        this.client = client;
        this.data = data;
        this.preu = preu;
    }

    public Factura() {
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getClient() {
        return client;
    }
    
    public void setClient(String client) {
        this.client = client;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Factura{" + "codi=" + codi + ", client=" + client + ", data=" + data + ", preu=" + preu + '}';
    }


    
}
