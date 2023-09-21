package com.template.myhomekg.presentation.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.template.myhomekg.presentation.ui.cameras.CamerasFragment
import com.template.myhomekg.presentation.ui.doors.DoorsFragment
import com.template.myhomekg.presentation.ui.favorites.FavoritesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CamerasFragment()
            1 -> DoorsFragment()
            2 -> FavoritesFragment()
            else -> Fragment()
        }
    }
}