public class Overload {
    public int getNum() {
        return 0;
    }
    public int getNum(int num) {
        return num;
    }
    public static void main(String[] args) {
        Overload obj1 = new Overload();
        System.out.println(obj1.getNum(1));
        System.out.println(obj1.getNum(8));
    }
}
