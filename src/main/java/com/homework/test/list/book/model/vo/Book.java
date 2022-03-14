package com.homework.test.list.book.model.vo;

public class Book implements Comparable<Book> {

    private String bNo;
    private int category; // 도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
    private String title;
    private String author;

    public Book() {
        super();
    }

    public Book(String bNo, int category, String title, String author) {
        super();
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    @Override
    public String toString() {
        return "도서번호: " + bNo + "\t도서분류코드: " + category + "\t도서명: " + title + "\t저자: " + author;
    }

    @Override
    public int compareTo(Book other) {
        return this.getbNo().compareTo(other.getbNo());
    }
}
