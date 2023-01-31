package org.example;


class Point
{
    int x1;

    int y1;
    Point(int x1,int y1)
    {
        this.x1=x1;
        this.y1=y1;
    }
    Point(Point pnt)
    {
        x1=pnt.x1;
        y1=pnt.y1;
    }


}
public class copyofconstructor {
    public static void main(String[] args) {
        Point p=new Point(2,4);
        Point p1=new Point(p);
        p1.x1=3;
        p1.y1=2;
        System.out.println(p.x1);
        System.out.println(p.y1);
        System.out.println(p1.x1);
        System.out.println(p1.y1);


    }
}
