public class PlayerShip {
    // Ship position and size
    private int x, y;
    private int width, height;

    // Ship movement speed
    private int speed;

    // Ship health
    private int health;

    public PlayerShip(int x, int y, int width, int height, int speed, int health) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = health;
    }

    // Move ship left
    public void moveLeft() {
        x -= speed;
    }

    // Move ship right
    public void moveRight() {
        x += speed;
    }

    // Fire a projectile (you'll need to create the Projectile class separately)
    public Projectile shoot() {
        // Creates a new projectile starting from the top center of the ship
        return new Projectile(x + width / 2, y);
    }

    // Getters for rendering
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    // Health management
    public int getHealth() { return health; }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
