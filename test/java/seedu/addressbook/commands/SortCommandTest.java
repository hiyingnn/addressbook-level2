package seedu.addressbook.commands;

import org.junit.Test;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.util.TypicalPersons;
import seedu.addressbook.util.TypicalPersonsVariedCase;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortCommandTest {

    private final AddressBook typicalAddressBook = new TypicalPersons().getTypicalAddressBook();
    private final AddressBook typicalVariedCaseAddressBook = new TypicalPersonsVariedCase().getTypicalAddressBook();
    private final TypicalPersons td = new TypicalPersons();
    private final TypicalPersonsVariedCase tdVar = new TypicalPersonsVariedCase();

    @Test
    public void execute_sortOnTypicalPersons() {
        typicalAddressBook.sort();
        assertEquals(typicalAddressBook.getAllPersons().immutableListView(), td.getTypicalAddressBook().getAllPersons().immutableListView());
    }

    @Test
    public void execute_sortOnTypicalPersonsVariedCase(){
        typicalVariedCaseAddressBook.sort();
        assertEquals(typicalVariedCaseAddressBook.getAllPersons().immutableListView(), tdVar.getTypicalAddressBook().getAllPersons().immutableListView());
    }



}