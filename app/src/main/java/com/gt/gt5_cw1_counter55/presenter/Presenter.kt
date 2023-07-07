package com.gt.gt5_cw1_counter55.presenter

import com.gt.gt5_cw1_counter55.Injector
import com.gt.gt5_cw1_counter55.uI.CounterView

class Presenter{
var model= Injector.fillModel()
    lateinit var view : CounterView


    fun increment(){
        model.increment()
        view.updateText(model.count)
        //дз отсюда:
        if (model.count==10){
            view.showToast("Поздравляем")
        }
        if (model.count==15){
            view.changeTextColor(true)
        }
        //till here.
    }

    fun init(view: CounterView){
        this.view=view
    }

    fun decrement(){
        model.decrement()
        view.updateText(model.count)
    }
}