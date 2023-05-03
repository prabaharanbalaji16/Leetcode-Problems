class MyHashSet {

    boolean[] arr;
    int size = 1000001;
    public MyHashSet() {
        arr = new boolean[size];
    }
    
    public void add(int key) {
        arr[key] = true;
    }
    
    public void remove(int key) {
        arr[key]=false;
    }
    
    public boolean contains(int key) {
        return arr[key];
    }
}

