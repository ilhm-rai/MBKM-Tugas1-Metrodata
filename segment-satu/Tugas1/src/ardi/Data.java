/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardi;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RAI
 */
public class Data {

    static Map<Integer, Book> getData() {
        Map<Integer, Book> books = new HashMap<Integer, Book>()
        {{
            put(3, new Book("1-1322", "berani bahagia", "Ichiro Kishimi", "284", 2));
            put(7, new Book("2-2242", "dunia cinta filosofis kahlil gibran", "Fahruddin Faiz", "274", 3));
            put(1, new Book("3-2122", "berani tidak disukai", "Ichiro Kishimi", "284", 5));
            put(4, new Book("4-2312", "meditations", "Marcus Aurelius", "295", 1));
            put(5, new Book("5-2142", "sebelum filsafat", "Fahruddin Faiz", "274", 3));
        }};
        return books;
    }
}
