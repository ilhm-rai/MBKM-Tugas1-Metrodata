/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.aldo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class MatchExample {

    Integer[] harga = new Integer[]{1500, 2000, 2500, 3000};

    
    public boolean allMatch() {
        List<Integer> list = Arrays.asList(harga);
        boolean nilai = list.stream().allMatch(j -> j > 5000);
        return nilai;
    }
    //Allmatch digunakan untuk mengembalikan seluruh nilai jika nilainya = true

    public boolean anyMatch() {
        List<Integer> list = Arrays.asList(harga);
        boolean nilai = list.stream().anyMatch(j -> j > 5000);
        return nilai;
    }
    //Anymatch digunakan untuk mengembalikan satu nilai jika ada yg nilainya = true

    public boolean tanpaAllMatch() {
        int cari = 5000;
        boolean nilai = false;
        for (int c : harga) {
            if (c == cari) {
                nilai = true;
            } else {
                nilai = false;
            }
        }
        return nilai;
    }
    //Menggunakan if sebagai cara alternatif untuk mengecek apakah nilai kondisi true atau false
}
