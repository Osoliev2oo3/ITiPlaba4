import java.sql.SQLOutput;
import java.util.Scanner;
public class Laba1 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        Point3d firstPoint = new Point3d();
        Point3d secondPoint = new Point3d();
        Point3d thirdPoint = new Point3d();
        Point3d distanceTo = new Point3d();

        System.out.println("Введите значение x первой точки: ");
        double x = in.nextDouble();
        System.out.println("Введите значение y первой точки: ");
        double y = in.nextDouble();
        System.out.println("Введите значение z первой точки: ");
        double z = in.nextDouble();
        firstPoint.setX(x);
        firstPoint.setY(y);
        firstPoint.setZ(z);

        System.out.println("Введите значение x второй точки: ");
        double x2 = in.nextDouble();
        System.out.println("Введите значение y второй точки: ");
        double y2 = in.nextDouble();
        System.out.println("Введите значение z второй точки: ");
        double z2 = in.nextDouble();
        secondPoint.setX(x2);
        secondPoint.setY(y2);
        secondPoint.setZ(z2);

        System.out.println("Введите значение x третей точки: ");
        double x3 = in.nextDouble();
        System.out.println("Введите значение y третей точки: ");
        double y3 = in.nextDouble();
        System.out.println("Введите значение z третей точки: ");
        double z3 = in.nextDouble();
        thirdPoint.setX(x3);
        thirdPoint.setY(y3);
        thirdPoint.setZ(z3);
        double a = distanceTo.distaseTo(firstPoint.getX(), firstPoint.getY(), firstPoint.getZ(), secondPoint.getX(), secondPoint.getY(), secondPoint.getZ());
        double b = distanceTo.distaseTo(secondPoint.getX(), secondPoint.getY(), secondPoint.getZ(), thirdPoint.getX(), thirdPoint.getY(), thirdPoint.getZ());
        double c = distanceTo.distaseTo(firstPoint.getX(), firstPoint.getY(), firstPoint.getZ(), thirdPoint.getX(), thirdPoint.getY(), thirdPoint.getZ());
        if (a==b || b==c || a==c){
            System.out.println("Две стороны равны");
        }
        else{
            System.out.printf("%.2f",computeArea(a, b, c));
        }
    }
    public static double computeArea(double a, double b, double c){
        double  p= (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
