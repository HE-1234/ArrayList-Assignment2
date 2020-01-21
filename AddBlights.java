import java.util.*;
public class AddBlights
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first number?");
        int x1 = sc.nextInt();
        System.out.println("What is the second number?");
        int x2 = sc.nextInt();
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        while(x1>0){
            int temp = x1 % 10;
            list1.add(0,temp);
            x1 = x1/10;
        }
        
        while(x2>0){
            int temp2 = x2 % 10;
            list2.add(0,temp2);
            x2 = x2/10;
        }
        
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4 = Addlist(list1,list2);
        
        for(int i :list4){
        System.out.println(i);
        }
        
    
    }
    
    public static ArrayList<Integer> Addlist (ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        int len = 0;
        int temp = 0;
        int re = 0;
        int plusnum = 0;
        if(l1.size()>l2.size()){
            len = l2.size();
            re = l1.size()-l2.size();
        }else if (l2.size()>l1.size()){
            len = l1.size();
            re = l2.size()-l1.size();
        }else{
            len = l1.size();
        }
        
        for(int i = 1; i <= len; i++){
            temp = l1.get(l1.size()-i) + l2.get(l2.size()-i)+plusnum;
            plusnum = 0;
            if(temp >= 10){
                plusnum = 1;
                temp = temp-10;
            }
            list3.add(0,temp);
        }
       
        if(l1.size()>l2.size()){
            for(int i = 0; i < re; i++){
                list3.add(0,l1.get(i)+plusnum);
            }
        }else if(l2.size()>l1.size()){
            for(int i = 0; i < re; i++){
                list3.add(0,l2.get(i)+plusnum);
            }
        }else if(l1.size() == l2.size() && plusnum > 0){
            list3.add(0,plusnum);
        }   
        
        
        
        return list3;
    }
    
}
