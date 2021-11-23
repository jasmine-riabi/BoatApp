package com.example.escales

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.boatapp.databinding.ItemAndVersionBinding
import com.example.boatapp.ui.escale.CellClickListener


class EscaleAdapter(val items: Array<Escale>, var listener : CellClickListener) : RecyclerView.Adapter<EscaleAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: ItemAndVersionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindAndVersion(escale: Escale) {
            with(escale) {
                binding.image.setImageResource(image)
                binding.pays.text =  "$pays"
                binding.ville.text = "$ville"
                binding.datea.text = "$dateA"
                binding.dated.text = "$dateD"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EscaleAdapter.ViewHolder {
        return ViewHolder(ItemAndVersionBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
        holder.itemView.setOnClickListener {
            val data = items[position]
            listener.onCellClickListener(data.ville)
        }
    }

    override fun getItemCount(): Int = items.size

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

}