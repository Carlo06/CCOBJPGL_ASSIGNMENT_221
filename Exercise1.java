
public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iWillWin = true;

    public static void main(String[] args) throws Exception {
        // Agreement
        // Precondition

        assert iwillNotCheat == false : "nandaya kasi ako ";

        enterCompetition();

        assert iWillWin == true : " kasi nandaya ako";
    }

    static void enterCompetition() {
        iWillWin = true;
    }
}
