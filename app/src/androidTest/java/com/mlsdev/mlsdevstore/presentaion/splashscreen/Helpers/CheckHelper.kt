package com.mlsdev.mlsdevstore.presentaion.splashscreen.Helpers

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.mlsdev.mlsdevstore.R

class CheckHelper {
    companion object {

        fun validateText(text: String){
            Espresso.onView(ViewMatchers.withText(text)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        }

        // This method exist because the app has a bug when enter in the item details
        fun closeMessageError(){
            Espresso.onView(ViewMatchers.withText("Close")).perform(ViewActions.click())
        }

    }
}