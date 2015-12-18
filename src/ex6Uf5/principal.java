package ex6Uf5;


import java.text.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marta
 */
public class principal {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        ArrayList<Factura> facturaList = new ArrayList<Factura>(); 
        Comparator <Factura> sortPreu = new FacturaSortPreu();
        Comparator <Factura> sortData = new FacturaSortData();       
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.DAY_OF_MONTH,23);    //poner cualquier dia entre 1-31
        c.set(Calendar.MONTH,6);            //poner cualquier num mes entre 0-11 (enero es 0)
        c.set(Calendar.YEAR,2015);          // poner cualquier año
        Date d1 = c.getTime(); // ho transforma a milisegons
 

        facturaList.add(new Factura(1001,"Marta",d1,205));
                
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");  //perque es mostri de manera maca
        String data1 = sdf.format(d1);                              //perque es mostri de manera maca
        System.out.println(data1);                                  //perque es mostri de manera maca
        
        c.set(Calendar.DAY_OF_MONTH,5);    //poner cualquier dia entre 1-31
        c.set(Calendar.MONTH,11);            //poner cualquier num mes entre 0-11 (enero es 0)
        c.set(Calendar.YEAR,2014);          // poner cualquier año
        Date d2 = c.getTime(); // ho transforma a milisegons

        facturaList.add(new Factura(1002,"David",d2,500));
    
        c.set(Calendar.DAY_OF_MONTH,12);    //poner cualquier dia entre 1-31
        c.set(Calendar.MONTH,0);            //poner cualquier num mes entre 0-11 (enero es 0)
        c.set(Calendar.YEAR,2015);          // poner cualquier año
        Date d3 = c.getTime(); // ho transforma a milisegons
    
        facturaList.add(new Factura(1003,"Albert",d3,356));
     
        Collections.sort(facturaList,sortPreu);
        for(Factura factura:facturaList){
               System.out.println(factura);
            }
             
        Collections.sort(facturaList,sortData);
        for(Factura factura:facturaList){
               System.out.println(factura);
            }
        
}
    } 
    

