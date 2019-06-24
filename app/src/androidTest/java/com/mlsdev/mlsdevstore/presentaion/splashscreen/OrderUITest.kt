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
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters


@LargeTest
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class OrderUITest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(SplashScreenActivity::class.java)

    @Before
    fun setUp() {
        HomePage.enterAllCategories()
    }

    // Add and remove an item from the cart
    @Test
    fun addItemToCart() {
        CategoriesPage.selectCategorieByPosition(3)
        StorePage.selectItem(1)

        ItemPage.closeMessageError()

        ItemPage.addToCart()
        TabMenuPage.clickCartTab()
        CheckHelper.validateText("Total sum:")
        onView(withId(R.id.button_checkout)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.button_remove_from_cart)).perform(click())
        onView(withId(R.id.empty_cart_placeholder)).check(ViewAssertions.matches(isDisplayed()))
        CheckHelper.validateText("No items - no fun :(")
    }

    // Browse and buy an item with success from Health & Beauty and another from Baby categories
    @Test
    fun buyTwoItens() {
        CategoriesPage.selectCategorieByName("Entertainment Memorabilia", "Health & Beauty")
        StorePage.selectItem(1)

        ItemPage.closeMessageError()

        ItemPage.addToCart()
        Espresso.pressBack()
        Espresso.pressBack()
        Thread.sleep(2000)
        CategoriesPage.selectCategorieByName("Baby", "Baby")
        StorePage.selectItem(1)

        ItemPage.closeMessageError()

        ItemPage.addToCart()
        ItemPage.addToCart()
        TabMenuPage.clickAccountTab()
        AccountPage.insertPersonalInfos()
        AccountPage.insertAddressInfos()
        TabMenuPage.clickCartTab()
        CartPage.checkItemsInCard()
        CartPage.checkout()
        CheckoutPage.insertCreditCard()
        CheckHelper.validateText("Total sum:")
        Espresso.pressBack()
        CheckoutPage.doOrder()
    }

}
