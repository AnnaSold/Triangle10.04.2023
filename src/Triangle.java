import java.util.ArrayList;

public class Triangle {
        double ab;
        double bc;
        double ac;

        public Triangle(double ab, double bc, double ac) {
            this.ab = ab;
            this.bc = bc;
            this.ac = ac;
        }

    @Override
    public String toString() {
        return "Triangle{" +
                "ab=" + ab +
                ", bc=" + bc +
                ", ac=" + ac +
                '}';
    }

    public  double calculateAreaFigure(){
            double trP = ab + bc + ac;

            double p = trP/2;
            double trArea =  Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
            //System.out.println(trArea);
            return trArea;
        }
        public static boolean compareStoronTriangle(double a, double b, double c){
            if ((a+b > c) && (a+c> b) && (b+c>a)) return true;
            else return false;
        }


    }

