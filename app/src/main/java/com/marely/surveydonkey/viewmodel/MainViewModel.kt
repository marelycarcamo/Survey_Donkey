package com.marely.surveydonkey.viewmodel

import androidx.lifecycle.ViewModel
import com.marely.surveydonkey.ui.fragment.*

class MainViewModel : ViewModel() {

    private var  firstAnswer: ArrayList<String> = arrayListOf()
    private var secondAnswer: ArrayList<String> = arrayListOf()
    private var  thirdAnswer: ArrayList<String> = arrayListOf()
    private var usuario_email: String? = null
    private var usuario_sugerencia: String? = null
    private val separator = ", "

    /**
     * Guarda la primera pregunta y retorna un listado de String,
     * ordenado y sin repetir opciones
     */
    fun addFirstAnswer(value: String): List<String> {
        firstAnswer.add(value)
        return firstAnswer.distinct().sorted().toList()
    }

    /**
     * Guarda la SEGUNDA pregunta y retorna un listado de String,
     * ordenado y sin repetir opciones
     */
    fun addSecondAnswer(value: String): List<String> {
        secondAnswer.add(value)
        return secondAnswer.distinct().sorted().toList()
    }

    /**
     * Guarda la TERCERA pregunta y retorna un listado de String,
     * ordenado y sin repetir opciones
     */
    fun addThirdAnswer(value: String): List<String> {
        thirdAnswer.add(value)
        return thirdAnswer.distinct().sorted().toList()
    }




     /**
     * Si el usuario deseleccion una opcion, entonces la eliminamos de la lista "firstAnswer"
     */
    fun removeFirstAnswer(value: String): List<String> {
        if (firstAnswer.contains(value)) {
            firstAnswer.remove(value)
        }
        return firstAnswer.sorted().toList()
    }

    /**
     * Si el usuario deseleccion una opcion, entonces la eliminamos de la lista "secondAnswer"
     */
    fun removeSecondAnswer(value: String): List<String> {
        if (secondAnswer.contains(value)) {
            secondAnswer.remove(value)
        }
        return secondAnswer.sorted().toList()
    }

    /**
     * Si el usuario deseleccion una opcion, entonces la eliminamos de la lista "firstAnswer"
     */
    fun removeThirdAnswer(value: String): List<String> {
        if (thirdAnswer.contains(value)) {
            thirdAnswer.remove(value)
        }
        return thirdAnswer.sorted().toList()
    }

    /**
     * Muestra el resultado de la PRIMERA pregunta, separado por ","
     */
    fun getFirstResult(): String =
        when (firstAnswer.size) {
            1 -> "$COLOR ${firstAnswer.joinToString(separator)}"
            else -> "$COLORES ${firstAnswer.joinToString(separator)}"
        }


    /**
     * Muestra el resultado de la SEGUNDA pregunta, separado por ","
     */
    fun getSecondResult(): String =
        when (secondAnswer.size) {
            1 -> "$MATERIAL ${secondAnswer.joinToString(separator)}"
            else -> "$MATERIALES ${secondAnswer.joinToString(separator)}"
        }

    /**
     * Muestra el resultado de la TERCERA pregunta, separado por ","
     */
    fun getThirdResult(): String =
        when (thirdAnswer.size) {
            1 -> "$COLOR_CORREA ${thirdAnswer.joinToString(separator)}"
            else -> "$COLORES_CORREA ${thirdAnswer.joinToString(separator)}"
        }


    /**
     * Guardar el email
     */
    fun guardaEmail(email:String){
        usuario_email = email
    }


    /**
     * Acceder email
     */

    fun getEmail():String = "Email: ${usuario_email}"

    /**
     * Guardar sugerencias
     */
    fun guardaSugerencias(sugerencia:String){
        usuario_sugerencia = sugerencia
    }


    /**
     * Acceder sugerencias
     */
    fun getSugerencias():String = "Sugerencias: ${usuario_sugerencia}"

}

