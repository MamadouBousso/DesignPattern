package bousso;

public class Test {
    public static void main(String[] args) {
        Animal mout = new Mouton("mouton",new beler());
        mout.faireCri();
        Animal chien = new Chien("chien",new aboyer());
        chien.faireCri();

    }
}
