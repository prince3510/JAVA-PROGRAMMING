class Degree{
    public void getDegree()
    {
        System.out.println("I got a degree.");

    }

}
class Undergraduate extends Degree {
    public void getDegree()
    {
        System.out.println("I am an Undergraduate.");
    }
}
class Postgraduate extends Degree{
    public void getDegree()
    {
        System.out.println("I am a Postgraduate.");

    }
}

public class prac21 {
    public static void main(String[] args) {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();
        d.getDegree();
        u.getDegree();
        p.getDegree();
        System.out.print("\nName : PRINCE MALAVIYA_23DCS057 ");}
    
}