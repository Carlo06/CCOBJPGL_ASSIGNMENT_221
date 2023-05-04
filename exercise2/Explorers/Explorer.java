package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Planet;
import Planets.Pluto;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Neptune;
import Planets.Venus;
import Planets.Uranus;

public interface Explorer {

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Pluto pluto);

    void visit(Mercury mercury);

    void visit(Neptune neptune);

    void visit(Earth earth);

    void visit(Venus venus);

    void visit(Jupiter jupiter);

    void visit(Uranus uranus);

    default void visit(Planet planet) {

        System.out.println("Landed on a planet");
    }
}
