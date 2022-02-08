package com.company.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại sách");
        String type = scanner.nextLine();
        EBook eBook = EBookFactory.getEBook(type);
        eBook.bookName();
    }
}
