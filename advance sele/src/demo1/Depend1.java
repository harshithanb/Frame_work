package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend1 {
    @Test
    public void test1() {
        System.out.println("hello india");
    }

    @Test
    public void test2() {
        System.out.println("hello asia");
        Assert.fail();
    }

    @Test
    public void test3() {
        System.out.println("hello bangalore");
    }
}
