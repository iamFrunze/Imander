package com.byfrunze.presentation.screens.cell_images

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.byfrunze.presentation.R
import com.byfrunze.presentation.databinding.CellImageMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CellImagesFragment : Fragment(R.layout.cell_image_main) {
    private val viewModel: CellImagesViewModel by viewModels()
    private val viewBinding by viewBinding(CellImageMainBinding::bind)

}