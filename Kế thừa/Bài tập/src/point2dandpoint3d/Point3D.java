package point2dandpoint3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private double z = 0.0d;

    public Point3D() {
    }
    public Point3D(double x, double y, double z){
        super(x,y);
        this.z=z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x, double y, double z){
        super.setXY(x,y);
        this.z=z;
    }
    public double[] getXYZ(){
        double[] arr={getX(),getY(),getZ()};
        return arr;
    }
    @Override
    public String toString(){
        return Arrays.toString(getXYZ());
    }
}
