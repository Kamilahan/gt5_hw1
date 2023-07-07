package com.gt.gt5_cw1_counter55.uI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.gt.gt5_cw1_counter55.Injector
import com.gt.gt5_cw1_counter55.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
 var presenter= Injector.fillPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.init(this)
        initClickers()

    }

    private fun initClickers(){
        with(binding){
            btnIncrement.setOnClickListener {
presenter.increment()
            }
            btnDecrement.setOnClickListener {
presenter.decrement()
            }
        }
    }

    override fun updateText(count: Int) {
       binding.tVResult.text=count.toString()
    }

    //HW starts here
    override fun showToast(message: String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(green:Boolean){
        val color=if(green) android.R.color.holo_green_dark else android.R.color.black
        binding.tVResult.setTextColor(ContextCompat.getColor(this,color))
    }
    //till here.
}