//Constructor Overloading - You can have multiple constructors in the same class, with different parameter lists.

package Constructor;

class Students {
    String name;
    int age;

    // Default constructor
    Students() {
        name = "Unknown";
        age = 0;
    }
    
    Students(int a){
    	System.out.println(a);
    }

    // Parameterized constructor
    Students(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
    public static void main(String[] args) {
        Students s1 = new Students();          // calls default constructor
        Students s2 = new Students(23);
        Students s3 = new Students("Akash", 21); // calls parameterized constructor

        s1.display();
        s2.display();
        s3.display();
    }
    
}
