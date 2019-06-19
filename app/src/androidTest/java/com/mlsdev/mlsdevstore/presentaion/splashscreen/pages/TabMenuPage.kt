package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class TabMenuPage {

    companion object {

        fun clickAccountTab(){
            Espresso.onView(ViewMatchers.withId(R.id.account_flow_fragment)).perform(ViewActions.click())
        }

        fun clickCartTab() {
            Espresso.onView(withId(R.id.cart_flow_fragment)).perform(click())
        }

        fun clickFavoriteTab() {
            Espresso.onView(withId(R.id.favorites_flow_fragment)).perform(click())
        }
    }


}