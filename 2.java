import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int i,j;
        for(i=n;i<=n;i--){
            for(j=1;j<=i;j++){
                System.out.print( " * ");
            }
            System.out.println();
        }
    }
}