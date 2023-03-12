import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class Main {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hey");
        list.add("Hello");//List can have dublicate values
        list.add("yop");
        list.add("Hello");
        list.set(1, "New thing"); //with list you can set things based on id
        System.out.println(list); //List also keeps everything in the same order as they were made in.
        System.out.println(list.get(0)); //with list you can get things by id number, data is mostly used based on id number


        HashSet<String> set = new HashSet<>();
        set.add("Hey");
        set.add("Hello");
        set.add("yop");
        set.add("Hello"); //Set can not have dublicate values
        System.out.println(set);//Set does not care about order, thinsg come out as they please
        System.out.println(set.contains("Hey")); //Set has the ability to look for items, but not with id number
        set.clear();//Set has it's own command for clearing the whole set

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("First", "Hey");
        map.put("Second", "Hello");// Map is made out of key/value sets
        map.put("Third", "Yop");
        map.put("Fourth", "Hello");// map can include same values but not same keys
        System.out.println(map);
        for (String i : map.keySet()) { //You can find things in map basen on key
            System.out.println(i);
            }
        for (String i : map.values()) { //or based on the value
            System.out.println(i);
            }
    } 
}
