/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6Uf5;

import java.util.Comparator;

/**
 *
 * @author marta
 */
public class FacturaSortData implements Comparator<Factura>{
    public int compare(Factura f1,Factura f2){
       int result = (f1.getData().compareTo(f2.getData()));
       if (result != 0) { return result; }
       else { return 0; }
    }
}



   

