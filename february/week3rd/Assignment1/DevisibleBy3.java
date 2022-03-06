package febweeksecond;

public class DevisibleBy3 {
    public static void main(String[] args) {
        int n = 100;

        for ( int i=0; i<n; i++){
            if(i % 3 == 0)
                System.out.print(i +",");
        }
    }
}
