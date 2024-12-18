public class Box {
    int height;

    public Box(int height) {
        this.height = height;
    }

    public static void modifyBox(Box b) {
        b.height += 10;
    }

    public static void main(String[] args) {
        Box myBox = new Box(20);
        System.out.println("Height before modifyBox: " + myBox.height);
        modifyBox(myBox);
        System.out.println("Height after modifyBox: " + myBox.height);
    }
}
