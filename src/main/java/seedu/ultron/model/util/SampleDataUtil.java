package seedu.ultron.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.ultron.model.ReadOnlyUltron;
import seedu.ultron.model.Ultron;
import seedu.ultron.model.opening.Company;
import seedu.ultron.model.opening.Date;
import seedu.ultron.model.opening.Email;
import seedu.ultron.model.opening.Opening;
import seedu.ultron.model.opening.Position;
import seedu.ultron.model.opening.Remark;
import seedu.ultron.model.opening.Status;


/**
 * Contains utility methods for populating {@code Ultron} with sample data.
 */
public class SampleDataUtil {
    public static Opening[] getSampleOpenings() {
        return new Opening[] {
            new Opening(new Position("Software Engineer"), new Company("Google"), new Email("johnDoe@google.com"),
                    new Status("FOUND"), null, getDateSet(new Date("Interview", "2023-11-21"))),
            new Opening(new Position("Software Developer"), new Company("Shopee"), new Email("alice@shopee.com"),
                    new Status("APPLIED"), new Remark("Dream Company"),
                    getDateSet(new Date("Interview", "2023-10-15"))),
            new Opening(new Position("UX Designer"), new Company("Grab"), new Email("tenz@grab.com"),
                    new Status("FOUND"), null, getDateSet(new Date("Interview", "2023-04-12"),
                        new Date("Practical Assessment", "2023-05-11"))),
            new Opening(new Position("Software Engineer"), new Company("Gojek"), new Email("sleepy@gojek.com"),
                    new Status("FOUND"), null, getDateSet())
        };
    }

    public static ReadOnlyUltron getSampleUltron() {
        Ultron sampleUltron = new Ultron();
        for (Opening sampleOpening : getSampleOpenings()) {
            sampleUltron.addOpening(sampleOpening);
        }
        return sampleUltron;
    }


    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Date> getDateSet(Date... dates) {
        return Arrays.stream(dates)
                .collect(Collectors.toSet());
    }
}
