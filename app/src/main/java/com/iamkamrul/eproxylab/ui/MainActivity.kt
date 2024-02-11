package com.iamkamrul.eproxylab.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.epoxy.epoxyView
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.ActivityMainBinding
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
        },
        useVisibilityTracking = true
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appBarViewBinder.invalidate()

        binding.recyclerView.withModels {

        }

    }

}