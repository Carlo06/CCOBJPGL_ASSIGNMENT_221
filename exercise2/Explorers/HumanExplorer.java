package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
   public void visit(Mars mars) {
      System.out.println("Gala Mars");

   }

   public void visit(Saturn saturn) {

      System.out.println("Gala Saturn");
   }

   public void visit(Mercury mercury) {
      System.out.println("Gala Mercury");
   }

   public void visit(Earth earth) {
      System.out.println("Gala earth");
   }

   public void visit(Jupiter jupiter) {
      System.out.println("Gala jupiter");
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
      System.out.println("Gala Uranus");
   }
}
