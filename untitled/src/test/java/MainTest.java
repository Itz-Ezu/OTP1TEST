import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void giveMeFive() {
        assertEquals(5, new Main().giveMeFive());
    }

    @org.junit.jupiter.api.Test
    void giveMeTen() {
        assertEquals(10, new Main().giveMeTen());
    }
}