package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I'm only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Dan"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach ...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I'm only called once!!!");
    }
}