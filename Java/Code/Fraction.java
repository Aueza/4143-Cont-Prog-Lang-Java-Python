import java.util.*;

public class main {

    public static class Frac {
    
        private int num;
        private int den;
        	
        // default constructor  1/1
        public Frac()
        {
        	this.num = 1;
        	this.den = 1;
        }
        	
        // non-default constructor
        public Frac(int n, int d )
        {
            this.num = n;
            if (d == 0)
                System.out.println("Denominator cannot be zero.  Reset to 1.");
            else
                this.den = d;
      	}
        	
        // mutators / setters
        
        public void setNumerator (int n)
        {
            this.num = n;
        }
        public void setDenominator (int d)
        {
            this.den = d;
        }
        // accessors / getters
        public int getNumerator()
        {
            return this.num;
        }
        public int getDenominator()
        {
            return this.den;
        }
        
        // Mathematical operators
        
        
        public Frac mult(Frac f)
        {
            Frac temp = new Frac();
            temp.num = this.num * f.num;
            temp.den = this.den * f.den;
            return temp;
        }
        
        public Frac divide(Frac f)
        {
            Frac temp = new Frac();
            temp.num = this.num * f.den;
            temp.den = this.den * f.num;
            return temp;
        }
        
        public Frac add(Frac f)
        {
            Frac temp = new Frac();
            temp.num = this.num * f.den + f.num * this.den;
            temp.den = this.den * f.den; 
            return temp;
        }
        
        public Frac sub(Frac f)
        {
            Frac temp = new Frac();
            temp.num = this.num * f.den - f.num * this.den;
            temp.den = this.den * f.den; 
            return temp;
        }
        
      	
        public String toPrint()
        {
        	String s = this.num + "/" + this.den;
        	return s;
        }
        	
    }

	public static void main(String[] args)
	{
		Frac f1 = new Frac();
		Frac f2 = new Frac(1, 2);
		Frac f3, f4, f5, f6;
		String s1, s2, s3, s4, s5, s6;
		f1.setNumerator(5);
		f1.setDenominator(9);
		s1 = f1.toPrint(); 
		System.out.println(s1); 
		s2 = f2.toPrint();
		System.out.println(s2); 
		f3 = f1.mult(f2);
		s3 = f3.toPrint();
		System.out.println(s1 + " * " + s2 + " = " + s3);
		f4 = f1.divide(f2);
		s4 = f4.toPrint();
		System.out.println(s1 + " / " + s2 + " = " + s4);
		f5 = f1.add(f2);
		s5 = f5.toPrint();
		System.out.println(s1 + " + " + s2 + " = " + s5);
		f6 = f1.sub(f2);
		s6 = f6.toPrint();
		System.out.println(s1 + " - " + s2 + " = " + s6);

	}
}
