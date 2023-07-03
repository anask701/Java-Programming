package Java.Lecture8_Exercise;


public class Lec8_Q2 {

    public static void sumOfOddNumbers() {
        int n = 11;
        int sum = 0;
        
        for(int i=1; i<=n; i++){
            
            if(i%2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
        return; 
    }




    public static void main(String[] args) {
        sumOfOddNumbers();
        
        
        
    }
}
