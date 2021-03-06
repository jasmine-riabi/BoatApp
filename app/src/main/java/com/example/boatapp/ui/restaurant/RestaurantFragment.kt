package com.example.boatapp.ui.restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.boatapp.R
import com.example.boatapp.databinding.FragmentRestaurantBinding
import com.example.boatapp.ui.restaurant.RestaurantViewModel

class RestaurantFragment : Fragment() {

    private lateinit var restaurantViewModel: RestaurantViewModel
    private var _binding: FragmentRestaurantBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        restaurantViewModel =
            ViewModelProvider(this).get(RestaurantViewModel::class.java)

        _binding = FragmentRestaurantBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRestaurant
        restaurantViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}