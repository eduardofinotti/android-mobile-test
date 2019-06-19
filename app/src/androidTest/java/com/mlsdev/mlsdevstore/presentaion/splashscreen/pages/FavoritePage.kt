package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class FavoritePage {

    companion object {

        fun selectItem(position: Int){
            var realPosition = position - 1
            Espresso.onView(withId(R.id.collection_products)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(realPosition, click()))
        }
    }


}