import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
 PixelPainter asdf = new PixelPainter();
    PixelPainter qwer = new PixelPainter();
    BackgroundPainter zxcv = new BackgroundPainter();
  asdf.setPaint(1000);
    qwer.setPaint(1000);
    asdf.paintCheckers("LightGray");
    qwer.paintEyes("black");
    asdf.turnLeft();
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
  zxcv.turnRight();
  zxcv.move();
}