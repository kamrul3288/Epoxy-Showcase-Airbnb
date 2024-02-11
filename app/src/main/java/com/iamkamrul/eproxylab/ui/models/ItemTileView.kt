package com.iamkamrul.eproxylab.ui.models

import android.view.View
import androidx.annotation.DrawableRes
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ItemTileViewBinding
import com.iamkamrul.eproxylab.utils.ViewBindingKotlinModel

data class ItemTileView(
    @DrawableRes val leadingIcon:Int,
    val title:String,
    val subtitle:String,
    @DrawableRes val trailingIcon:Int,
    val onTap:(View)->Unit
):ViewBindingKotlinModel<ItemTileViewBinding>(R.layout.item_tile_view){
    override fun ItemTileViewBinding.bind() {
        titleTv.text = title
        subTitleTv.text = subtitle
        leadingIconBtn.setBackgroundResource(leadingIcon)
        trailingIconBtn.setBackgroundResource(trailingIcon)
        root.setOnClickListener(onTap)
    }
}
