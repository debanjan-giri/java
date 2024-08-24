
// encapsulation

// Data Hiding: 
// Encapsulation hide internal state of an obj from external
// access, so its preventing direct modification by outsider

// Abstraction: 
// Encapsulation hide implementation details of a class and 
// exposing only essential features through public interface.

// Modularity: 
// encapsulating related data and behavior into single unit

class Person {
    // Private data members (encapsulated)
    private String name;

    // Public methods to access and modify the private data

    // (getters)
    public String getName() {
        return name;
    }

    // (setters)
    public void setName(String name) {
        this.name = name;
    }
}
