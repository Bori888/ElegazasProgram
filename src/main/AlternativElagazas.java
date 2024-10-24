package main;

public class AlternativElagazas {

    public static void main(String[] args) {
        int probalkozasokSzama = 3 ;
        boolean vanUt = probalkozasokSzama <=10;

//        if (3 == 3) {
//            vanUt = true;
//        }
        System.out.println("Probalkozasok Szama:"+probalkozasokSzama);
        if (vanUt) {
            System.out.println("Van Út!");

        } else {
            System.out.println("Nincs Út!");
        }
    }

}
