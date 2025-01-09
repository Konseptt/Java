public class StaticNonStaticDemo {
    // Static members
    private static int staticVar = 10;
    
    // Non-static members
    private int nonStaticVar = 20;
    
    // Static method - can only access static members
    public static void staticMethod() {
        System.out.println("Static method:");
        System.out.println("Can access staticVar: " + staticVar);
    }
    
    // Non-static method - can access both static and non-static members
    public void nonStaticMethod() {
        System.out.println("Non-static method:");
        System.out.println("Can access staticVar: " + staticVar);
        System.out.println("Can access nonStaticVar: " + nonStaticVar);
    }
    
    public static void main(String[] args) {
        // Call static method - can be called without creating object
        staticMethod();
        
        // Create object to call non-static method
        StaticNonStaticDemo demo = new StaticNonStaticDemo();
        demo.nonStaticMethod();
    }
}
