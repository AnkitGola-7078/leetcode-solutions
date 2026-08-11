/*
 * Problem: LRU Cache
 * Problem ID: 146
 * Difficulty: Medium
 * Language: Java
 * Runtime: 49 ms
 * Memory: 129.5 MB
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
     HashMap<Integer,Node> mp=new HashMap<>();
     Node head=new Node(-1,-1);
     Node tail=new Node(-1,-1);
     int size;


    public LRUCache(int capacity) {
        size=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node curr=mp.get(key);
            int ans=curr.val;
            mp.remove(curr.key);
            deletenode(curr);
            addnode(curr);
            mp.put(key,curr);
            return ans;
        }
        return -1;
    }
    private void addnode(Node newnode){
        Node oldnode=head.next;//store tail in oldnode 

        head.next=newnode;
        oldnode.prev=newnode;
        newnode.next=oldnode;
        newnode.prev=head;
    }
    private void deletenode(Node oldnode){
        Node oldprev=oldnode.prev;
        Node oldnext=oldnode.next;
      
        oldprev.next=oldnext;
        oldnext.prev=oldprev;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node curr=mp.get(key);
            mp.remove(curr.key);
            deletenode(curr);
        }
        if(mp.size()==size){
            mp.remove(tail.prev.key);
            deletenode(tail.prev);
        }
        Node newnode=new Node(key,value);
        addnode(newnode);
        mp.put(key,newnode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */