package com.byfrunze.presentation.screens.main

import com.byfrunze.presentation.base.BaseViewModel
import com.byfrunze.presentation.screens.main.models.MainImageAction
import com.byfrunze.presentation.screens.main.models.MainImageEvent
import com.byfrunze.presentation.screens.main.models.MainImageViewState
import io.reactivex.disposables.CompositeDisposable

class MainImageViewModel :
    BaseViewModel<MainImageViewState, MainImageAction, MainImageEvent>() {

    private val compositeDisposable = CompositeDisposable();
    


    override fun obtainEvent(viewEvent: MainImageEvent) {
        TODO("Not yet implemented")
    }

}