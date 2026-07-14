public class StringComparisonDemo {

    public static void main(String[] args) {

        // String
        String str = "Java";
        str = str + " Developer";
        System.out.println("String: " + str);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Developer");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Developer");
        System.out.println("StringBuffer: " + sbf);
    }
}
