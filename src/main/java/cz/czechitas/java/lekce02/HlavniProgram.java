package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        nakresliPrase();

        //TODO tady bude kód
    }

    private void nakresliPrase() {
        zofka.turnRight(90);

        nakresliDomecek();

        nakresliNohu();

        zofka.move(200);
        zofka.turnLeft(45);
        zofka.penDown();

        nakresliNohu();

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(45);
        zofka.penDown();
        zofka.move(40);
    }

    private void nakresliNohu() {
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(45);
    }

    private void nakresliDomecek() {
        nakresliCtverec();
        nakresliStrechu();
    }

    private void nakresliStrechu() {
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(45);
        zofka.penDown();
        zofka.move(143);
        zofka.turnRight(90);
        zofka.move(143);
    }


    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(200);
            zofka.turnRight(90);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
