//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dices;

import java.util.Random;

public abstract class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public int roll() {
        Random r = new Random();
        return r.nextInt(this.sides) + 1;
    }
}
