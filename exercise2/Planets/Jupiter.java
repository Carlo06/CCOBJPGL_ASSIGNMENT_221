package Planets;

import Explorers.Explorer;

public class Jupiter implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
