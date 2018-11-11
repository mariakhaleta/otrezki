class FastHashMap {
    int HEAD_NUM;
    int MASK;
    int[] head;
    int[] next;
    int[] keys;
    int[] values;
    int cnt = 1;

    FastHashMap(int degree, int maxSize) {
        HEAD_NUM = 1 << degree;
        MASK = HEAD_NUM - 1;
        head = new int [HEAD_NUM];
        next = new int [maxSize + 1];
        keys = new int [maxSize + 1];
        values = new int [maxSize + 1];
    }

    public FastHashMap() {

    }

    void put(int x, int y) {
        int h = index(x);
        for (int i = head[h]; i != 0; i = next[i])
        if (keys[i] == x) {
        values[i] = y;
        return;
     }
        next[cnt] = head[h];
        keys[cnt] = x;
        values[cnt] = y;
        head[h] = cnt++;
    }

    int get(int x) {
        int h = index(x);
        for (int i = head[h]; i != 0; i = next[i])
        if (keys[i] == x)
        return values[i];
        throw new RuntimeException("No such key!");
    }
    boolean containsKey(int x) {
        int h = index(x);
        for (int i = head[h]; i != 0; i = next[i])
        if (keys[i] == x)
            return true;
              return false;
       }
           int index(int x) {
             return Math.abs((x >> 15) ^ x) & MASK;
           }
  }