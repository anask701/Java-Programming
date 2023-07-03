package Java.Lecture5_Patterns;

public class Patterns {
    public static void main(String[] args) {



        // Rectangle

        // for(int i=1; i<=4; i++){
            
        //     for(int j=1; j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Hollow rectangle
        int n = 10;
        int m = 10;
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                // cell -> (i,j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            

        }
















        
    }
}
