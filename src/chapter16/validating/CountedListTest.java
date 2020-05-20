package chapter16.validating;


import org.junit.jupiter.api.*;

/**
 *  Simple use of JUnit to test CountedList.
 */
public class CountedListTest {

    private CountedList list;

    @BeforeAll
    static void beforeAllMsg() {
        System.out.println(">>> Starting CountedListTest");
    }

    @AfterAll
    static void afterAllMsg() {
        System.out.println(">>> Finished CountedListTest");
    }

    @BeforeEach
    public void initialize() {
        list = new CountedList();
        System.out.println("set up for " + list.getId());
        for (int i = 0; i < 3; i++) {
            list.add(Integer.toString(i));
        }
    }

    @AfterEach
    public void cleanup() {
        System.out.println("Cleaning up " + list.getId());
    }

    @Test
    public void insert() {
        System.out.println("Running Test insert()");
        Assertions.assertEquals(list.size(), 3);
        list.add(1, "Insert");
        Assertions.assertEquals(list.size(), 4);
        Assertions.assertEquals(list.get(1),"Insert");
    }

    @Test
    public void replace() {
        System.out.println("Running testReplace()");
        Assertions.assertEquals(list.size(), 3);
        list.set(1, "Replace");
        Assertions.assertEquals(list.size(), 3);
        Assertions.assertEquals(list.get(1), "Replace");
    }


}
