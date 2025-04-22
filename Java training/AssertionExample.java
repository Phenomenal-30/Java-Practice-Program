public class AssertionExample {

    public static void main(String[] args) {
        int age = 8;

        // Assert that age is greater than or equal to 18
        assert age >= 18 : "Age must be 18 or older"; //You have to first compile this code using javac AssertionExample.java
                                                      // then you have to write  java -ea AssertionExample for assertion to work otherwise it will work perfectly  
        System.out.println("Age is: " + age);
    }
}