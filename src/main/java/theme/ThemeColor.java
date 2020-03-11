package theme;

public class ThemeColor {
    private final long id;
    private final String fontColor;
    private final String backgroundColor;

    public ThemeColor(long id) {
        this.id = id;
        this.fontColor = "#E8793E";
        this.backgroundColor = "#3EC5E4";
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
