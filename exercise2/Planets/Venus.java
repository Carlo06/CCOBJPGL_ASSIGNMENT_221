package Planets;

import Explorers.Explorer;

public class Venus implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
