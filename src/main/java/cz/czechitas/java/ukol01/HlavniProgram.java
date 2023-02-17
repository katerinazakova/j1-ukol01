package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void nakresliPrasatko() {
        Turtle zofka = new Turtle();

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


        //TODO implementace domácího úkolu
    }

    private static void nozkyOdPrasatka(Turtle zofka) {
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

    public static void main(String[] args) {
        new HlavniProgram().nakresliPrasatko();
    }

}
