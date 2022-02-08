package com.company.factory;

public class Novel extends EBook{
    @Override
    public void bookName() {
        System.out.println("Sherlock Holmes");
        System.out.println("Bungou Straydogs");
        System.out.println("Robin Hills");
        System.out.println("Iron Wood");
    }
}
