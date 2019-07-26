package com.example.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.myapplication", appContext.getPackageName());
    }

    @Test
    public void user_enter_first_name(){
        onView(withId(R.id.edFirtstname)).perform(typeText("first"));
    }

    @Test
    public void user_enter_last_name(){
        onView(withId(R.id.edLasttname)).perform(typeText("last"));
    }
    @Test
    public void when_user_first_last_name_check_to_confirm_message(){
        onView(withId(R.id.edFirtstname)).perform(typeText("jake"));
        onView(withId(R.id.edLasttname)).perform(typeText("warton"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.message)).check(matches(withText("welcome, jake warton")));
    }

    @Test
    public void first_name_test(){
        onView(withId(R.id.edFirtstname)).perform(typeText("joe"));
        onView(withId(R.id.edLasttname)).perform(typeText("root"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.message)).check(matches(withText("welcome, joe root")));
    }
}
