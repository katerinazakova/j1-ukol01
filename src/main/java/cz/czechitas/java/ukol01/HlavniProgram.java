package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
/*
        drawPiggyWithTail(Color.PINK);

        zofka.setLocation(300, 40);
        drawPolygon(40, 8, Color.BLACK);

        zofka.setLocation(300, 350);
        drawPolygon(10, 25, Color.DARK_GRAY);

        zofka.setLocation(300, 500);
        drawSun(Color.ORANGE);

*/
        zofka.setLocation(250, 570);
        writeName(Color.BLACK);

        zofka.setLocation(150, 380);
        zofka.turnRight(90);
        drawHouse(Color.BLACK);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.penDown();


        for (int i = 0; i < 5; i++) {
            drawHouse(Color.BLACK);

            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(200);
            zofka.penDown();
        }
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(195);
        zofka.turnLeft(90);
        zofka.penDown();

        drawHouse(Color.BLACK);

        zofka.setLocation(630, 340);
        zofka.turnLeft(90);
        drawPiggyWithTail(Color.PINK);

        zofka.setLocation(290, 30);

        drawSun(Color.ORANGE);


    }


    public void drawPiggyWithTail(Color colorLine) {
        zofka.setPenColor(colorLine);

        drawRectangle(60, 120);
        zofka.turnRight(90);

        feetOfPiggy();

        zofka.turnLeft(120);
        zofka.move(120);
        zofka.turnRight(180);
        zofka.penDown();

        feetOfPiggy();

        zofka.turnLeft(30);
        zofka.penDown();

        drawEquilateralTriangle(60, Color.PINK);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(20);

    }

    public void drawEquilateralTriangle(double lengthSide, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 3; i++) {
            zofka.move(lengthSide);
            zofka.turnLeft(120);

        }

    }

    public void drawRectangle(double lengthSideA, double lengthSideB) {

        for (int i = 0; i < 2; i++) {
            zofka.move(lengthSideA);
            zofka.turnLeft(90);
            zofka.move(lengthSideB);
            zofka.turnLeft(90);
        }
    }


    public void feetOfPiggy() {

        zofka.turnRight(60);
        zofka.move(20);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);

    }

    public void drawPolygon(double lengthSide, int numberOfPolygonSides, Color colorLine) {
        zofka.setPenColor(colorLine);

        double angle = 360 / numberOfPolygonSides;

        for (int i = 0; i < numberOfPolygonSides; i++) {
            zofka.turnRight(angle);
            zofka.move(lengthSide);

        }

    }


    public void drawSun(Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                zofka.move(10);
                zofka.turnRight(20);
            }

            zofka.turnLeft(90);
            zofka.move(10);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.penDown();
        }
    }


    public void drawHouse(Color colorLine) {
        zofka.setPenColor(colorLine);

        drawRectangle(60, 120);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.penDown();

        drawEquilateralTriangle(60, Color.RED);
    }


    public void writeName(Color colorLine) {
        zofka.setPenColor(colorLine);

        drawCapitalLetterK();

        drawCapitalLetterA();

        drawCapitalLetterT();

        drawCapitalLetterK();

        drawCapitalLetterA();

    }

    public void drawCapitalLetterT() {
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

    public void drawCapitalLetterA() {
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

    public void drawCapitalLetterK() {
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

    }

}
