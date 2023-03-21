package seedu.ultron.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.ultron.model.Model;
import seedu.ultron.model.Ultron;

/**
 * Clears the openings list.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Openings list has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setUltron(new Ultron());
        // model.setOpeningsList(new OpeningsList());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}