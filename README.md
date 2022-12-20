# Builder
Yes, this is the code for the Nike class and its Builder inner class.

The Nike class has three fields: name, color, and size. These fields are marked as final, which means that they can only be set once and cannot be changed after the object is created.

The Nike class has a private constructor that takes a Builder object as an argument. This constructor sets the values of the Nike object's fields to the values of the corresponding fields in the Builder object.

The Nike class also has three public getter methods that return the values of the name, color, and size fields.

The Builder class has three fields that correspond to the three fields of the Nike class. It also has three methods, name, color, and size, that allow you to set the corresponding field for the Nike object you are building. Each of these methods returns the Builder object itself, so that you can chain multiple method calls together.

Finally, the Builder class has a build method that creates and returns a new Nike object using the values of the fields in the Builder object.
