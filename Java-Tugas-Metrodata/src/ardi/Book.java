/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardi;

/**
 *
 * @author RAI
 */
public class Book {
    private String isbn, title, page, author;
    private int totalSell;

    public Book(String isbn, String title, String author, String page, int totalSell) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.page = page;
        this.totalSell = totalSell;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", page=" + page + ", totalSell=" + totalSell + '}';
    }

    public int getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(int totalSell) {
        this.totalSell = totalSell;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
