class DynamicArray {
    ArrayList<Integer> list;
    int capacity = 0;
    // capacity > 0
    public DynamicArray(int capacity) {
        list = new ArrayList<Integer>();
        this.capacity = capacity;
    }

    // get element at index (i) 
    public int get(int i) {
        return list.get(i);
    }

    public void set(int i, int n) {
        list.set(i, n);
    }

    public void pushback(int n) {
        if (list.size() >= capacity) { 
            resize();
        }
        System.out.println("pushback " + n);
        list.add(n);
        print();
    }

    public int popback() {
        int indexOfLast = list.size() - 1; 
        int removed = get(indexOfLast); 
        list.remove(indexOfLast);
        System.out.println("Popback " + removed);
        print();
        return removed;
        
    }

    private void resize() {
        System.out.println("resize");
        capacity = capacity * 2; 

    }

    public int getSize() {
        return this.list.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void print() { 
        for (int i = 0; i < list.size(); i++) { 
            System.out.println(list.get(i));
        }

    }
}
