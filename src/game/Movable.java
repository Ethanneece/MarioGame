package game;

import physics.Rectangle;

public class Movable
{
    private double accelerationX, velocityX;
    private double accelerationY, velocityY;
    private Rectangle rectangle;

    public Movable(Rectangle rect)
    {
        this.rectangle = rect;
    }

    public boolean collide(Movable move)
    {
        if(move.getPreview().intersect(getPreview()))
        {
            calculateCollison();
            return true;
        }

        return false;
    }

    public void collides()

    private void calculateCollison(Movable move)

    /**
     * gets preview of where this object is moving to.
     * @param time is the time between when it was last updated.
     * @return rectangle that is where this rectangle is headed
     *  in the next update.
     */
    public Rectangle getPreview(long nanoseconds)
    {
        double xUpdate = nanoseconds * velocityX * 10e-9;
        double yUpdate = nanoseconds * velocityY * 10e-9;

        Rectangle newRect = rectangle.getBounds();
        newRect.transform(xUpdate, yUpdate);

        return newRect;
    }

    public void move(long nanoseconds)
    {

    }
}
