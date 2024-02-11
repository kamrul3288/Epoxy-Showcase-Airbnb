package com.iamkamrul.eproxylab.ui.models

import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ItemLocationViewBinding
import com.iamkamrul.eproxylab.utils.ViewBindingKotlinModel

data class LocationItemView(
    val pickupLocation:String,
    val  dropLocation:String
):ViewBindingKotlinModel<ItemLocationViewBinding>(R.layout.item_location_view){
    override fun ItemLocationViewBinding.bind() {
        pickupLocationTv.text = pickupLocation
        dropLocationTv.text = dropLocation
    }
}