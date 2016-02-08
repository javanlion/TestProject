public class TSIChecker {

    public static TSI checkTSI(String value) throws TestProjectException {
        try {
            return TSI.valueOf(value);
        } catch (IllegalArgumentException e) {
            throw new TestProjectException(e);
        }
    }

    public static void main(String[] args) throws TestProjectException {
        System.out.println(checkTSI("SQL_TSI_SECOND"));
        System.out.println(checkTSI("SQL_TSI_HOUR"));
    }

}
