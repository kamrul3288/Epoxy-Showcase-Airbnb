package com.iamkamrul.eproxylab.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.airbnb.epoxy.epoxyView
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ActivityMainBinding
import com.iamkamrul.eproxylab.ui.models.ItemTileView
import com.iamkamrul.eproxylab.ui.models.LocationItemView
import com.iamkamrul.eproxylab.ui.models.horizontalLine
import com.iamkamrul.eproxylab.ui.models.spacer
import com.iamkamrul.eproxylab.ui.models.topAppbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val appBarViewBinder by epoxyView(
        viewId = R.id.topViewStub,
        initializer = {},
        modelProvider = {
            topAppbar {
                title("Trip JR1697361208HI")
                onBackBtnClicked{}
            }
        }
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appBarViewBinder.invalidate()

        binding.recyclerView.withModels {
            spacer {
                id("root_height")
                height(16)
            }
            ItemTileView(
                leadingIcon = R.drawable.ic_verification,
                title = "Trip Verifications",
                subtitle = "Collect and verify OTP from user to secure your trip",
                trailingIcon = R.drawable.ic_arrow_forward,
                onTap = {
                    Toast.makeText(applicationContext, "Verifications Clicked", Toast.LENGTH_SHORT).show()
                }
            ).id("trip_verifications").addTo(this)


            spacer {
                id("trip_insurance_top_height")
                height(16)
            }
            ItemTileView(
                leadingIcon = R.drawable.ic_trip_insurance,
                title = "Trip Insurances",
                subtitle = "Your trip is covered by insurance",
                trailingIcon = R.drawable.ic_arrow_forward,
                onTap = {
                    Toast.makeText(applicationContext, "Trip Insurances Clicked", Toast.LENGTH_SHORT).show()
                }
            ).id("trip_insurance").addTo(this)


            spacer {
                id("trip_car_info_top_height")
                height(16)
            }
            ItemTileView(
                leadingIcon = R.drawable.ic_car_placeholder,
                title = "Toyota Primo - 4 Seat",
                subtitle = "DHA GA 36-5467",
                trailingIcon = R.drawable.ic_arrow_forward,
                onTap = {
                    Toast.makeText(applicationContext, "Car Info Clicked", Toast.LENGTH_SHORT).show()
                }
            ).id("trip_car_info").addTo(this)

            spacer {
                id("location_view_margin")
                height(24)
            }
            LocationItemView(
                pickupLocation = "Burger King, Dhaka, Bangladesh, Airport",
                dropLocation = "Dakbangla Bazar, Rd No #23"
            ).id("location_view").addTo(this)

            horizontalLine {
                id("trip_summary_line")
            }

        }

    }

}