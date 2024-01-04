class circle
{
    double radius;
    public circle()
    {
      this.radius=5;
    }
    public double getradius()
    {
        return radius;
    }
    public double volum(double radius)
    {
         double volum=4*Math.PI*radius*radius;
         return volum;
    }
    public double surfacearea(double radius)
    {
        double surfacearea=4/3*Math.PI*radius*radius*radius;
        return surfacearea;
    }
}
public class circleconstructer 
{
    public static void main(String[] args) 
    {
      circle c=new circle();  
      System.out.println(c.getradius());
      System.out.println(c.surfacearea(5));
      System.out.println(c.volum(5));
    }
}
