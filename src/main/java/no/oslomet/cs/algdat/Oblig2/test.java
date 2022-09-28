package no.oslomet.cs.algdat.Oblig2;

public class test {
    public static void main(String[] args) {
        String[] s1 = {"D",null,"E","F","G", null};
        DobbeltLenketListe<String> liste = new DobbeltLenketListe<>(s1);
        System.out.println(liste.antall() + " " + liste.tom());

        String[] s2 = {"A","B","C","D","E"};
        DobbeltLenketListe<String> liste2 = new DobbeltLenketListe<>(s2);
        System.out.println(liste2.antall() + " " + liste2.tom());
        System.out.println(liste2.toString());
        System.out.println(liste2.omvendtString());

        String[] s3 = {};
        DobbeltLenketListe<String> liste3 = new DobbeltLenketListe<>(s3);
        System.out.println(liste3.antall() + " " + liste3.tom());
    }
}
