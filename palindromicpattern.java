public class palindromicpattern {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<=n;i++){
            int spaces=(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    
}
