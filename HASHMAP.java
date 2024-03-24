/*
 * key -> unique 
 * value-> can be same 
 */

 /*
  * Exist -> key -> value update 
  * Not Exist -> New Pair 
  */

  /*
   * .get -> key exist -> value         key doesn't exist->Null
   * .containsKey-> exist-> true        ->doesn't exist-> false
   */
import java.util.*;

public class HASHMAP {
    public static void main(String[] args) {
        //country(key  ),population (value )
        HashMap<String ,Integer> hashmap= new HashMap<>();


        //insertion 
        hashmap.put("Bangladesh",170000000);
        hashmap.put("Pakistan",1010101010);
        hashmap.put("Palestain", 459645960);
        
        //print hashmap
        System.out.println(hashmap);

        //Iterate hashmap
        for(Map.Entry<String,Integer> entry: hashmap.entrySet()){
                String key= entry.getKey();
                Integer value=entry. getValue();
                System.out.println("Key: " + key + ", Value: " + value );
        }

        //another way of iteration 

        Set<String> keys= hashmap.keySet();
        for(String key: keys){
            System.out.println(key+" "+hashmap.get(key));
        }

        //Search 
        if(hashmap.containsKey("SriLanka")){
            System.out.println("key is present in the Hashmap");
        }
        else{
            System.out.println("Key is not Present");
        }

        System.out.println(hashmap.get("Bangladesh"));//key exist
        System.out.println(hashmap.get("SriLanka"));//key doesn't exist


        //remove element
        hashmap.remove("Pakistan");
        System.out.println(hashmap);


    }
}
