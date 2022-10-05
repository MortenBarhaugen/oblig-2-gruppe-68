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

        String[] s3 = {"A", "B"};
        DobbeltLenketListe<String> liste3 = new DobbeltLenketListe<>(s3);
        System.out.println(liste3.toString() + " " + liste3.omvendtString());

        System.out.println(liste2.indeksTil("F"));
        System.out.println(liste2.indeksTil("D"));
        System.out.println(liste2.inneholder("F"));
        System.out.println(liste2.inneholder("D"));

        liste3.leggInn( "Z");
        System.out.println(liste3.toString());

        String[] s4 = {};
        DobbeltLenketListe<String> liste4 = new DobbeltLenketListe<>(s4);
        liste4.leggInn("Q");
        System.out.println(liste4);
    }
}
