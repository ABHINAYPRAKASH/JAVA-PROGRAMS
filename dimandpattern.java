public class dimandpattern {
    public static void main(String[] args) {
        int n=4;
        //upper part
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int a=2*i-1;
            for(int k=1;k<=a;k++){
                System.out.print("*");
            }
           
           
            System.out.println();
        }
    }
    
}
