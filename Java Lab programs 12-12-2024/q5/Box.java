/**
 * Java Lab programs 12/12/2024
 * Q5. Write a Java program to show that when an object is passed to a method, the reference is passed by value:
 * • Create a Box class with an integer attribute height.
 * • Write a method modifyBox(Box b) that changes the height of the passed Box object.
 * • Print the height before and after the method call.
 */
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
