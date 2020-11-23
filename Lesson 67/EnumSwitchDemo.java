enum Direction {
    // enum fields
    EAST, WEST, NORTH, SOUTH;
}

public class EnumSwitchDemo {
    public static void main(String[] args) {
        Direction dir = Direction.EAST;
        switch(dir) {
            case EAST:
                System.out.println("East");
            break;
        }
    }
}
