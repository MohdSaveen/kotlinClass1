package com.example.kotlinclass1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class PostViewHolder(private  val view : View) : RecyclerView.ViewHolder(view) {

    fun setData(responseDTOItem: ResponseDTO) {
        view.tvName.text=responseDTOItem.name
        view.tvEmail.text=responseDTOItem.email
        view.tvBody.text=responseDTOItem.body
    }
}