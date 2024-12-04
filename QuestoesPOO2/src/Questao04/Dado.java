package Questao04;

import java.util.Random;

public class Dado {
    private int faces;

    public Dado(int faces) {
        this.faces = faces;
    }

    public int jogar() {
        Random random = new Random();
        return random.nextInt(faces) + 1;
    }
}
