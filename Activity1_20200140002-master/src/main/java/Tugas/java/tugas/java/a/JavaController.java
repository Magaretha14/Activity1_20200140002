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
        String tunai = data.getParameter("var_input4");
        
        proses prosesdata = new proses();
        
        Double total = prosesdata.ntotal(harga_perkilo, jumlah_beli);
        String diskon = prosesdata.ndiskon(total);
        Double total_diskon = prosesdata.ntotaldiskon(total);
        Double total_harga = prosesdata.ntotalharga(total);
        String tampil = prosesdata.nview(total_harga, tunai);
        
        kurir.addAttribute("nama", nama_buah);
        kurir.addAttribute("hargaKilo", harga_perkilo);
        kurir.addAttribute("jbeli", jumlah_beli);
        kurir.addAttribute("harga", total);
        kurir.addAttribute("dc", diskon);
        kurir.addAttribute("totdc", total_diskon);
        kurir.addAttribute("tot_harga", total_harga);
        kurir.addAttribute("duit", tampil);
        kurir.addAttribute("uangtampil", tunai);
   
        return "Puput";
    }
    
}
