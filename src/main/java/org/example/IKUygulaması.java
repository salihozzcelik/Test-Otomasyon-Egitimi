package org.example;

public class IKUygulaması {

    public static void main (String[] args) {

        Departman muhasebe = new Departman("Muahasebe");

        muhasebe.personelEkle("ali");
        muhasebe.personelEkle("ayşe");
        muhasebe.personelEkle("salih");

        System.out.println("Departmandaki Personeller:"+ muhasebe.getPersoneller());
    }
}
