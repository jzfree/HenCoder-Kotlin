@file:JvmName("KotlinUtils")

package com.example.core.utils

import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

private val displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics

fun dp2px(dp: Float): Float {
  return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)
}

object Utils {
  fun toast(string: String) {
    toast(string, Toast.LENGTH_SHORT)
  }

  fun toast(string: String, duration: Int) {
    Toast.makeText(BaseApplication.currentApplication(), string, duration).show()
  }
}