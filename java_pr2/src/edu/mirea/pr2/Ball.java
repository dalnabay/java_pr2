package edu.mirea.pr2;

public class Ball {
    private double x;
    private double y;
    private double horizontalStep;
    private double verticalStep;

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setXYSpeed(double horizontalStep, double verticalStep) {
        this.horizontalStep = horizontalStep;
        this.verticalStep = verticalStep;
    }

    public void move() {
        move(horizontalStep, verticalStep);
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}
