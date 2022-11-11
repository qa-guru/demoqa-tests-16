import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("### @BeforeAll !");
    }

    @BeforeAll
    static void beforeAll1() {
        System.out.println("### @BeforeAll1 !");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### @AfterAll !");
    }

    @BeforeEach
    void beforeEach() {
        // open("google.com")
        System.out.println("###    @BeforeEach !");
    }

    @AfterEach
    void afterEach() {
        System.out.println("###    @AfterEach !");
    }

    @Test
    void fistTest() {
        System.out.println("###       @Test fistTest() !");
        assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###       @Test secondTest() !");
        assertFalse(3 > 2);
    }
}
