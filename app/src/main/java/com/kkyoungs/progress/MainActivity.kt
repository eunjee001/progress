package com.kkyoungs.progress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.isVisible
import com.kkyoungs.progress.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var isStarted = false
    var progressStatus = 0
    var handler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val delayMills = 5000L
//        Handler(Looper.myLooper()!!).postDelayed({
//            binding.progressCircular.isVisible = false
//        }, delayMills)
//        handler = Handler(Handler.Callback {
//            if (isStarted) {
//                progressStatus++
//            }
//            binding.progressHorizontal.progress = progressStatus
//            handler?.sendEmptyMessageDelayed(0, 100)
//
//            true
//        })

        handler?.sendEmptyMessage(0)
    }
}