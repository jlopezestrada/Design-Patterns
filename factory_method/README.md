## Factory Method Pattern

The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Objetive

The Factory Method pattern is used when there's a need to delegate the responsibility of instantiating a class to factory methods in subclasses. 
This enables extending application's code without affecting the client code.

### Implementation

To implement the Factory Method pattern, we typically follow these steps:

1. **Product Interface**: Interface for the type of objects the factory method will create. Defines the common interface for products.

2. **Concrete Product**: Classes that implement the Product interface.

3. **Creator**: Abstract class that declares the factory method, which returns an object of the Product type.

4. **Concrete Creator**: Subclass that implements the factory method to return an instance of a Concrete Product.