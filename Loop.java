public class Loop {
        public static void main(String[] args) {
                int i = 0;
                while( i < 10) {
                        i++;
                        System.out.print(i*i + "  ");
                       // i++;
                }
                System.out.println();
                int counter = 0;
                do {
                        counter++;
                        System.out.print(counter + "  ");
                }
                while(counter <10);
                System.out.println();
                for(int j = 0 ; j < 10 ; j++) {
                        System.out.print(j+1+"  ");
                }
        } 

}
