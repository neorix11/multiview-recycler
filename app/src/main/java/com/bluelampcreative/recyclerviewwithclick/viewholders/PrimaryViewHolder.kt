package com.bluelampcreative.recyclerviewwithclick.viewholders

import android.view.View
import com.bluelampcreative.recyclerviewwithclick.core.BaseViewHolder
import com.bluelampcreative.recyclerviewwithclick.models.Item
import kotlinx.android.synthetic.main.item_primary_view.view.*

class PrimaryViewHolder(itemView: View) : BaseViewHolder<Item>(itemView) {
    override fun bind(model: Item, clickListener: (Item) -> Unit) = with(itemView) {
        with(model) {
            txt_name.text = name
            txt_type.text = type
        }
        setOnClickListener { clickListener(model) }
    }
}