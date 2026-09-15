import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
  
  /**
   * Paints the background of the neighborhood by zig-zagging.
   * from the top to bottom / left to right.
   */
  public void paintBackground(String color, int gridSize) {
    setPaint(gridSize * gridSize);
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      paintRow(color);
      turnToEast();
    }
  }

  /**
   * Helper method to paint a row of the neightboorhood.
   * Used in paintBackground method.
   */
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  /**
   * Helper method used to turn after each row to 
   * achieve the zig-zag painted background
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  /**
   * Helper method used to turn after each row to 
   * achieve the zig-zag painted background.
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }

  /**
   * Resets the BackgroundPainter object to the starting location.
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();
      turnLeft();
    }
  }
  
}