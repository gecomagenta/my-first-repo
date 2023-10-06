public class Rectangle {
    private int w;
    private int h;

    public Rectangle() {
        this.h = this.w = 0;
    }

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int area() {
        return w * h;
    }
}
