public class Friends extends MyArray{
    public Friends() {
        super();
    }

    public static void main(String[] args) {
        Friends r = new Friends();
        System.out.println(r);
        r.add("Smith");
        r.add("Jones");
        System.out.println("The name at the 0 position is " + r.get(0));
        r.add("Hamilton");
        System.out.println("The name at the 2 position is " + r.get(2));
        System.out.println(r);
    }
}
