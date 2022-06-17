package com.ortega.nav06

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel: ViewModel() {
    var name = MutableLiveData("")
    var lastname = MutableLiveData("")
}