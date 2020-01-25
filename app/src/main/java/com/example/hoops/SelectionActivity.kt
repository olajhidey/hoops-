package com.example.hoops

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_selection.*

class SelectionActivity : AppCompatActivity() {


    companion object {
        val GAMETYPE = "TYPE_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        val adapter = GroupAdapter<GroupieViewHolder>()

        adapter.add(
            SelectionItem(
                Selection(
                    "One-on-one",
                    "Involves 2 ballers playing against each other and counting scores",
                    0
                )
            )
        )
        adapter.add(
            SelectionItem(
                Selection(
                    "Set",
                    "This involves a group of ballers ranging from 3 to 5 playing against each other by timing or reaching a particular score",
                    1
                )
            )
        )

        adapter.add(
            SelectionItem(
                Selection(
                    "Full court",
                    "Playing the full court with the proper amount of players which is 5",
                    2
                )
            )
        )

        selection_recycler_view.adapter = adapter

        adapter.setOnItemClickListener { item, view ->

            val selectedItem = item as SelectionItem

            val intent = Intent(view.context, GameSettingActivity::class.java)
            intent.putExtra(GAMETYPE, selectedItem.item.type)
            startActivity(intent)

        }


    }
}
