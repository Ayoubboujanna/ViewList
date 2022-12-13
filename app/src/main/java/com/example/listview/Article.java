package com.example.listview;

public class Article {
    public static int Code;
    public static String Libelle;
    public static int Pv;

    public Article(int code, String libelle, int pv) {
        Code = code;
        Libelle = libelle;
        Pv = pv;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public int getPv() {
        return Pv;
    }

    public void setPv(int pv) {
        Pv = pv;
    }


}
