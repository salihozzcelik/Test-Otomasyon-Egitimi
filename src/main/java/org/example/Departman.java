package org.example;

import java.util.ArrayList;
import java.util.List;

public class Departman {

    public static void main(String[] args) {
        Departman departman=new Departman("ekin");
      departman.personelEkle("salih");
    }

        private String ad;
        private List<String> personeller;

    public Departman(String ad) {
            this.ad = ad;
            this.personeller = new ArrayList<>();

        }

        public void personelEkle (String personelAdi){
            personeller.add(personelAdi);
        }
        public List<String> getPersoneller () {
            return personeller;
        }
    }

