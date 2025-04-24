package oops;

public class fraction {
    public static  Fraction add(Fraction f1, Fraction f2)
    {
        int numer=  (f1.num * f2.den) + (f2.num*f1.den);
        int denom= f1.den*f2.den;
        Fraction f3= new Fraction(numer,denom);

        return f3;

    }
    public static  Fraction sub(Fraction f1, Fraction f2)
    {
        int numer=  (f1.num * f2.den) -(f2.num*f1.den);
        int denom= f1.den*f2.den;
        Fraction f3= new Fraction(numer,denom);

        return f3;

    }
    public static  Fraction multiply(Fraction f1, Fraction f2)
    {
        int numer=  f1.num *f2.num;
        int denom= f1.den*f2.den;
        Fraction f3= new Fraction(numer,denom);

        return f3;

    }
    public static  Fraction divide(Fraction f1, Fraction f2)
    {
        int numer=f1.num*f2.den;
        int denom=f2.num*f1.den;

        Fraction f3=new Fraction(numer,denom);
        return f3;

    }

   public static  int gcd(int num,int den)
   {
       int min=Math.min(num,den);
       for (int i=min;i>=1;i--)
       {
           if(num%i==0 && den%i==0) return i;
       }
       return min;
   }
    public static class  Fraction
    {
        int num;
        int den;


        public Fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplify();

        }
        public void simplify ()
        {
            int hcf=gcd(num,den);
            num/=hcf;
            den/=hcf;
        }



    }
    public static void main(String[] args) {
        Fraction f1= new Fraction(7,3);
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2= new Fraction(3,7);
        Fraction f3=add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        Fraction f4=sub(f1,f2);
        System.out.println(f4.num+"/"+f4.den);
        Fraction f5=multiply(f1,f2);
        System.out.println(f5.num+"/"+f5.den);
        Fraction f6=divide(f1,f2);
        System.out.println(f6.num+"/"+f6.den);

    }
}
