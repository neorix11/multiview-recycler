package com.bluelampcreative.recyclerviewwithclick.models

object ClickableItems {
    fun getClickables() = listOf(
        Item("Item 1", Item.PRIMARY),
        Item("Item 2", Item.SECONDARY),
        Item("Item 3", Item.TERTIARY),
        Item("Item 4", Item.SECONDARY),
        Item("Item 5", Item.SECONDARY),
        Item("Item 6", Item.PRIMARY),
        Item("Item 7", Item.PRIMARY),
        Item("Item 8", Item.TERTIARY)
    )
}