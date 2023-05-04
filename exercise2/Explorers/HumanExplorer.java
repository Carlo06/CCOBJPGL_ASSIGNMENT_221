package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
   public void visit(Mars mars) {
      System.out.println("Exploring a Planet");

   }

   public void visit(Saturn saturn) {

      System.out.println("Libot sa saturn");
   }

   public void visit(Mercury mercury) {
      System.out.println("Deploying tools specific to Saturn... exploring life");
   }

   public void visit(Earth earth) {
      System.out.println(" gala earth");
   }

   public void visit(Jupiter jupiter) {
      System.out.println("gala jupiter");
   }

   public void visit(Venus venus) {
      System.out.println("Gala Venus");
   }

   public void visit(Neptune neptune) {
      System.out.println("Gala Neptune");
   }

   public void visit(Pluto pluto) {
      System.out.println("Gala Pluto");
   }

   public void visit(Uranus uranus) {
      System.out.println("gala uranus");
   }
}
