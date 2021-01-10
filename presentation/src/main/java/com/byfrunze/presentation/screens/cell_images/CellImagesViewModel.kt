package com.byfrunze.presentation.screens.cell_images

import com.byfrunze.presentation.base.BaseViewModel
import com.byfrunze.presentation.screens.cell_images.models.CellImageAction
import com.byfrunze.presentation.screens.cell_images.models.CellImageEvent
import com.byfrunze.presentation.screens.cell_images.models.CellImageViewState
import io.reactivex.disposables.CompositeDisposable

class CellImagesViewModel :
    BaseViewModel<CellImageViewState, CellImageAction, CellImageEvent>() {

    private val compositeDisposable = CompositeDisposable();


    override fun obtainEvent(viewEvent: CellImageEvent) {
        TODO("Not yet implemented")
    }
}