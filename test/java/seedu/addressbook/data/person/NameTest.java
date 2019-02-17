package seedu.addressbook.data.person;

import org.junit.Test;
import seedu.addressbook.commands.CommandResult;
import seedu.addressbook.data.exception.IllegalValueException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class NameTest {

    @Test
    public void isSimilar_nullName_throwsException() {
        try {
            Name nullName = new Name("");
        } catch(IllegalValueException ive) {
            return;
        }
        String error = String.format("Name was constructed with invalid input");
        fail(error);
    }

    @Test
    public void isSimilar_differentCase_correctlyReturned() {
        try {
            Name nameSmallCaps = new Name("alice tan");
            Name nameBigCaps = new Name("ALICE TAN");
            Name nameVariedCaps = new Name("AliCe TaN");
            Name otherName = new Name("Alice Teo");

            assertTrue(nameBigCaps.isSimilar(nameSmallCaps));
            assertTrue(nameBigCaps.isSimilar(nameVariedCaps));
            assertTrue(nameVariedCaps.isSimilar(nameSmallCaps));
            assertFalse(nameVariedCaps.isSimilar(otherName));
        } catch (IllegalValueException ive) {
            return;
        }
    }

    @Test
    public void isSimilar_differentOrder_correctlyReturned() {
        try {
            Name diffOrder = new Name ("Sam Smith");
            Name otherDiffOrder = new Name("Smith Sam");
            Name diffName = new Name("Smoth Sam");
            assertTrue(diffOrder.isSimilar(otherDiffOrder));
            assertFalse(diffName.isSimilar(diffOrder));
        } catch(IllegalValueException ive) {
            return;
        }
    }
}
