package com.bluelampcreative.recyclerviewwithclick.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<Model>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(model: Model, clickListener: (Model) -> Unit)
}