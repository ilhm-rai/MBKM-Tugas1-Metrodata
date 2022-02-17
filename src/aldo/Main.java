/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldo;
import aldo.ReduceExample;
import aldo.MatchExample;
import aldo.OptionalExample;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main (String[] args) {
        //Memanggil class ReduceExample
        ReduceExample r = new ReduceExample();
        System.out.println("Jumlah belanjaan anda = " + r.ReduceExample());
        System.out.println("Jumlah belanjaan anda = " + r.tanpaReduce());
        
        //Memanggil class OPnionalExample()
        OptionalExample o = new OptionalExample();
        o.OptionalExample();
        o.tanpaOptional();
        
        //Memanggil class MatchExample
        MatchExample a = new MatchExample();
        System.out.println(a.allMatch());
        System.out.println(a.anyMatch());
        System.out.println(a.tanpaAllMatch());
        
    }
}
