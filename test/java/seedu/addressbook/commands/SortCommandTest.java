package seedu.addressbook.commands;

import static org.junit.Assert.*;
import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.util.SortedPersons;
import seedu.addressbook.util.TypicalPersonsVariedCase;


/**
 * Run tests for SortCommand.
 */
public class SortCommandTest {

    private final AddressBook typicalVariedCaseAddressBook = new TypicalPersonsVariedCase().getTypicalAddressBook();
    private final AddressBook sortedAddressBook = new SortedPersons().getSortedAddressBook();

    @Test
    public void execute_sortOnTypicalPersonsVariedCase() {
        typicalVariedCaseAddressBook.sort();
        assertEquals(typicalVariedCaseAddressBook.getAllPersons().immutableListView(),
                sortedAddressBook.getAllPersons().immutableListView());
    }
}