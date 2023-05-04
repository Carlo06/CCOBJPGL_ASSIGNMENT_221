package Planets;

import Explorers.Explorer;

public class Pluto implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
