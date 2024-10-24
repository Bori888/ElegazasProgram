package main;

public class ElagazasSzerkezete {

    public static void main(String[] args) {
        final int MAX_PROBALAKOZASOK_SZAMA =10;//késöbb nem változtathato meg az értéke
        //Finalt mindig végig nagybetüvel irjuk és _ -lal
        //MAX_PROBALAKOZASOK_SZAMA=100;
        int probalkozasokSzama = 2;
        probalkozasokSzama = 4;
        boolean vanUt = probalkozasokSzama <= 10;
        System.out.println(".....Elágazás Eleje!.....");
        if (vanUt) {
            System.out.println("*****Igaz ág!*****");
            System.out.println("*****Helló Python!*****");
            System.out.println("*****True Út!*****");
        } else {
            System.out.println("-----False Út!-----");
        }
        System.out.println(".....Elágazás Vége!.....");
    }
}
