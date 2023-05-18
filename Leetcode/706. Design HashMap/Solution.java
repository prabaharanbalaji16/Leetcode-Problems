class MyHashMap {
    int size=0,multi=0;
    int[] data;
    public MyHashMap() {
        this.size = 179997;
        this.multi = 29997;
        this.data = new int[this.size];
    }

    private int hash(int key)
    {
        int hashkey =  (key+multi)%size;
        return hashkey;
    }
    
    public void put(int key, int value) {
        int h = hash(key);
        data[h] = value+1;
    }
    
    public int get(int key) {
        int getValue = data[hash(key)];
        return getValue!=-1 ?getValue-1: -1;
    }
    
    public void remove(int key) {
       data[hash(key)] =-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */