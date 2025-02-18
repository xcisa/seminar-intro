package cz.muni.fi.pa165;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        assertAll(
                () -> assertEquals("anna", ReverseString.reverse("anna")),
                () -> assertEquals("annA", ReverseString.reverse("Anna")),
                () -> assertEquals("", ReverseString.reverse("")),
                () -> assertEquals("DSA", ReverseString.reverse("ASD"))
        );
    }
}