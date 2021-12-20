/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.java.tugas.java.a;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raihan
 */
@Controller
public class JavaController {
    
    @RequestMapping("/senddata")
    public String getData(HttpServletRequest data, Model kurir){
        
        String nama_buah = data.getParameter("var_input1");
        String harga_perkilo = data.getParameter("var_input2");
        String jumlah_beli = data.getParameter("var_input3");
        
        Double harga_kilo = Double.parseDouble(harga_perkilo);
        Double jlh_beli = Double.parseDouble(jumlah_beli);
        
        Double total = harga_kilo * jlh_beli;
        String diskon = null;
        Double total_diskon = null;
        Double total_harga = null;
        
        if (total < 16000){
            diskon = "0%";
            total_diskon = total*0/100;
            total_harga = total - (total*0/100);
        }
        else if (total >= 16000 && total <= 25000){
            diskon = "10%";
            total_diskon = total*10/100;
            total_harga = total - (total*10/100);
        }
        else if (total > 25000){
            diskon = "15%";
            total_diskon = total*15/100;
            total_harga = total - (total*15/100);
        }
        
        kurir.addAttribute("nama", nama_buah);
        kurir.addAttribute("hargaKilo", harga_perkilo);
        kurir.addAttribute("jbeli", jumlah_beli);
        kurir.addAttribute("harga", total);
        kurir.addAttribute("dc", diskon);
        kurir.addAttribute("totdc", total_diskon);
        kurir.addAttribute("tot_harga", total_harga);
   
        return "Puput";
    }
    
}
