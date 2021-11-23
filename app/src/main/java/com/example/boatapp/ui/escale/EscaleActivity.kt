package com.example.boatapp.ui.escale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.boatapp.R
import com.example.escales.Escale
import com.example.escales.EscaleAdapter
import kotlinx.android.synthetic.main.activity_escale.*


class EscaleActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escale)
        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = EscaleAdapter(items, this)
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

    override fun onResume() {
        andVersionRecyclerView.adapter?.notifyDataSetChanged()
        super.onResume()
    }

    override fun onCellClickListener(ville: String) {
        Toast.makeText(this, "Escale : $ville", Toast.LENGTH_SHORT).show()
    }

}