package org.patrapee.javabrains;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle  {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private ApplicationContext context = null;


    public void draw(){
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
