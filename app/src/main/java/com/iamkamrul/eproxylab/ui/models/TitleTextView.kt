package com.iamkamrul.eproxylab.ui.models

import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.TitleLargeTextBinding
import com.iamkamrul.eproxylab.utils.ViewBindingKotlinModel

data class TitleTextView(
    val title:String
):ViewBindingKotlinModel<TitleLargeTextBinding>(R.layout.title_large_text){
    override fun TitleLargeTextBinding.bind() {
        titleTv.text = title
    }
}
