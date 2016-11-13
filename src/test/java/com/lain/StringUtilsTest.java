package com.lain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Lain
 * Date: 16/10/23
 * Time: 上午8:30
 */
public class StringUtilsTest {

    @Before
    public void before() throws Exception{
        System.out.println("before method.");
    }

    @Test
    public void testSurroundWith() throws Exception {
        assertEquals("[hello junit]", StringUtils.surroundWith("hello junit", "[", "]"));
    }


    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, StringUtils.isEmpty(null));
    }


    public void runBatch() throws Exception{

    }
}