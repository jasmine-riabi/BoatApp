package com.example.boatapp.ui.escale

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.boatapp.R
import com.example.boatapp.databinding.FragmentActualiteBinding
import com.example.boatapp.databinding.FragmentEscaleBinding
import com.example.boatapp.ui.actualite.ActualiteViewModel

class EscaleFragment : Fragment() {

    private lateinit var escaleViewModel: EscaleViewModel
    private var _binding: FragmentActualiteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        escaleViewModel =
            ViewModelProvider(this).get(EscaleViewModel::class.java)

        _binding = FragmentActualiteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textActualite
        escaleViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}