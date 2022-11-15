package com.example.test

import androidx.test.espresso.Espresso

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var  rule:ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("9")))

        }
    }
    @Test
    fun simbolAddTest(){
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("?"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("Символы вводить нельзя")))

        }
    }
    @Test
    fun divideAdd(){
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("0"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            delay(1500)
            Espresso.onView(withId(R.id.btn_divide)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("На 0 делить нельзя")))

        }
    }
}