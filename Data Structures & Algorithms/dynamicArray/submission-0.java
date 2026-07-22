class DynamicArray {
    Integer[] array;
    int capacity;
    public DynamicArray(int capacity) {
        array = new Integer[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        int index = getSize() ;
        if(index + 1 > getCapacity())
            resize();
        set(index , n);
    }
    public int popback() {
        int val = array[getSize() -1 ];
        array[getSize() -1 ] = null;
        return val ;
    }

    private void resize() {
        this.capacity = this.capacity *2;
        array = Arrays.copyOf(array,capacity);
    }

    public int getSize() {
        for(int i = 0; i < array.length; i++){
            if(array[i] == null)
                return i ;
        }
        return array.length ;
    }

    public int getCapacity() {
        return capacity;
    }
}
