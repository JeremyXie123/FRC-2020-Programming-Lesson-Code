enum AdvDirection {
    // enum fields
    EAST(0), WEST(180), NORTH(90), SOUTH(270);
 
    // constructor
    private AdvDirection(final int angle) {
        this.angle = angle;
    }
 
    // internal state
    private int angle;
 
    public int getAngle() {
        return angle;
    }
}

public class EnumConstructDemo {
    public static void main(String[] args) {
        AdvDirection north = AdvDirection.NORTH;
        System.out.println( north );                      //NORTH
        System.out.println( north.getAngle() );           //90
        System.out.println( AdvDirection.NORTH.getAngle() ); //90
    }
}

