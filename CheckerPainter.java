import org.code.neighborhood.*;
  /**
   * Paints the Background or skin of the Chicken
   * by doing a checkered patterned skin color
   */
public class CheckerPainter extends PainterPlus {
  
  public void paintCheckers(String color) {

  // 1. Paints alternating checker-like tiles with the chosen color while moving east across the first row
        while (canMove("east")) {
      paint(color);
      move();
          if(canMove("east")) {
            move();
          }
    }

    // 2. Transitions from the first row down to the second row and turns west    
    if(!canMove("east")) {
      turnRight();
      move();
      turnRight();
    }

  // 3. Paints checkered tiles with the chosen color while moving west across the second row
    while(canMove("west")) {
            paint(color);
      move();
                if(canMove("west")) {
            move();
          }
    }
            // 4. returns back to the first row to paint the second part of the checkered tiles
          turnRight();
      move();
      turnRight();
    move();
    
    // 5. now paints the first row of the white part of the checkered tiles
            while (canMove("east")) {
      paint("white");
      move();
          if(canMove("east")) {
            move();
          }
    }
    paint("white");
        if(!canMove("east")) {
      turnRight();
      move();
      turnRight();
          move();
    }
    
    // 6. paints the second section of the checkered tiles white to fill the checkered section.
        while(canMove("west")) {
            paint("white");
      move();
                if(canMove("west")) {
            move();
          }
          paint("white");
    }
  }
}