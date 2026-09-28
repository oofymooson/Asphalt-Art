import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
// 1. Instantiate the painter objects
 CheckerPainter asdf = new CheckerPainter();
    EyePainter qwer = new EyePainter();
    BackgroundPainter zxcv = new BackgroundPainter();

// 2. each painter gets paint resources
  asdf.setPaint(1000);
    qwer.setPaint(1000);
    zxcv.setPaint(1000);

// 3. Creates the base patterns on the top half of the 8 by 8 section
    asdf.paintCheckers("LightGray");
    qwer.paintEyes("black");
    asdf.turnLeft();

// 4. Create the background striped bands (Gold, Orange, Red, Crimson)
    zxcv.turnRight();
    zxcv.move();
    zxcv.move();
    zxcv.move();
    zxcv.move();
    zxcv.turnLeft();
    zxcv.paintRow("gold");
    zxcv.turnRight();
    zxcv.move();
    zxcv.turnRight();
    zxcv.paintRow("orange");
    zxcv.turnLeft();
    zxcv.move();
    zxcv.turnLeft();
    zxcv.paintRow("red");
      zxcv.turnRight();
    zxcv.move();
    zxcv.turnRight();
    zxcv.paintRow("crimson");

// 5. Goes to the south to paint checkers on the bottom left
    while(asdf.canMove("south")){
      asdf.move();
    }
    asdf.turnLeft();
    asdf.paint("white");
    asdf.move();
    asdf.paint("LightGray");
        asdf.turnLeft();
    asdf.move();
    asdf.paint("white");
    asdf.turnLeft();
    asdf.move();
    asdf.paint("LightGray");
    asdf.turnLeft();
    asdf.turnLeft();


// 6. Goes to the east to paint the bottom right
    while(asdf.canMove("east")) {
      asdf.move();
    }
        asdf.turnRight();
    asdf.paint("white");
    asdf.move();
    asdf.paint("LightGray");
         asdf.turnRight();
    asdf.move();
    asdf.paint("white");
        asdf.turnRight();
    asdf.move();
    asdf.paint("LightGray");

  }
}