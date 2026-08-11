/*
 * Problem: LRU Cache
 * Problem ID: 146
 * Difficulty: Medium
 * Language: Java
 * Runtime: 49 ms
 * Memory: 129.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    HashMap<Integer,Node> mp =new HashMap<>();
    int size;


    public LRUCache(int capacity) {
        size=capacity;
        head.next=tail;
        tail.prev=head;
    }

    private void addNode(Node newnode){
        Node oldnode=head.next;
        //connection
        head.next=newnode;
        oldnode.prev=newnode;
        newnode.next=oldnode;
        newnode.prev=head;
        
    }
    private void deleteNode(Node oldnode){
        Node oldprev=oldnode.prev;
        Node oldnext=oldnode.next;
        oldprev.next=oldnext;
        oldnext.prev=oldprev;
    }
    
    public int get(int key) {
        // if(!mp.containsKey(key)) return -1;
        
        if(mp.containsKey(key)){
            //key haio to uski node ki value retunr kr do
            Node curr=mp.get(key);
            int ans=curr.val;
            mp.remove(key);
            deleteNode(curr);
            
            // delete krne ke bad most recent use m add kr do or map value store
            addNode(curr);
            mp.put(key,curr);
            return ans;

        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){//same data key ko reinsert krte hai by delete that node
            Node currentNode=mp.get(key);
            mp.remove(key);
            deleteNode(currentNode);
        }
        if(mp.size()==size){
            mp.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        //add new node in ddl
        Node newNode=new Node(key,value);//
        addNode(newNode);
        mp.put(key,newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */