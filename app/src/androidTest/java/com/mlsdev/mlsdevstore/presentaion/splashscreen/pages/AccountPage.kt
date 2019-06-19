package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R

class AccountPage {

    companion object {

        fun insertPersonalInfos(){
            Espresso.onView(withId(R.id.button_edit_personal_info)).perform(click())
            Espresso.onView(withId(R.id.email_edit_text)).perform(ViewActions.clearText(), ViewActions.typeText("edu@gmail.com"));
            Espresso.onView(withId(R.id.first_name_edit_text)).perform(ViewActions.clearText(), ViewActions.typeText("Eduardo"));
            Espresso.onView(withId(R.id.last_name_edit_text)).perform(ViewActions.clearText(), ViewActions.typeText("Finotti"));
            Espresso.onView(withId(R.id.submit_button)).perform(click())
        }

        fun insertAddressInfos(){
            Espresso.onView(withId(R.id.button_edit_shipping_info)).perform(click())
            Espresso.onView(withId(R.id.edit_text_phone_number)).perform(ViewActions.clearText(), ViewActions.typeText("48991929999"));
            Espresso.onView(withId(R.id.edit_text_address)).perform(ViewActions.clearText(), ViewActions.typeText("Rua do marisco, 05"));
            Espresso.onView(withId(R.id.edit_text_city)).perform(ViewActions.clearText(), ViewActions.typeText("Fpolis"));
            Espresso.onView(withId(R.id.edit_text_state)).perform(ViewActions.clearText(), ViewActions.typeText("SC"));
            Espresso.pressBack()
            Espresso.onView(withId(R.id.edit_text_postal_code)).perform(ViewActions.clearText(), ViewActions.typeText("88117402"));
            Espresso.pressBack()
            Espresso.onView(withId(R.id.submit_button)).perform(click())
        }
    }


}