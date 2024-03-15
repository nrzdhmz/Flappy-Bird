import java.awt.Image;

public class Bird {

    private final FlappyBird flappyBird;
    public int x;
    public int y;
    public int width;
    public int height;
    public Image img;

    Bird(FlappyBird flappyBird, Image img) {
        this.flappyBird = flappyBird;
        this.img = img;
        x = this.flappyBird.birdX;
        y = this.flappyBird.birdY;
        width = this.flappyBird.birdWidth;
        height = this.flappyBird.birdHeight;
    }
}