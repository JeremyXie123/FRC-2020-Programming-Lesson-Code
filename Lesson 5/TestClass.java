class Base2 {
    private int allowance;
    
    @Override
    public String toString() {
        return "Current Number: "+this.allowance;
    }

    public void printInfo() {
        System.out.println("print info");
    }

    public void setAllowance(int Num) {
        this.allowance = Num;
    }
}

public class TestClass {
    public static void main(String[] args) {
        Base2 obj = new Base2();
        obj.setAllowance(100);

        System.out.println(obj);
    }
}
