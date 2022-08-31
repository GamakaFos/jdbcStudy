import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckMassegeFailTest {

    @Test
    void checkMassageFail() {
        CheckMassegeFail checkMassegeFail = new CheckMassegeFail();

        fail(checkMassegeFail.justCheckIt(-123));
    }

    @Test
    void checkMassageExecute() {
        CheckMassegeFail checkMassegeFail = new CheckMassegeFail();

        fail(checkMassegeFail.justCheckIt(5));
    }
}