package homework2.Task1;

public class InvalidNumberException extends Exception{

    @Override
    public String getMessage() {
        return "Некорректное число";
    }
}
