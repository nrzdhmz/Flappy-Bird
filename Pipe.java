import java.awt.Image;

class Pipe {

  Pipe(FlappyBird flappyBird, Image img) {
      this.flappyBird = flappyBird;
      this.img = img;
      x = this.flappyBird.pipeX;
      y = this.flappyBird.pipeY;
      height = this.flappyBird.pipeHeight;
      width = this.flappyBird.pipeWidth;
      passed = false;
  }

  private final FlappyBird flappyBird;
  public int x;
  public int y;
  public int width; 
  public int height;
  public Image img;
  public boolean passed;
}