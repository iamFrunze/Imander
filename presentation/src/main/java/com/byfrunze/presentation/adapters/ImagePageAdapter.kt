package com.byfrunze.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.byfrunze.presentation.screens.cell_images.CellImagesFragment

class ImagePageAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    val NUM_PAGES = 20
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment = CellImagesFragment()
}