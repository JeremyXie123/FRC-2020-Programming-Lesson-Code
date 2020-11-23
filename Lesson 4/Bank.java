public class Bank {
    private int allowance;

    public int getAllowance() {
        return allowance;
    }

    public final void setAllowance(int value) {
        if(value>=0) {
            this.allowance = value;
        }
        else {
            this.allowance = 0;
        }
    }   
}
