package com.androidjobs

import com.androidjobs.navigation.base.BaseNavigator
import com.androidjobs.navigation.NavigationStartFeature
import com.androidjobs.navigation.setup.SetupNavigation

class Navigator : BaseNavigator(), NavigationStartFeature {

    init {
       SetupNavigation.init(this)
    }

    override fun actionStartFragmentToHomeFragment() {
        navController?.navigate(R.id.action_startFragment_to_homeFragment)
    }
}