package com.company.factory;

public class EBookFactory {
    private EBook eBook;

    public static EBook getEBook(String type) {
        if (type.equals("Literature")) {
            return new LiteratureBook();
        } else if (type.equals("Novel")) {
            return new Novel();
        } else if (type.equals("MartialArt")) {
            return new MartialArt();
        } else
            return null;
    }
}
