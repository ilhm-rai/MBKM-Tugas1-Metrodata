/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.aldo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author RAI
 */
public class ReduceExample {

    int totalHarga;

    public Integer ReduceExample() {

        Integer[] harga = new Integer[]{1500, 2000, 2500, 3000};
    
        List<Integer> list = Arrays.asList(harga);
        int totalHarga = Arrays.stream(harga).reduce(0, (e1, e2) -> e1 + e2);
        return totalHarga;
    }
    //melakukan penjumlahan dari beberapa elemen untuk menghasilkan satu hasil

    public Integer tanpaReduce() {
        int total = 0;
        Integer[] harga = new Integer[]{1500, 2000, 2500, 3000};

        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }
        return (int) total;
    }
    //menggunakan for untuk melakukan penjumlahan secara satu persatu tiap index
}
