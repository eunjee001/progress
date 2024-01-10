package com.kkyoungs.progress

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.github.ybq.android.spinkit.sprite.ShapeSprite
import kotlin.coroutines.coroutineContext


/**
 * Created by ybq.
 */
open class CircleSprite : ShapeSprite() {
    override fun onCreateAnimation(): ValueAnimator? {
        return null
    }

    override fun drawShape(canvas: Canvas, paint: Paint) {
        if (getDrawBounds() != null) {

            canvas.drawBitmap(
                BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.dot),
                getDrawBounds().centerX().toFloat(),
                getDrawBounds().centerY().toFloat(),
                paint
            )
        }
    }
}