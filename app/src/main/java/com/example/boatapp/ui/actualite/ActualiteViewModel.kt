package com.example.boatapp.ui.actualite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActualiteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Actualités Fragment"
    }
    val text: LiveData<String> = _text
}