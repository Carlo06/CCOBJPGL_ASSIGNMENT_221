package Planets;

import Explorers.Explorer;

public class Earth implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
