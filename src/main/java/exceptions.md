## Exceptions

## Handling Exceptions
Error events that disrupt the normal flow of a program
Anything that you try that could possibly throw an exception you catch it in the catch block

## Checked and Unchecked Exceptions

## Checked Exceptions
public boolean createNewFile() throws IOException {}
exceptions that are checked by the compiler

Check exceptions are used when there is a possibility of recovery

## Unchecked Exceptions
these are not checked by the compiler. These are runtime exceptions.
These are used where theres not anything that can be done in the event of the error

## Handling multiple exceptions
You can handle multiple exceptions with a single catch block

catch(FileNotFoundException | InputMismatchException e){
e.printStackTrace();
}

Remember to close your streams especially when dealing with files
