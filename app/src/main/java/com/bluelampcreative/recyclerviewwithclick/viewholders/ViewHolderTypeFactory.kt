package com.bluelampcreative.recyclerviewwithclick.viewholders

import android.view.View
import com.bluelampcreative.recyclerviewwithclick.core.BaseViewHolder
import com.bluelampcreative.recyclerviewwithclick.models.Item

interface ViewHolderTypeFactory {
    fun type(item: Item): Int
    fun create(parent: View, viewType: Int): BaseViewHolder<Item>
}