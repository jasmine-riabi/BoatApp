package com.example.escales

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.boatapp.databinding.ItemAndVersionBinding


class AndVersionAdapter(val items: Array<AndVersion>) : RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: ItemAndVersionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                binding.image.setImageResource(image)
                binding.pays.text = "$ville"
                binding.ville.text = "$pays"
                binding.datea.text = "$dateA"
                binding.dated.text = "$dateD"
            }
        }


    }

    /* override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndVersionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndVersionAdapter.ViewHolder {
        return ViewHolder(ItemAndVersionBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

}