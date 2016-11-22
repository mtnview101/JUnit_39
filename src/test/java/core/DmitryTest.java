package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DmitryTest {

	@Test // @Ignore
    public void test_01_AssertEquals_Positive()      {
    assertEquals("String is not equal", "JUnit 4.12", Dmitry.s);   }

@Test // @Ignore
    public void test_02_AssertEquals_Negative()      {
    assertEquals("String is not equal", "JUnit 4.13", Dmitry.s);   }

@Test @Ignore
    public void test_03_AssertEquals_Ignored()       {
    assertEquals("String is not equal", "JUnit 4.12", Dmitry.s);   }

@Test // @Ignore
    public void test_04_AssertSame_Positive()        {
    assertSame("Integer is not the same", 39, Dmitry.i);    }

@Test // @Ignore
    public void test_05_AssertSame_Negative()        {
    assertSame("Integer is not the same", 40, Dmitry.i);    }

@Test @Ignore
    public void test_06_AssertSame_Ignored()         {
    assertSame("Integer is not the same", 39, Dmitry.i);    }

@Test // @Ignore
    public void test_07_AssertFalse_Positive()       {
    assertFalse("Must be false", Dmitry.f);              }

@Test // @Ignore
    public void test_08_AssertFalse_Negative()      {
    assertFalse("Must be false", Dmitry.t);             }

@Test // @Ignore
    public void test_09_AssertTrue_Positive()       {
    assertTrue("Must be true", Dmitry.t);               }

@Test // @Ignore
    public void test_10_AssertTrue_Negative()      {
    assertTrue("Must be true", Dmitry.f);              }
}



