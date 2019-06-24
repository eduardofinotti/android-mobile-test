package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class CartPage {

    companion object {

        fun checkout(){
            Espresso.onView(withId(R.id.button_checkout)).perform(click())
        }

        fun checkItemsInCard(){
            Espresso.onView(ViewMatchers.withText("Total sum:")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        }
    }


}