package org.patrapee.javabrains;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class Triangle implements Shape {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private ApplicationContext context = null;

    @Override
    public void draw(){
        System.out.println("Drawing Triangle");
        for(Point point:points){
            System.out.println("Point = ("+point.getX()+","+point.getY()+")");
        }
    }

    public void myInit(){
        System.out.println("My Init method");
    }

    public void cleanUp(){
        System.out.println("Clean up");
    }

}
