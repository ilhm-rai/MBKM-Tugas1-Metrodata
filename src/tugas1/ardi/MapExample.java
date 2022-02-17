/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.ardi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
        
        //Loop through data(map).values -> Book object
        for(Book b: data.values()) {
            if(b.getAuthor().equalsIgnoreCase("fahruddin faiz")) {
                totalSellFaizBooks += (int) b.getTotalSell();
            }
        }
        
        System.out.println("Sold: " + totalSellFaizBooks + " books\n");
        
        //Sorting using Stream
        Map<Integer, Book> sortedData = data.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("Sorted data...");
        System.out.println(sortedData);
    }
}
