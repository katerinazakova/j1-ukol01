package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {


    public void start() {
    }
     public void nakresliPrasatko () {

            Turtle zofka = new Turtle();

         nakresliPrasatkoSOcaskem(zofka);


         //TODO implementace domácího úkolu

        }

    private static void nakresliPrasatkoSOcaskem(Turtle zofka) {
        zofka.move(120);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(60);
        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(60);
        zofka.move(60);

        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(180);

        nozkyOdPrasatka(zofka);

        zofka.turnLeft(120);
        zofka.move(180);
        zofka.turnRight(180);
        zofka.penDown();
        nozkyOdPrasatka(zofka);

        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(120);
        zofka.turnRight(120);
        zofka.move(120);
    }

    private static void nozkyOdPrasatka (Turtle zofka){
            zofka.turnRight(60);
            zofka.move(40);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(40);
            zofka.turnLeft(120);
            zofka.penDown();
            zofka.move(40);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(40);

        }


  public void osmisten () {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        zofka.turnLeft(90);

        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }


   public void kruh (){
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(90);
        zofka.penDown();

        nakresliKolecko(20, 20, zofka, 10);

    }

    private static void nakresliKolecko(int x, int x1, Turtle zofka, int pixels) {
        for (int i = 0; i < x; i++) {
            zofka.move(pixels);
            zofka.turnRight(x1);
        }
    }

    public void slunicko (){
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.penDown();

        nakresliSlunicko(zofka);

    }

    private static void nakresliSlunicko(Turtle zofka) {
        for (int i = 0; i < 10; i++) {
            zofka.move(10);
            zofka.turnRight(20);
            zofka.move(10);
            zofka.turnRight(20);
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(15);
            zofka.turnLeft(90);
            zofka.penDown();
        }
    }

    public void obrazek(){
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(340);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(130);
        zofka.penDown();
        zofka.turnLeft(90);

        nakresliDomecek(zofka);

        for (int i = 0; i < 4; i++) {
            zofka.turnLeft(135);
            zofka.penUp();
            zofka.move(220);
            zofka.turnLeft(180);
            zofka.penDown();

            nakresliDomecek(zofka);
        }

        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.move(160);
        zofka.turnRight(135);
        zofka.penDown();

        nakresliPrasatkoSOcaskem(zofka);

        zofka.penUp();
        zofka.turnLeft(120);
        zofka.move(235);
        zofka.turnRight(20);
        zofka.move(50);
        zofka.penDown();

        nakresliSlunicko(zofka);

    }


    private static void nakresliDomecek(Turtle zofka) {
        zofka.move (60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        zofka.turnLeft(45);
        zofka.move(42.4);
        zofka.turnLeft(90);
        zofka.move(42.4);
    }

    public void jmeno(){
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliPismenoK(zofka);

        nakresliPismenkoA(zofka);

        nakresliPismenkoT(zofka);

        nakresliPismenoK(zofka);

        nakresliPismenkoA(zofka);

    }

    private static void nakresliPismenkoT(Turtle zofka) {
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private static void nakresliPismenkoA(Turtle zofka) {
        zofka.turnRight(20);
        zofka.move(156.5);
        zofka.turnRight(180);
        zofka.turnLeft(40);
        zofka.move(156.5);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(70);
        zofka.turnLeft(70);
        zofka.penDown();
        zofka.move(59);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(59);
        zofka.turnRight(70);
        zofka.move(70);
        zofka.turnLeft(70);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private static void nakresliPismenoK(Turtle zofka) {
        zofka.move(140);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(99);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(99);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(99);
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public static void main(String[] args) {
            new HlavniProgram().start();
            //new HlavniProgram().nakresliPrasatko();
            //new HlavniProgram().osmisten();
            //new HlavniProgram().kruh();
            //new HlavniProgram().slunicko();
            new HlavniProgram().obrazek();
            new HlavniProgram().jmeno();

        }

}
