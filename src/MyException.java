public class MyException extends Exception {
    public MyException() {
        System.out.println("Данного ИНН нет в базе данных");
    }
}
