import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your level: ");
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

/*
//it will ask to Enter your level of height, then it will make the pattern

Enter your level: 5
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 

*/
