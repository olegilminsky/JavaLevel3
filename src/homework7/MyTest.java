package homework7;

public class MyTest {

    @BeforeSuite
    public static void test2() {
        System.out.println("test2 BeforeSuite");
    }

    @Test
    public static void test8() {
        System.out.println("test8");
    }

    @Test
    public static void test1() {
        System.out.println("test1");
    }

    @Test(priority = 2)
    public static void test3() {
        System.out.println("test3 priority = 2");
    }

    @Test(priority = 7)
    public static void test4() {
        System.out.println("test4 priority = 7");
    }

    @AfterSuite
    public static void test5(){
        System.out.println("test5 AfterSuite");
    }
}
