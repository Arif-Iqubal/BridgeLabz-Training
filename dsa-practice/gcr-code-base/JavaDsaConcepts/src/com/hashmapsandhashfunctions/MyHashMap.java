package com.hashmapsandhashfunctions;

public class MyHashMap<K, V> {

    // Node class
    private class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private Object[] buckets;   // Use Object array

    // Constructor
    public MyHashMap() {
        buckets = new Object[capacity];
    }

    /* ================= PUT ================= */

    public void put(K key, V value) {
        int index = getIndex(key);

        Node head = (Node) buckets[index]; // Cast Object → Node

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = (Node) buckets[index];
        buckets[index] = newNode;
    }

    /* ================= GET ================= */

    public V get(K key) {
        int index = getIndex(key);

        Node head = (Node) buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    /* ================= REMOVE ================= */

    public void remove(K key) {
        int index = getIndex(key);

        Node head = (Node) buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    /* ================= HASH FUNCTION ================= */

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    /* ================= TEST ================= */

    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(1, "Apple");
        map.put(11, "Banana"); // collision
        map.put(2, "Mango");

        System.out.println(map.get(1));   // Apple
        System.out.println(map.get(11));  // Banana

        map.remove(1);
        System.out.println(map.get(1));   // null
    }
}

