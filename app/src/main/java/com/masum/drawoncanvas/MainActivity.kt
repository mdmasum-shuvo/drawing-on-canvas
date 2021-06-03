package com.masum.drawoncanvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val canvas = MyCanvasView(this)
        canvas.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        canvas.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(canvas)
    }


}