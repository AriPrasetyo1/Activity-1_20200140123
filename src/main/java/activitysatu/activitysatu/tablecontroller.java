/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitysatu.activitysatu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author HAHAHA
 */
public class tablecontroller {
    
    @RequestMapping("/datanik")
    //ResponseBody
    public String getTable(Model Nasabah){

        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(1,Arrays.asList("01","3525011711086058","Muhammad fatta","rangerang"));
        data.add(2,Arrays.asList("02","3525011711086058","Rifaldi","Solo"));
        data.add(3,Arrays.asList("03","3525011711086059","Babe Kurniawan","Bojonegoro"));
        data.add(4,Arrays.asList("04","3525011711086061","Muhammad Ridwan","Semarang"));
        data.add(5,Arrays.asList("05","3525011711086062","Adella Zuniardi","Madiun"));
        data.add(6,Arrays.asList("06","3525011711086063","Jonathan Liandi","Sragen"));
        data.add(7,Arrays.asList("07","3525011711086064","Eko Setyo","Ngawi"));
        data.add(8,Arrays.asList("08","3525011711086075","Lia Munawaroh","Magetan"));
        data.add(9,Arrays.asList("09","3525011711086076","Funi Cintya","Batang"));
        data.add(10,Arrays.asList("10","3525011711086077","Wawan Hermawan","Bintang"));
        data.add(11,Arrays.asList("11","3525011711086078","Dadang Dermawan","Gentang"));
        data.add(12,Arrays.asList("12","3525011711086079","Sari Januari","Gentong"));
        data.add(13,Arrays.asList("13","3525011711086115","Farid","Paron"));
        data.add(14,Arrays.asList("14","3525011711086116","Linas Pranoto","Bayam"));
        data.add(15,Arrays.asList("15","3525011711086121","Daffa Aditya","Pekalongan"));
        data.add(16,Arrays.asList("16","3525011711086122","Calvin sandi","Banyumas"));
        data.add(17,Arrays.asList("17","3525011711086123","Ari Prasetyo","Sawo"));
        data.add(18,Arrays.asList("18","3525011711086134","Irwan Prasetyo","Kaliajar"));
        data.add(19,Arrays.asList("19","3525011711086135","Misbah","Serang"));
        data.add(20,Arrays.asList("20","3525010602090004","Rafatar","Ngadisari"));
        
        
        Nasabah.addAttribute("tabel", data);
        return "tabelviewer";
    }
    
}
