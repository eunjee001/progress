package com.kkyoungs.progress

import android.R
import android.animation.Animator
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import androidx.core.view.isVisible
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.PulseRing
import com.kkyoungs.progress.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lotti.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                // 애니메이션이 시작될 때
            }

            override fun onAnimationEnd(animation: Animator) {
                // 애니메이션이 종료될 때
                binding.lotti.visibility = View.GONE
            }

            override fun onAnimationCancel(animation: Animator) {
                // 애니메이션이 취소될 때
            }

            override fun onAnimationRepeat(animation: Animator) {
                // 애니메이션이 시작된 이후 반복될 때
            }
        })

    }
    }
