public class Point3d {
    private double XCord;
    private double YCord;
    private double ZCord;
    public Point3d(double x, double y,double z){
        XCord=x;
        YCord=y;
        ZCord=z;
    }
    public double getX(){
        return XCord;
    }
    public double getY(){
        return YCord;
    }
    public double getZ(){
        return ZCord;
    }
    public void setX(double val){
        XCord=val;
    }
    public void setY(double val){
        YCord=val;
    }
    public void setZ(double val){
        ZCord=val;
    }
    public Point3d(){
        this(0.0,0.0,0.0);
    }
    public  boolean Compare(double x, double y, double z, double x2, double y2, double z2){
        if(x==x2 && y==y2 && z==z2){
            return true;
        }
        return false;
    }
    public double distaseTo(double x, double y, double z, double x2, double y2, double z2){
        return (Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2)+Math.pow((z2-z),2)));
    }
}


