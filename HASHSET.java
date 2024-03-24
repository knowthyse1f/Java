//in hashset all element are unique property 

//Insert /add -O(1)
//Search /Contains - O(1)
//Delete /Remove - O(1)

import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {
      // creating 
        HashSet<Integer> set= new HashSet<Integer>(); 
       
      //Insert 
      set.add(4596);//list.add(element)
      set.add(143);
      set.add(107);
      set.add(4596);

      System.out.println(set);

      //Search - contains

      if(set.contains(143)){
        System.out.println("Set Contains 143");
      }

      if(!set.contains(143)){
        System.out.println("Set does not Contains 143");
      }

      //Delete 
      set.remove(143);
      if(set.contains(143)){
        System.out.println("Set Contains 143");
      }

      if(!set.contains(143)){
        System.out.println("Set does not Contains 143 we delete it ");
      }

      //set size
      System.out.println(set.size());
      
      //iterator 
      Iterator it=set.iterator();

      //hasNext; next

      HashSet<String> set1=new HashSet<>();

      set1.add("USA");
      set1.add("Canada");
      set1.add("France");
      set1.add("Japan");
      set1.add("Australia");

      Iterator it1=set1.iterator();
      while(it1.hasNext()){
        System.out.println(it1.next());
      }


    }
}
