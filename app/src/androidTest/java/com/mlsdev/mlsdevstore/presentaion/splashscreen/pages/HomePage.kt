package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class HomePage {

    companion object {

        fun enterAllCategories(){
            Thread.sleep(7000)
            Espresso.onView(withId(R.id.button_browse_categories)).perform(click())
        }
    }


}