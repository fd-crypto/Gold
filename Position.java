public class Position {
    private double X;
    private double Y;

    public Position(int X, int Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void move(double dx, double dy) {
        X =+ dx;
        Y =+ dy;
    }

    public double dist(Position p){
        return (Math.sqrt(Math.pow(p.getX() - this.getX(),2) + Math.pow(p.getY() - this.getY(),2) ));
    }

}
