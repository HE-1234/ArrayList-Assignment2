import java.util.*;

public class findPrime
{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Give me a number.");
        int n = sc.nextInt();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            mylist.add(i);
        }
       

      
       for(int p = 2; p <n; p++){
           for(int i = mylist.indexOf(p)+1; i < mylist.size();i++){
               if(mylist.get(i) % p == 0){
                   mylist.remove(i);
                }
           }
       }
      
        for(int i: mylist){
            System.out.print(i);
            System.out.print(" ");
        }
        
    
    }
}
