package com.bluelampcreative.recyclerviewwithclick

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bluelampcreative.recyclerviewwithclick.adapters.ClickableRecyclerViewAdapter
import com.bluelampcreative.recyclerviewwithclick.models.ClickableItems
import com.bluelampcreative.recyclerviewwithclick.models.Item
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val onItemClickListener: (Item) -> Unit = { item ->
        Toast.makeText(this, "Item clicked: ${item.name} : ${item.type}", Toast.LENGTH_SHORT).show()
    }

    private val clickableAdapter = ClickableRecyclerViewAdapter(onItemClickListener)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickableAdapter.setList(ClickableItems.getClickables())
        recycler_container.layoutManager = LinearLayoutManager(this)
        recycler_container.adapter = clickableAdapter
    }
}
