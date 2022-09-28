package no.oslomet.cs.algdat.Oblig2;

public class testOppgave2 {
    public static void main(String[] args) {
        String[] s1 = {}, s2 = {"A"}, s3 = {null,"A",null,"B",null};
        DobbeltLenketListe<String> l1 = new DobbeltLenketListe<>(s1);
        DobbeltLenketListe<String> l2 = new DobbeltLenketListe<>(s2);
        DobbeltLenketListe<String> l3 = new DobbeltLenketListe<>(s3);

        System.out.println("l1.toString: " + l1.toString());
        System.out.println("l2.toString: " + l2.toString());
        System.out.println("l3.toString: " + l3.toString());
        System.out.println("l1.omvendtString: " + l1.omvendtString());
        System.out.println("l2.omvendtString: " + l2.omvendtString());
        System.out.println("l3.omvendtString: " + l3.omvendtString());
    }
}
