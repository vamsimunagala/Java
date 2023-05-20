public class Exercise2d{

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Satya marthandhe");

        sb.deleteCharAt(5);

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == 'l') {
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb); 
    }
}
