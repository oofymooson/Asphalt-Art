import org.code.neighborhood.*;

/**
 * EyePainter is a specialized PainterPlus subclass 
 * designed to paint the eyes of the chicken
 */
public class EyePainter extends PainterPlus {
  public void paintEyes(String color) {

// 1. Move to the correct spot and paint the first parts of the eye
    turnRight();
    move();
    move();
    paint(color);
        move();
    paint(color);

// 2. Change directions to other side of grid to paint the second pair of eyes
    turnLeft();
        move();
    paint(color);
    turnLeft();
        move();
    paint(color);

// 3. Keep moving east and painting tiles white    
    turnRight();
            while (canMove("east")) {
      move();
      paint("white");
  }

// 4. Paint the second pair of eye shapes
    paint(color);
    turnRight();
        move();
    paint(color);
    turnRight();
        move();
    paint(color);
    turnRight();
        move();
    paint(color);

// 5. Turn around and move back to line things up
    turnRight();
    turnRight();
    move();
        
// 6. Finish the eyes by painting the second line of white to finish the middle section of the chick
    turnRight();
    move();
    paint("white");
        move();
    paint("white");
        move();
    paint("white");
        move();
    paint("white");
  }
}