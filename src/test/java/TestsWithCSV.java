import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsWithCSV {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void CSVTest(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
            assertEquals ( expected, service.calculate(amount, registered));
        }
}
