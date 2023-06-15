package com.iamkamrul.eproxylab.ui.controller

import android.view.View
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyModel
import com.iamkamrul.eproxylab.ui.model.ModelSeatItem
import java.util.UUID

class SeatLayoutController(
    val onClick:(View.OnClickListener)
) : EpoxyController() {
    override fun buildModels() {

        seatLayoutList.forEach{seats->
            val seatLayoutRowViewList =  mutableListOf<EpoxyModel<View>>()
            seats.forEach {seat->
                seatLayoutRowViewList.add(
                    ModelSeatItem(
                        isSelected = false,
                        seatNumber = seat,
                        onClick = onClick
                    ).id("seat_number",seat)
                )
            }
            CarouselModel_()
                .id(UUID.randomUUID().toString())
                .models(seatLayoutRowViewList)
                .addTo(this)
        }



    }
}


private val seatLayoutList: List<List<String>> = listOf(
    listOf("101"),
    listOf("102","103"),
    listOf("103","104","105"),
    listOf("106"),
    listOf("107","108","109","110","111","113"),
    listOf("114","115","116","117","118","119","120","121"),
)
