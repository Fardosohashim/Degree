package SubclassofDegree;

import org.w3c.dom.ls.LSOutput;

public class Degree {
    public void getDegree() {
        System.out.println("i got a degree");
    }
}
    class Undergraduate extends Degree {
   public void Undergraduate(){
    System.out.println("Iam an Undergraduate");
}
    }
    class postgraduate extends Degree{
    public void postgraduate(){
        System.out.println("Iam a postgraduate");
    }
    }
