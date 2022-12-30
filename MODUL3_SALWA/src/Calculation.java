public class Calculation implements Runnable {
    double radius, side, area;
    double phi = 3.14;

    @Override
    public void run() {
        while (true) {
            System.out.println("=====Program will start in=====");
            for (int i =3 ; i<0 ; i-- ){
                System.out.println("starting will in"+ i);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setSquare(double side) {
        if (side > 0) {
            this.area = side * side;
        } else {
            // YOUR CODE HERE
            // Clue: throw an exception if the value is less than 1
            throw new IllegalArgumentException();
        }
    }

    
    public double getSquare() {
        return area;
    }

    public void setCircle(double radius) {
        if (radius > 0) {
            this.area = phi * radius * radius;
        } else {
            // YOUR CODE HERE
            // Clue: throw an exception if the value is less than 1
            throw new IllegalArgumentException();
        }
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        if (a > 0 && b > 0 && t > 0) {
            this.area = 0.5 * (a + b) * t;
        } else {
            // YOUR CODE HERE
            // Clue: throw an exception if the value is less than 1
            throw new IllegalArgumentException();
        }
    }

    public double getTrapezoid() {
        return area;
    }

}
