package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoogleTest extends BaseTest {

    @Before
    public void setUp() {
        setup();
    }

    @Test
    public void testGoogleHomePageTitle() {
        driver.get("https://www.google.com");
        assertEquals("Google", driver.getTitle());
    }

    @After
    public void tearDown() {
        teardown();
    }
}