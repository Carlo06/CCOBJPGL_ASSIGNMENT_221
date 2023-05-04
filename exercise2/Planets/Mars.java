package Planets;

import Explorers.Explorer;

public class Mars implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
