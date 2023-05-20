//Write a JAVA program Illustrating Multiple catch-clauses

public class Exercise7b {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}
