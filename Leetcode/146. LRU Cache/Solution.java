class Node
{
    int key;
    int val;
    Node prev;
    Node next;

    Node(int key, int val)
    {
        this.key =key;
        this.val = val;
        prev = null;
        next = null;
    }
}
class LRUCache {
    int size;
    Node head;
    Node tail;
    Map<Integer,Node> m;
    public LRUCache(int capacity) {
        size = capacity;
        m = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node newNode)
    {
        Node temp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = temp;
        temp.prev = newNode;
    }

    void removeNode(Node node)
    {
        Node pre = node.prev;
        Node nex = node.next;
        pre.next = nex;
        nex.prev = pre;
    }
    
    public int get(int key) {
        if(!m.containsKey(key))
            return -1;
        Node node = m.get(key);
        removeNode(node);
        addNode(node);
        m.put(key,head.next);
        return head.next.val;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key))
        {
            Node node = m.get(key);
            removeNode(node);
            node.val = value;
            addNode(node);
            m.put(key,head.next);
        }
        else
        {
            if(m.size()==size)
            {
                Node prev = tail.prev;
                removeNode(prev);
                Node temp = new Node(key,value);
                addNode(temp);
                m.remove(prev.key);
                m.put(key,head.next);
            }
            else
            {
                Node temp = new Node(key,value);
                addNode(temp);
                m.put(key,head.next);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */