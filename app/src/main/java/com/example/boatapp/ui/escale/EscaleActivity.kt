package com.example.boatapp.ui.escale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.boatapp.R
import com.example.escales.AndVersion
import com.example.escales.AndVersionAdapter
import kotlinx.android.synthetic.main.activity_escale.*

class EscaleActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escale)
        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = AndVersionAdapter(items)


    }

    val items = arrayOf(
        AndVersion(R.drawable.nice,"France","Nice","23/09/2021","24/09/2021"),
        AndVersion(R.drawable.corse1,"France","Corse","29/09/2021","04/10/2021"),
        AndVersion(R.drawable.genes,"Italie","Gênes","05/10/2021","07/10/2021"),
        AndVersion(R.drawable.olbia,"Italie","Olbia","10/10/2021","11/10/2021"),
        AndVersion(R.drawable.palma,"Espagne","Palma","15/10/2021","17/10/2021"),
        AndVersion(R.drawable.barcelone,"Espagne","Barcelone","19/10/2021","21/10/2021"),
        AndVersion(R.drawable.marseille,"France","Marseille","23/10/2021","24/10/2021")
    )

    override fun onResume() {
        andVersionRecyclerView.adapter?.notifyDataSetChanged()
        super.onResume()
    }



    override fun onCellClickListener(position: Int) {
        Toast.makeText(this, "Escale", Toast.LENGTH_SHORT).show()
    }

}