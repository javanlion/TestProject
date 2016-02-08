public class TestProjectException extends Exception {

    public TestProjectException(IllegalArgumentException e) {
        super(e);
    }
}
