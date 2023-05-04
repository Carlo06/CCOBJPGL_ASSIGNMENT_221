package Planets;

import Explorers.Explorer;

public class Mercury implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
