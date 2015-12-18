package ex6Uf5;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marta
 */
public class FacturaSortPreu implements Comparator<Factura>{
    public int compare(Factura f1,Factura f2){
        return (int) (f1.getPreu()- f2.getPreu());
        }
}
   

