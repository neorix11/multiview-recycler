package com.bluelampcreative.recyclerviewwithclick.models

import com.bluelampcreative.recyclerviewwithclick.R
import com.bluelampcreative.recyclerviewwithclick.viewholders.ViewHolderTypeFactory

data class Item(
    val name: String,
    val type: String
): ItemViewModel {
    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }

    companion object {
        const val PRIMARY = "primary"
        const val SECONDARY = "secondary"
        const val TERTIARY = "tertiary"
        const val PRIMARY_VIEW = R.layout.item_primary_view
        const val SECONDARY_VIEW = R.layout.item_secondary_view
        const val TERTIARY_VIEW = R.layout.item_tertiary_view
    }

}