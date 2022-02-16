/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardi;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author RAI
 */
public class MapExample {
    
    public static void main(String args[]) {
        Map<Integer, Book> data = Data.getData();
        
        //Obtain a set of key-value pairs
        //Set<Map.Entry<Integer, Book>> entries = books.entrySet();
        
        //Stream<Map.Entry<Integer, Book>> entriesStream = entries.stream();
        
        
        //Sum total sold book using Stream
        System.out.println("Print total sold of Ichoro Kishimi's books using Stream");
        Predicate<Map.Entry<Integer, Book>> ichiroBooks 
                = mapper -> mapper.getValue().getAuthor().equalsIgnoreCase("ichiro kishimi");
        
        int totalSellIchiroBooks = data.entrySet().stream()
                .filter(ichiroBooks)
                .mapToInt(mapper -> mapper.getValue().getTotalSell())
                .sum();
        
        System.out.println("Sold: " + totalSellIchiroBooks + " books\n");
        
        //Sum total sold book without Steam
        System.out.println("Print total sold of Fahruddin Faiz's books without Stream");
        int totalSellFaizBooks = 0;
        
        for(Book b: data.values()) {
            if(b.getAuthor().equalsIgnoreCase("fahruddin faiz")) {
                totalSellFaizBooks += (int) b.getTotalSell();
            }
        }
        
        System.out.println("Sold: " + totalSellFaizBooks + " books\n");
    }
}
