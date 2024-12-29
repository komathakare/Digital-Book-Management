package com.komal.bookmgmt.dto;

public class UserBook {
    Long id;
    String uerName;
    String department;
    String bookName;
    String bookAuthor;
    String isbn;

    public UserBook() {
    }

    public String getUerName() {
        return uerName;
    }

    public void setUerName(String uerName) {
        this.uerName = uerName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserBook{" +
                "id=" + id +
                ", uerName='" + uerName + '\'' +
                ", department='" + department + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}


