package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.mlsdev.mlsdevstore.R

class ItemPage {

    companion object {

        fun clickToFavorite(){
            Espresso.onView(withId(R.id.add_to_favorites)).perform(click())
        }

        // This method exist because the app has a bug when enter in the item details
        fun closeMessageError(){
            Thread.sleep(1000)
            onView(withText("Close")).perform(click())
        }

        fun addToCart() {
            onView(withText("Add to cart")).perform(click())
        }

    }


}