package com.kkyoungs.progress

import android.animation.ValueAnimator
import android.os.Build
import com.github.ybq.android.spinkit.animation.SpriteAnimatorBuilder
import com.github.ybq.android.spinkit.sprite.CircleLayoutContainer
import com.github.ybq.android.spinkit.sprite.Sprite


/**
 * Created by ybq.
 */
class FadingCircle : CircleLayoutContainer() {
    override fun onCreateChild(): Array<Dot?> {
        val dots = arrayOfNulls<Dot>(12)
        for (i in dots.indices) {
            dots[i] = Dot()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                dots[i]!!.animationDelay = 1200 / 12 * i
            } else {
                dots[i]!!.animationDelay = 1200 / 12 * i + -1200
            }
        }
        return dots
    }

    inner class Dot internal constructor() : CircleSprite() {
        init {
            alpha = 0
        }

        override fun onCreateAnimation(): ValueAnimator? {
            val fractions = floatArrayOf(0f, 0.39f, 0.4f, 1f)
            return SpriteAnimatorBuilder(this).alpha(fractions, 0, 0, 255, 0).duration(1200)
                .easeInOut(*fractions).build()
        }
    }
}