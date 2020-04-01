package physics;

public class Rectangle
{
    private double x, y, width, height;

    public Rectangle(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean intersect(Rectangle rect)
    {
        if (this.x < rect.x + rect.width &&
                this.x + this.width > rect.x &&
                this.y < rect.y + rect.height &&
                this.y + this.height > rect.y) {
            return true;
        }

        return false;
    }

    public String toString()
    {

    }

}
