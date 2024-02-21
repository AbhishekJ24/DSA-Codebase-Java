/* The approach is to again and again update right while it is greater than left and then return the value of right
 * when it becomes less than or equal to right
 * The updation of that takes place like this:
 * right = right & (right - 1)
 * 
 */

public class AndOfNumbersInARange{
    public static int rangeBitwiseAnd(int left, int right) {
        while(right>left){
            right=right&(right-1);
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(1,2147483647));
    }
}