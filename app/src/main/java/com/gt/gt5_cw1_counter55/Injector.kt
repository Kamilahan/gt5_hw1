package com.gt.gt5_cw1_counter55

import com.gt.gt5_cw1_counter55.model.Model
import com.gt.gt5_cw1_counter55.presenter.Presenter

class Injector {

    companion object {
        fun fillModel()= Model()
        fun fillPresenter()= Presenter()
    }

}