/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.java.tugas.java.a;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class proses {
    public Double ntotal(String harga_perkilo, String jumlah_beli){
        
        Double harga_kilo = Double.parseDouble(harga_perkilo);
        Double jlh_beli = Double.parseDouble(jumlah_beli);
        
        Double total = harga_kilo * jlh_beli;
        return total;
    }
    

    public String ndiskon(Double total){
        String diskon = null;
        if (total < 16000){
            diskon = "0%";
        }
        else if (total >= 16000 && total <= 25000){
            diskon = "10%";
        }
        else if (total > 25000){
            diskon = "15%";
        }
        
        return diskon;
    }
    
    public Double ntotaldiskon(Double total){
        Double totaldiskon = null;
        if (total < 16000){
            totaldiskon = total*0/100;
        }
        else if (total >= 16000 && total <= 25000){
            totaldiskon = total*10/100;
        }
        else if (total > 25000){
            totaldiskon = total*15/100;
        }

      return totaldiskon;  
    }

    public Double ntotalharga (Double total){
        Double totalharga = null;
         if (total < 16000){
            totalharga = total - (total*0/100);
        }
        else if (total >= 16000 && total <= 25000){
            totalharga = total - (total*10/100);
        }
        else if (total > 25000){
            totalharga = total - (total*15/100);
        }
        return totalharga;
    }
    
    public String nview(Double total_harga, String tunai){
        Double uang = Double.parseDouble(tunai);
        String view = null;
        Double sisa = total_harga - uang;
        
        if (uang < total_harga)
        {
            view = "Uang yang anda berikan kurang sejumlah " + sisa ;
        }
        else if (Objects.equals(uang, total_harga))
        {
           view = "Uang yang anda berikan pas"; 
        }
        else if (uang > total_harga)
        {
            view = "Kembalian anda " + (uang - total_harga);
        }
        return view;
    }
}
