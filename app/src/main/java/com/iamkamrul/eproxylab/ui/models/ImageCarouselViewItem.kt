package com.iamkamrul.eproxylab.ui.models

import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ImageCarouselViewItemBinding
import com.iamkamrul.eproxylab.utils.ViewBindingEpoxyModelWithHolder

@EpoxyModelClass(layout = (R.layout.image_carousel_view_item))
abstract class ImageCarouselViewItem : ViewBindingEpoxyModelWithHolder<ImageCarouselViewItemBinding>(){
    @DrawableRes @EpoxyAttribute  var imageRes:Int = R.drawable.car_1

    override fun ImageCarouselViewItemBinding.bind() {
        image.setImageResource(imageRes)
    }

    override fun ImageCarouselViewItemBinding.unbind() {

    }
}