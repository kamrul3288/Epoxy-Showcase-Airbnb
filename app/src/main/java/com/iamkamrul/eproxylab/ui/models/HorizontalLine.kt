package com.iamkamrul.eproxylab.ui.models

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import com.airbnb.epoxy.ModelView
import com.iamkamrul.eproxylab.utils.displayRatioValue

@ModelView(autoLayout = ModelView.Size.MANUAL)
class HorizontalLine @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
): View(context,attrs,defStyle){
    init {
        layoutParams = ViewGroup.MarginLayoutParams(
            ViewGroup.MarginLayoutParams.MATCH_PARENT,
            context.displayRatioValue(1)
        ).apply {
            setMargins(0,context.displayRatioValue(16),0,context.displayRatioValue(16))
        }
        setBackgroundColor(Color.parseColor("#EDEDED"))
    }

}