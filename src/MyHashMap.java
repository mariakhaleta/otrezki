class MyHashMap<K,V> {

    int key;
    int value;
    MyHashMap next;


    public MyHashMap(int key, int value) {
    }

    public MyHashMap() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public MyHashMap copy(MyHashMap i, MyHashMap j){

        i.key = j.key;
        i.value = j.value;
        return j;
    }
}
