package com.iamkamrul.eproxylab.ui.model

import android.view.View
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ModelSeatItemBinding
import com.iamkamrul.eproxylab.utils.ViewBindingKotlinModel

data class ModelSeatItem(
    val isSelected:Boolean,
    val seatNumber:String,
    val onClick:(View.OnClickListener)
):ViewBindingKotlinModel<ModelSeatItemBinding>(R.layout.model_seat_item){
    override fun ModelSeatItemBinding.bind() {
        seatNumberTv.text = seatNumber
        seatNumberTv.setOnClickListener(onClick)
    }
}