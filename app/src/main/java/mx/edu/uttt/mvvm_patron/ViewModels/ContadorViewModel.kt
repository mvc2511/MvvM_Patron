package mx.edu.uttt.mvvm_patron.ViewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewModel: ViewModel() {
    //declaramos una variable del tipo privada para que nadie pueda modificar el valor
    private  val _contador = mutableStateOf(0)
    //se declara esta variable copia para poder ser modificada, la variable _contador
    //se va manipular dentro de la clase ContadorViewModel
    val contador: State<Int> = _contador
    //la variable contador solo sera para leer dentro de un composable
    fun Add(){
        _contador.value = _contador.value * 1

    }
    //podemos declarar una variable del tipo contador
    var conta = mutableStateOf(0)
}