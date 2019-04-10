package com.bluelampcreative.recyclerviewwithclick.viewholders

import android.view.View
import com.bluelampcreative.recyclerviewwithclick.core.BaseViewHolder
import com.bluelampcreative.recyclerviewwithclick.models.Item
import com.bluelampcreative.recyclerviewwithclick.models.Item.Companion.PRIMARY
import com.bluelampcreative.recyclerviewwithclick.models.Item.Companion.PRIMARY_VIEW
import com.bluelampcreative.recyclerviewwithclick.models.Item.Companion.SECONDARY
import com.bluelampcreative.recyclerviewwithclick.models.Item.Companion.SECONDARY_VIEW
import com.bluelampcreative.recyclerviewwithclick.models.Item.Companion.TERTIARY_VIEW

class ViewHolderTypeFactoryImpl: ViewHolderTypeFactory {
    override fun create(parent: View, viewType: Int): BaseViewHolder<Item> {
        return when(viewType) {
            PRIMARY_VIEW -> PrimaryViewHolder(parent)
            SECONDARY_VIEW -> SecondaryViewHolder(parent)
            else -> TertiaryViewHolder(parent)
        }
    }

    override fun type(item: Item): Int {
        return when(item.type) {
            PRIMARY -> PRIMARY_VIEW
            SECONDARY -> SECONDARY_VIEW
            else -> TERTIARY_VIEW
        }
    }
}