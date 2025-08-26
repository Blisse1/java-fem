## Streams

- It is a sequence of elements from a data source. from an array, a collection or other input source
- It allows you to perform operations on the data without affecting the original data source
- It contains built-in methods and classes and interfaces that allow you to perform some operations

Data source >> Stream operations >> Output

```java
int[] numbers = {0, 2, 4, 6};

Arrays.stream(numbers)
      .forEach(number -> System.out.println(number + 1));

System.out.println(numbers);
```

```java
// in parallel, multithreaded and without order, and it is not going to be sequential
int[] numbers = {0, 2, 4, 6};

Arrays.stream(numbers).parallel()
      .forEach(number -> System.out.println(number + 1));

System.out.println(numbers);
```

## Stream Operations
## Intermediate
- Perform operation and return resulting stream. Returns the resulting stream after its finished what its doing. And this will enable you to continue
- running even more operations on the resulting stream. So the stream has all data processed. Here is the stream in case
- you wanna do some more processing on it

## Terminal
- Return a result and close the stream. "This is the final operation that can be performed on that stream and the stream is closed"
- 

