package com.mlsdev.mlsdevstore.presentaion.splashscreen.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToHolder
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.matcher.PreferenceMatchers.withTitle
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mlsdev.mlsdevstore.R
import com.mlsdev.mlsdevstore.presentaion.store.CategoriesAdapter
import org.hamcrest.Description
import org.hamcrest.Matcher
import java.text.FieldPosition

class CategoriesPage {

    companion object {

        fun selectCategorieByPosition(position: Int){
            var realPosition = position - 1
            Espresso.onView(withId(R.id.rv_categories)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(realPosition, click()))
            Thread.sleep(3000)
        }

        fun selectCategorieByName(reference: String, cagorie: String){
            Espresso.onView((withId(R.id.rv_categories))).perform(RecyclerViewActions.scrollToHolder(withTitle(reference)), RecyclerViewActions.actionOnHolderItem(withTitle(cagorie), click()));
            Thread.sleep(2000)
        }

        fun withTitle(title: String): Matcher<RecyclerView.ViewHolder> {
            return object : BoundedMatcher<RecyclerView.ViewHolder, CategoriesAdapter.ViewHolder>(CategoriesAdapter.ViewHolder::class.java!!) {
                override fun matchesSafely(item: CategoriesAdapter.ViewHolder): Boolean {
                    return item.item?.category?.categoryName.equals(title)
                }

                override fun describeTo(description: Description) {
                    description.appendText("view holder with title: $title")
                }
            }
        }
    }




}