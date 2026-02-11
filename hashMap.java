import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>(); // declaring a hashmap of name map
        map.put("china",100);
          map.put("india",120);
           map.put("pakistan",200);
           if(map.containsKey("china")){ //map.containsKey check key is present in hashmap or not 
            System.out.println("key existed");
           }else System.out.println("key does not  exist");

         //  System.out.println(map); // print value and key both
         //   System.out.println(map.get("china"));// print the value of the key

           for(Map.Entry<String , Integer> e : map.entrySet()){
            //System.out.println(e);//print key and its value
            //System.out.println(e.getKey());//print key
            //System.out.println(e.getValue());//print value
           }
            
           Set<String> keys = map.keySet();
           for ( String key : keys){
            System.out.println(key);
           //  System.out.println(map.get(key));
           }
           map.remove("china");//remove a set of key and value 
           System.out.println(map);
    }
}
