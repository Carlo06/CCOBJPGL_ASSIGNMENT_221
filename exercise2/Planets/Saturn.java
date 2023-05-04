package Planets;

import Explorers.Explorer;

public class Saturn implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
