public class numberspyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int spaces=(n-i);
            for(int j=1;j<=spaces;j++){
              System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
