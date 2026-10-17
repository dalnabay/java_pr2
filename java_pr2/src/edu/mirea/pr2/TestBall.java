package edu.mirea.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball first = new Ball(12, 8);
        Ball second = new Ball();
        System.out.println("Первый мяч: " + first);
        System.out.println("Второй мяч: " + second);

        first.move(-2, 4);
        System.out.println("После смещения: " + first);
        first.setX(3);
        first.setY(6);
        System.out.println("Координаты: " + first.getX() + "; " + first.getY());

        first.setXY(20, 10);
        first.setXYSpeed(3, -1);
        first.move();
        first.move();
        System.out.println("После двух шагов: " + first);
        System.out.println("Второй мяч остался на месте: " + second);
    }
}
