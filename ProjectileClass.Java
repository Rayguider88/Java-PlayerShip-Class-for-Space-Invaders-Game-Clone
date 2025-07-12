public class Projectile {
    private int x, y;
    private int speed = 10;

    public Projectile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        y -= speed; // Moves upward
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
