package com.byfrunze.presentation.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.byfrunze.presentation.R
import com.byfrunze.presentation.adapters.ImagePageAdapter
import com.byfrunze.presentation.databinding.MainImageFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainImageFragment : Fragment(R.layout.main_image_fragment) {


    private val viewModel: MainImageViewModel by viewModels()
    private val viewBinding by viewBinding(MainImageFragmentBinding::bind)

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewPager = viewBinding.mainViewPager
        val pageAdapter = ImagePageAdapter(requireActivity())
        viewPager.adapter = pageAdapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }


}