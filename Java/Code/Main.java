public class Main{
    public static class Frac{
        private int num, den;

        // Default constructor
        public Frac(){
            num = 1;
            den = 1;
        }

        // Paramatized constructor
        public Frac(int n, int d){
            num = n;
            if(d == 0){
                den = 1;
                System.out.println("Denom cannot be 0, Resetting to 1.");
            }
            else
                den = d;
        }

        // Setters and Getters
        public void setNum(int n){
            num = n;
        }

        public void setDen(int d){
            if(d == 0){
                den = 1;
                System.out.println("Denom cannot be 0, Resetting to 1.");
            }
            else
                den = d;
        }

        public int getNum(){
            return num;
        }

        public int getDen(){
            return den;
        }
        
        // Mathmatical Methods

        public Frac mult(Frac f2){
            Frac temp = new Frac();
            temp.num = this.num * f2.num;
            temp.den = this.den * f2.den;
            return temp;
        }

        public Frac div(Frac f2){
            Frac temp = new Frac();
            temp.num = this.num * f2.den;
            temp.den = this.den * f2.num;
            return temp;
        }

        public Frac add(Frac f2){
            Frac temp = new Frac();
            temp.num = this.num * f2.den + f2.num * this.den;
            temp.den = this.den * f2.den;
            return temp;
        }

        public Frac sub(Frac f2){
            Frac temp = new Frac();
            temp.num = this.num * f2.den - f2.num * this.den;
            temp.den = this.den * f2.den;
            return temp;
        }

        // Print method
        public String toPrint(){
            String temp = this.num + "/" + this.den;
            return temp;
        }

    }

    public static void main(String[] args){
        Frac f1 = new Frac();
        Frac f2 = new Frac(1,2);
        Frac f3;
        String s1;
        f1.setNum(5);
        f1.setDen(9);
        s1 = f1.toPrint();
        System.out.println(s1);
        s1 = f2.toPrint();
        System.out.println(s1);

        f3 = f1.mult(f2);
        s1 = f3.toPrint();
        System.out.println(s1);

        f3 = f1.div(f2);
        s1 = f3.toPrint();
        System.out.println(s1);

        f3 = f1.add(f2);
        s1 = f3.toPrint();
        System.out.println(s1);

        f3 = f1.sub(f2);
        s1 = f3.toPrint();
        System.out.println(s1);
    }
}