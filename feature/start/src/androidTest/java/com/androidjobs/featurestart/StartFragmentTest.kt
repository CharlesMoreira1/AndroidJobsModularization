package com.androidjobs.featurestart

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StartFragmentTest {

    @Test
    fun navigateToHomeFragment() {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()).apply {
            setGraph(R.navigation.nav_graph_start)
            setCurrentDestination(R.id.start_fragment)
        }

        val startFragmentScene = launchFragmentInContainer<StartFragment>()

        startFragmentScene.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), navController)
        }

        onView(withId(R.id.button_click_home)).perform(click())

        val backStack = navController.backStack
        val currentDestination = backStack.last()
        assertTrue(currentDestination.destination.id == R.id.home_fragment)
    }
}