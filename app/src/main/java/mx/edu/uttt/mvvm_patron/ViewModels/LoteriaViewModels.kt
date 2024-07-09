package mx.edu.uttt.mvvm_patron.ViewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoteriaViewModels: ViewModel() {
    private val _lattoNumbers = mutableStateOf(emptyList<Int>())
    val lattoNumbers: State<List<Int>> = _lattoNumbers

    fun generateLattoNumbers(){
        //generamos numeros random
        _lattoNumbers.value = (1 .. 60).shuffled().take(6).sorted()
    }
}