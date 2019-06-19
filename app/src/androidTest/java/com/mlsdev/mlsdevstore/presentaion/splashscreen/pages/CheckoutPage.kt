package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class CheckoutPage {

    companion object {

        fun insertCreditCard(){
            Espresso.onView(withId(R.id.text_card_number)).perform(ViewActions.clearText(), ViewActions.typeText("5314 8746 8859 6764"));
            Espresso.onView(withId(R.id.text_expiration_date)).perform(ViewActions.clearText(), ViewActions.typeText("1119"));
            Espresso.onView(withId(R.id.text_cvv)).perform(ViewActions.clearText(), ViewActions.typeText("476"));
        }

        fun doOrder(){
            Espresso.onView(withId(R.id.button_place_order)).perform(click())
        }
    }


}