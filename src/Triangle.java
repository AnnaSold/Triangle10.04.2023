public class Triangle {
        double ab;
        double bc;
        double ac;

        public Triangle(double ab, double bc, double ac) {
            this.ab = ab;
            this.bc = bc;
            this.ac = ac;
        }

        public double calculateAreaFigure(){
            double trP = ab + bc + ac;

            double p = trP/2;
            double trArea =  Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
            //System.out.println(trArea);
            return trArea;
        }
    }

