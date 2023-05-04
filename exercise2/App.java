import Explorers.*;
import Planets.*;

import Explorers.Explorer;
import Explorers.HumanExplorer;
import Explorers.RobotExplorer;
import Planets.*;

public class App {
    public static void main(String[] args) throws Exception {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet pluto = new Pluto();
        Planet neptune = new Neptune();
        Planet earth = new Earth();
        Planet venus = new Venus();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        pluto.accept(astronaut);
        neptune.accept(astronaut);
        earth.accept(astronaut);
        venus.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        pluto.accept(rover);
        neptune.accept(rover);
        earth.accept(rover);
        venus.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);

    }
}
