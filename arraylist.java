// array 
/*
 * memory continuous 
 * fixed size
 * premitive , object 
 */

//Array List 
/*
 * memory Continuous
 * size fixed
 * only object (add,get, modified,delete,Iterate) 
 * heap  
 */


import java.util.ArrayList;
import java.util.Collections;

 class arraylist{

    int summation(ArrayList<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

    float average(ArrayList<Integer>list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum/list.size();
    }

    int maximum(ArrayList<Integer>list){
        int m=list.get(0);
        for(int i=0;i<list.size();i++){
            if(m<list.get(i))m=list.get(i);
        }
        return m;  
    }

    int minimum(ArrayList<Integer>list){
        int m=list.get(0);
        for(int i=0;i<list.size();i++){
            if(m>list.get(i))m=list.get(i);
        }
        return m; 
    }




    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Boolean>list2=new ArrayList<Boolean>();
        // ArrayList<String>list3=new ArrayList<String>();


        //add element 
        list1.add(4);
        list1.add(5);
        list1.add(9);
        list1.add(6);

        //print 
        System.out.println(list1);


        //get element
       System.out.println(list1.get(0));
       System.out.println(list1.get(1));
       System.out.println(list1.get(2));
       System.out.println(list1.get(3));

       //add element in between

       list1.add(1,1);
       list1.add(3,4);
       list1.add(5,3);

       System.out.println(list1);

       //set element

       list1.set(0,143);

       System.out.println(list1);

       //create Object 
       arraylist sum=new arraylist();

       System.out.println("Summation : "+sum.summation(list1));
        
       System.out.println("Average : "+sum.average(list1));

       System.out.println("Maximum : "+sum.maximum(list1));

       System.out.println("Minimum : "+sum.minimum(list1));


       //remove element 
       list1.remove(0);
       System.out.println(list1);
       list1.remove(0);
       System.out.println(list1);
       list1.remove(2);
       System.out.println(list1);
       list1.remove(2);
       System.out.println(list1);


       //size
       System.out.println(list1.size());

       //sorting 
       Collections.sort(list1);
       System.out.println(list1);
    }
 }

