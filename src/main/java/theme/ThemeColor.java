package theme;

import java.awt.*;
import java.util.Random;

public class ThemeColor {
    private final long id;
    private final String fontColor;
    private final String backgroundColor;

    private String getRandomColor(){
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color color = new Color(r,g,b);
        String hex = Integer.toHexString(color.getRGB() & 0xffffff);
        if (hex.length() < 6) {
            hex = "0" + hex;
        }
        hex = "#" + hex;
        return hex;
    }
    public ThemeColor(long id) {


        this.id = id;
        this.fontColor  =getRandomColor();
        this.backgroundColor = getRandomColor();
    }

    public String getFontColor() {
        return fontColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public long getId() {
        return id;
    }
}
