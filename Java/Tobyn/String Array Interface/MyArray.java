public class MyArray {
    private String[] head;

    public MyArray() {
        head = null;
    }

    public MyArray(String[] str) {
        if (str == null)
            head = null;
        else {
            head = new String[str.length];
            for (int i = 0; i < str.length; i++)
                head[i] = str[i];
        }
    }
    
    public int size() {
        return head == null ? 0 : head.length;
    }

    public String toString() {
        return size() == 0 ? "[]" : "[" + String.join(", ", head) + "]";
    }

    public void add(String item) {
        String[] copy = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
            copy[i] = head[i];
        }
        copy[copy.length - 1] = item;
        head = copy;
    }

    public String get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return head[i];
    }
}
