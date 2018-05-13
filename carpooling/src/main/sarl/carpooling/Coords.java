package carpooling;

import com.google.common.base.Objects;

class Coords {
    private double x;
    private double y;

    public boolean equals(Object o) {
        Coords c = (Coords) o;
        return c.x == x && c.y == y;
    }

    public Coords(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
    	return Objects.hashCode(x, y);
    }
    
    public double getX()
    {
    	return x;
    }
    
    public double getY()
    {
    	return y;
    }
}
