package com.homework.test.list.book.controller;

import java.util.ArrayList;
import java.util.List;

import com.homework.test.list.book.model.compare.AscCategory;
import com.homework.test.list.book.model.vo.Book;

public class BookManager {
    List<Book> bookList;

    public BookManager() {
        super();
        bookList = new ArrayList<>();
    }

    public BookManager(List<Book> bookList) {
        super();
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public int searchBook(String title) {
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().contains(title))
                return i;
        }
        return -1;
    }

    public void printBook(int index) {
        String bNo = bookList.get(index).getbNo();
        int category = bookList.get(index).getCategory();
        String title = bookList.get(index).getTitle();
        String author = bookList.get(index).getAuthor();
        System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n",
                category, bNo, title, author);
    }

    public void printAll() {
        for(Book b : bookList) {
            System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n",
                    b.getCategory(),
                    b.getbNo(),
                    b.getTitle(),
                    b.getAuthor());
        }
    }

    public Book[] sortedBookList() {
        Book[] bookArr = new Book[bookList.size()];
        bookList.sort(new AscCategory());

        for(int i = 0; i < bookList.size(); i++)
            bookArr[i] = bookList.get(i);

        return bookArr;

    }

    public void printBookList(Book[] br) {
        for(Book b : br) {
            System.out.printf("%d. [도서번호: %s, 제목: %s, 저자: %s]%n",
                    b.getCategory(),
                    b.getbNo(),
                    b.getTitle(),
                    b.getAuthor());
        }
    }
}
