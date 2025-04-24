package oops;

public class std {
    String name;
     int rno;
    double percent;
    final String school="smhs";
   private static int noofstd;
   public static int getNoofstd()
   {
       return noofstd;
   }
    public std ()
    {

    }

    public std (String naam, int roll,double per){
        name=naam;
        rno=roll;
        percent=per;
        noofstd++;

    }
    public int getRno()
    {
        return rno;
    }
    public  void  setRno()
    {
        this.rno=rno;
    }

}