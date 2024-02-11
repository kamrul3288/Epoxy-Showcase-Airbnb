package com.iamkamrul.eproxylab.ui.models
import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.iamkamrul.eproxylab.R
import com.iamkamrul.eproxylab.databinding.TopAppBarViewBinding
import com.iamkamrul.eproxylab.utils.ViewBindingEpoxyModelWithHolder

@EpoxyModelClass(layout = (R.layout.top_app_bar_view))
abstract class  TopAppbarModel : ViewBindingEpoxyModelWithHolder<TopAppBarViewBinding>() {
    @EpoxyAttribute lateinit var title: String
    @EpoxyAttribute lateinit var onBackBtnClicked: (View) -> Unit

    override fun TopAppBarViewBinding.bind() {
        titleTv.text = title
        backBtn.setOnClickListener(onBackBtnClicked)
    }

    override fun TopAppBarViewBinding.unbind() {
        backBtn.setOnClickListener(null)
    }
}