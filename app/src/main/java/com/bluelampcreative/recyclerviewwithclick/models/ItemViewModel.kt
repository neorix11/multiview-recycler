package com.bluelampcreative.recyclerviewwithclick.models

import com.bluelampcreative.recyclerviewwithclick.viewholders.ViewHolderTypeFactory

interface ItemViewModel {
    fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int
}