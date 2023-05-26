## Singleton Pattern

The Singleton pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

### Objetive

The Singleton pattern is used when we want to restrict the instantiation of a class to a single object, ensuring that there is only one instance of the class.

### Implementation

To implement the Singleton pattern, we typically follow these steps:

1. **Private Constructor**: The Singleton class has a private constructor to prevent direct instantiation from outside the class.

2. **Private Instance**: The Singleton class maintains a private static instance variable that holds the single instance of the class.

3. **Access Method**: The Singleton class provides a public static method, often named `getInstance()`, that returns the single instance of the class. This method first checks if an instance already exists. If it does, it returns the existing instance; otherwise, it creates a new instance and returns it.