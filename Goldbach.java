import java.util.*;
public class Goldbach
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Give me a number.");
        int x = sc.nextInt();
        ArrayList <Integer> theList = new ArrayList<Integer>();
        theList = findprime(x);
        int a = 0; int b = 0;
        for(int i = 0;i<theList.size();i++){
            a = theList.get(i);
            for(int o = 0; o<theList.size(); o++){
                if(theList.get(o) == x - a){
                    b = theList.get(o);
                }
            }
            if( a+b == x){
                System.out.println(a + " + " + b + " = " + x );
                break;
            }
        }
        
    
    
    }
    
    public static ArrayList<Integer> findprime(int n){
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
      
       return mylist;
    }
}
