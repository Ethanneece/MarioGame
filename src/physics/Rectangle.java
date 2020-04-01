package physics;

/**
 * @author ethann
 * @date 4/1/2020
 * Class for hit boxes.
 */
public class Rectangle
{
    private double x, y, width, height;

    /**
     * Creates a basic Rectangle object.
     */
    public Rectangle()
    {}

    /**
     * Creates a basic Rectangle object.
     *
     * @param x is the x-position of the rectangle.
     * @param y is the y-position of the rectangle.
     */
    public Rectangle(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Creates a basic Rectangle object.
     *
     * @param x is the x-position of the rectangle.
     * @param y is the y-position of the rectangle.
     * @param width is the width of the rectangle.
     * @param height is the height of the rectangle.
     */
    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Checks if the rectangles are intersecting.
     *
     * @param rect is the rectangle that is being tested.
     * @return true if the rectangles are intersecting.
     */
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

    /**
     * Shifts the rectangles position by x,y.
     * @param x adding to the x-position.
     * @param y adding to the y-position.
     */
    public void transform(double x , double y)
    {
        this.x += x;
        this.y += y;
    }

    /**
     * Moves the rectangles position to x,y.
     * @param x x-position.
     * @param y y-position.
     */
    public void update(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x,y,width,height);
    }

    public String toString()
    {
        return "Rectangle \n\t{X: " + x + " Y: " + y + " Width: " + " Height: " + height + "}";
    }
}
