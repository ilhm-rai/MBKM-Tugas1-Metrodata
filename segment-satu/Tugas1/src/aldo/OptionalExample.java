/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author LENOVO
 */
public class OptionalExample {

    public void OptionalExample(){
    Integer[] harga = new Integer[5];
    Optional<Integer> checkNull = Optional.ofNullable(harga[0]);

    if(checkNull.isPresent()){
    System.out.println(harga[0]);
    }
        else {
    System.out.println("Index tidak ditemukan");
    }
    //Mencari nilai null dari suatu array
}
    
    public void tanpaOptional() {
        Integer[] harga = new Integer[]{1500, 2000, 2500, 3000};

        Integer cari = harga[0];
        for (int c : harga) {
            if (c == cari) {
                System.out.println(harga[0]);
            } else {
                System.out.println("Index tidak ditemukan");
            }
        }
       //menggunakan perulangan foreach untuk mencari suatu nilai index secara satu persatu
    }
}
