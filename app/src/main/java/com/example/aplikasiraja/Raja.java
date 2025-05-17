package com.example.aplikasiraja;

public class Raja {
    private String nama;
    private int fotoResId;

    public Raja(String nama, int fotoResId) {
        this.nama = nama;
        this.fotoResId = fotoResId;
    }

    public String getNama() {
        return nama;
    }

    public int getFotoResId() {
        return fotoResId;
    }
}