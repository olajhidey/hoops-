package com.example.hoops

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.item_selection.view.*

class SelectionItem(val item:Selection): Item<GroupieViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.item_selection
    }

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.selection_headline_text.text = item.headline
        viewHolder.itemView.selection_description_text.text = item.caption
    }
}