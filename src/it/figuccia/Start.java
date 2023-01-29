package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String hit = "tup tuup tuuup tuuuup";
        String result = hit.replaceAll("u{2,3}", "X");
        System.out.println(result);

    }
}
