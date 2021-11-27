package com.example.boatapp.ui.escale

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.boatapp.R
import com.example.escales.Escale
import com.example.escales.EscaleAdapter
import kotlinx.android.synthetic.main.fragment_escale.*


class EscaleFragment : Fragment(), CellClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_escale, container, false)
    }


    val items = arrayOf(
        Escale(R.drawable.nice,"France","Nice","23/09/2021","24/09/2021"),
        Escale(R.drawable.corse1,"France","Corse","29/09/2021","04/10/2021"),
        Escale(R.drawable.genes,"Italie","Gênes","05/10/2021","07/10/2021"),
        Escale(R.drawable.olbia,"Italie","Olbia","10/10/2021","11/10/2021"),
        Escale(R.drawable.palma,"Espagne","Palma","15/10/2021","17/10/2021"),
        Escale(R.drawable.barcelone,"Espagne","Barcelone","19/10/2021","21/10/2021"),
        Escale(R.drawable.marseille,"France","Marseille","23/10/2021","24/10/2021")
    )

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        EscaleRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = EscaleAdapter(items, this@EscaleFragment);
        }
    }

    override fun onResume() {
        EscaleRecyclerView.adapter?.notifyDataSetChanged()
        super.onResume()
    }

    override fun onCellClickListener(ville: String) {
        Toast.makeText(activity, "Escale : $ville", Toast.LENGTH_SHORT).show()
    }

}