import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.FreelancerVacationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerVacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/vacation-data.csv", numLinesToSkip = 1)
    public void calculateVacationMonths(int income, int expenses, int threshold, int expectedVacationMonths) {
        FreelancerVacationService service = new FreelancerVacationService();
        int actualVacationMonths = service.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}
