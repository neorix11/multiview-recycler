package com.bluelampcreative.recyclerviewwithclick.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bluelampcreative.recyclerviewwithclick.core.BaseViewHolder
import com.bluelampcreative.recyclerviewwithclick.models.Item
import com.bluelampcreative.recyclerviewwithclick.viewholders.ViewHolderTypeFactory
import com.bluelampcreative.recyclerviewwithclick.viewholders.ViewHolderTypeFactoryImpl

class ClickableRecyclerViewAdapter(private val itemClickListener: (Item) -> Unit) : RecyclerView.Adapter<BaseViewHolder<Item>>() {

    private val typeFactory: ViewHolderTypeFactory = ViewHolderTypeFactoryImpl()

    private val items = mutableListOf<Item>()

    fun setList(list: List<Item>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(typeFactory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Item> {
        return typeFactory.create(
            LayoutInflater
                .from(parent.context)
                .inflate(viewType, parent, false), viewType
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BaseViewHolder<Item>, position: Int) {
        holder.bind(items[position], itemClickListener)
    }
}