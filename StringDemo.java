import java.util.Arrays;
public class StringDemo {
        public static void main(String[] args)  {
                System.out.println();
                System.out.println("====== String Methods =====");
                System.out.println();

                String s = " Hello ";
                System.out.println("s.length() : " + s.length());
                System.out.println("s.contains(\"He\") : " + s.contains("He"));
                System.out.println("s.isEmpty() : " + s.isEmpty());
                System.out.println("s.toUpperCase() : " + s.toUpperCase());
                System.out.println("s.substring(0,3) : " + s.substring(0,3));
                System.out.println("Arrays.toString(s.split(\"e\"))" + Arrays.toString(s.split("e")));
                System.out.println(Arrays.toString(s.getBytes()));
                System.out.println("s.charAt(1) : "+s.charAt(1));
                System.out.println("s.substring(0,3) : " + s.substring(0,3));
                System.out.println();
                System.out.println("====String Comparison====");
                System.out.println();
                String s2 = " Hello ";
                System.out.println("s=s2 : "+ (s == s2));
                String s3 = new String(" Hello ");
                System.out.println("s = s3 : " + (s== s3));
                System.out.println("s.equals(s3) : " + s.equals(s3));
                System.out.println("s = s3.intern() : " + (s = s3.intern()));
                String firstname = "Amar";
                String firstname2 = "amar";
                System.out.println("firstname.equals(firstname2) : " + firstname.equals(firstname2));
                System.out.println("firstname.equalsIgnoreCase(firstname2) : " + firstname.equalsIgnoreCase(firstname2));


        }
}
