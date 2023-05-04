package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {

    public void visit(Mars mars) {
        System.out.println("Robot Gala Mars");

    }

    public void visit(Saturn saturn) {

        System.out.println("Robot Gala Saturn");
    }

    public void visit(Mercury mercury) {
        System.out.println("Robot Gala Mercury");
    }

    public void visit(Earth earth) {
        System.out.println("Robot Gala earth");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Robot Gala jupiter");
    }

    public void visit(Venus venus) {
        System.out.println("Robot Gala Venus");
    }

    public void visit(Neptune neptune) {
        System.out.println("Robot Gala Neptune");
    }

    public void visit(Pluto pluto) {
        System.out.println("Robot Gala Pluto");
    }

    public void visit(Uranus uranus) {
        System.out.println("Robot Gala uranus");
    }
}
