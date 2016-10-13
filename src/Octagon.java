import java.util.Objects;

/**
 * Created by scott_000 on 10/7/2016.
 */
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

    double length;
    public double area;

    public Octagon(){

    }

    public Octagon(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        checkLength(length);
        this.length = length;
    }

    public double getArea(int length){
        area = (2 + 4/Math.sqrt(2))* length * length;
        System.out.println(area);
        return area;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Octagon oct1Clone = (Octagon)super.clone();
        return oct1Clone;
    }

    @Override
    public int compareTo(Octagon o){
        Octagon other = (Octagon) o;
        if (other.area > o.area)
            return 1;
        else if (other.area < o.area)
            return -1;
        else
            return 0;
    }

    public static void checkLength(double length){
        if (length < 0){
            System.out.print("The length must be greater than 0");
            System.exit(1);
        }
    }
}

