import org.code.neighborhood.*;

public class PixelPainter extends PainterPlus {
  public void paintEyes(String color) {
    turnRight();
    move();
    move();
    paint(color);
        move();
    paint(color);
    turnLeft();
        move();
    paint(color);
    turnLeft();
        move();
    paint(color);
    turnRight();
            while (canMove("east")) {
      move();
  }
    paint(color);
    turnLeft();
    turnLeft();
        move();
    paint(color);
    turnLeft();
        move();
    paint(color);
    turnLeft();
        move();
    paint(color);
    turnRight();
  }
  public void paintCheckers(String color) {
        while (canMove("east")) {
      paint(color);
      move();
          if(canMove("east")) {
            move();
          }
    }
    if(!canMove("east")) {
      turnRight();
      move();
      turnRight();
    }
    while(canMove("west")) {
            paint(color);
      move();
                if(canMove("west")) {
            move();
          }
    }
          turnRight();
      move();
      turnRight();
    move();
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