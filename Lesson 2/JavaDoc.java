
/**
 * @author e.x. Jeremy Xie <jeremy.xie@student.tdsb.on.ca> (author name and email)
 * @version e.x. 1.6 (current version number of the program)
 * @since e.x 1.2 (the version of the package this class was first added to)
 */

public class JavaDoc{
     /**
     * Function returns a doubled variable
     * @param Var1 var1 should be an integer (what should be inputted)
     * @return tripled integer (what the function will return)
     */

    public static int getTripled(int Var1) {
        return Var1 * 3;
    }

    public static void main(String[] args) {
        System.out.println(getTripled(2)); //Returns 6
    }
}