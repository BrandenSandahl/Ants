package sample;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * Created by zach on 3/30/16.
 */
public class Ant {
    double x;
    double y;
    Color color;
   // Image image = new Image("tinyAnt.png");



    public Ant(double x, double y) {
        this.x = x;
        this.y = y;
        color = Color.BLACK;
    }
}
