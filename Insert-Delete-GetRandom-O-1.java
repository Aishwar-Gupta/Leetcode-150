// Implement the RandomizedSet class:

//     RandomizedSet() Initializes the RandomizedSet object.
//     bool insert(int val) Inserts an item val into the set if not present. 
//     Returns true if the item was not present, false otherwise.
//     bool remove(int val) Removes an item val from the set if present. 
//     Returns true if the item was present, false otherwise.
//     int getRandom() Returns a random element from the current set of 
//     elements (it's guaranteed that at least one element exists when this 
//     method is called). Each element must have the same probability of 
//     being returned.

// You must implement the functions of the class such that each function 
// works in average O(1) time complexity.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet
{
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet()
    {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val)
    {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    public boolean remove(int val)
    {
        if(!map.containsKey(val)) return false;
        int idx = map.get(val);
        list.set(idx, list.get(list.size()-1));
        map.put(list.get(idx), idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom()
    {
        Random rand = new Random();
        int random = rand.nextInt(list.size());
        return list.get(random);
    }
}