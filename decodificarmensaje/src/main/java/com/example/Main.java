package com.example;

public class Main {
    public static void main(String[] args) {

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0.";

        String decodificado1 = mensajeCodificado.replace("0", "o");
        String decodificado2 = decodificado1.replace("3","e");
        String decodificado3 = decodificado2.replace("4", "a");
        String decodificado4 = decodificado3.trim();
        String decodificado5 = decodificado4.toUpperCase();
        

        System.out.println(decodificado5);
    }
}