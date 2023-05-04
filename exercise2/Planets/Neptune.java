package Planets;

import Explorers.Explorer;

public class Neptune implements Planet {

    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
