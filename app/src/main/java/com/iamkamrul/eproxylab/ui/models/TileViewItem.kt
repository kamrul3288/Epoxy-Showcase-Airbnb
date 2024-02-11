package com.iamkamrul.eproxylab.ui.models

import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.view.isVisible
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.TileViewItemBinding
import com.iamkamrul.eproxylab.utils.ViewBindingKotlinModel

data class TileViewItem(
    @DrawableRes val leadingIcon:Int,
    val title:String,
    val subtitle:String,
    @DrawableRes val trailingIcon:Int,
    val isVisibleLine:Boolean = true,
    val onTap:(View)->Unit
):ViewBindingKotlinModel<TileViewItemBinding>(R.layout.tile_view_item){
    override fun TileViewItemBinding.bind() {
        titleTv.text = title
        subTitleTv.text = subtitle
        leadingIconBtn.setBackgroundResource(leadingIcon)
        trailingIconBtn.setBackgroundResource(trailingIcon)
        view.isVisible = isVisibleLine
        root.setOnClickListener(onTap)
    }
}
