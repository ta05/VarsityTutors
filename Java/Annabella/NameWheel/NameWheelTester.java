public class NameWheelTester {
    public static void main(String args[]) {
        NameWheel wof = new NameWheel(3);

        wof.add("B");
        wof.add("T");
        wof.add("D");
        wof.add("Z");
        

        System.out.println(wof+"\n");

        wof.remove(0, 2);

        System.out.println(wof+"\n");

        wof.add("E");
        wof.add("R");
        wof.add("K");
        wof.add("G");

        System.out.println(wof+"\n");

        wof.rotateClockwise();

        System.out.println(wof+"\n");

        wof.rotateCounterClockwise();

        System.out.println(wof+"\n");

    }
}
