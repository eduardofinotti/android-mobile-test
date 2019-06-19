package com.mlsdev.mlsdevstore.presentaion.splashscreen

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.mlsdev.mlsdevstore.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnHolderItem
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToHolder
import com.mlsdev.mlsdevstore.presentaion.store.CategoriesAdapter

import androidx.test.espresso.action.ViewActions.*
import com.mlsdev.mlsdevstore.presentaion.splashscreen.Helpers.CheckHelper
import com.mlsdev.mlsdevstore.presentaion.splashscreen.pages.*


@LargeTest
@RunWith(AndroidJUnit4::class)
class FavoritesUITest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(SplashScreenActivity::class.java)

    @Before
    fun setUp() {
        HomePage.enterAllCategories()
    }

    // Add an item as favorite
    @Test
    fun addItemToFavoriteTest() {
        CategoriesPage.selectCategorieByPosition(1)
        StorePage.selectItem(2)

        ItemPage.closeMessageError()

        ItemPage.clickToFavorite()
        TabMenuPage.clickFavoriteTab()
        Thread.sleep(2000)
        FavoritePage.selectItem(1)
        ItemPage.closeMessageError()
        ItemPage.clickToFavorite()
        ItemPage.clickToFavorite()
        TabMenuPage.clickFavoriteTab()
        CheckHelper.validateText("Save something :)")
    }

}
