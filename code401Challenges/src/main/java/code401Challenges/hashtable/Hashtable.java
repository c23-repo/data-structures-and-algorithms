package code401Challenges.hashtable;



public class Hashtable<V> {

    // Instance variables
    // Set to generic for different possible key:value pairs

    private Node<String, V> [] map;
    private final int initialSize = 1024;
    private final int primeValue = 4096;

    //Constructor

    public Hashtable() {

        this.map = new Node[initialSize];
    }

    // Methods

    //Hash the key
    public int hash(String key){
        int hashValue = 0;

        for (int i = 0; i < key.length(); i++){
            hashValue += ( (int) key.charAt(i) + primeValue) * 3;
        }

        return hashValue % map.length;
    }

    // Add the key value to the hash table
    public void add(String key, V value){
        Node <String, V> node = new Node<>(key, value, null);
        int hashKey = hash(key);
        if (this.map[hashKey] != null) {

            Node temp = map[hashKey];
            map[hashKey] = node;
            map[hashKey].setNext(temp);

        } else {

            map[hashKey] = node;
        }
    }

    // Get the value of the key
    public V get(String key){
        int searchKey = hash(key);

        while (this.map[searchKey] != null){

            if (this.map[searchKey].getKey() == key) {

                return this.map[searchKey].getValue();
            }

            this.map[searchKey] = this.map[searchKey].getNext();
        }
        return null;
    }

    // Check the hash table to see if already contains the key
    public boolean contains(String key){

        int containsKey = hash(key);
        boolean contains = false;

        while (this.map[containsKey] != null){
            if (this.map[containsKey].getKey() == key) contains = true;
            this.map[containsKey] = this.map[containsKey].getNext();
        }

        return contains;
    }
}
