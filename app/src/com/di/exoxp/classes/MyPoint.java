package com.di.exoxp.classes;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
        super();
    }

    public MyPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY(int x, int y) {
        int[] arr = { this.x, this.y };
        return arr;
    }

    public void distance(int x, int y) {
        double d = Math.sqrt(Math.pow((x - this.getX()), 2) + Math.pow((y - this.getY()), 2));
        System.out.printf("La distance entre les deux points est : <%s>", d);
    }

    public void distance(MyPoint another) {
        double d = Math.sqrt(Math.pow((this.getX() - another.getX()), 2) + Math.pow((this.getY() - another.getY()), 2));
        System.out.printf("La distance entre les deux points est : <%s>", d);
    }

    public void distance() {
        double d = Math.sqrt(Math.pow((this.getX()), 2) + Math.pow((this.getY()), 2));
        System.out.printf("La distance entre l'origine et le point est : <%s>", d);
    }

}
