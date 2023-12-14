package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val biding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Plaza de Bolívar","plazabolivar","La plaza de Bolivar es la plaza principal de la ciudad de Bogotá y de Colombia.Está ubicada en el centro histórico de la ciudad"),
                Sitio("Museo del Oro", "museo_oro","El Museo del Oro del Banco de la República de Colombia es una institución pública la cual su fin es la adquisión, conservación y exposición de piezas de orfebreria y alfarería de culturas indígenas."),
                Sitio("Jardin Botánico","jardinb","El Jardín Botánico de Bogotá,nombrado oficialmente Jardín Botánico José Celestino Mutis en honor al astrónomo y botánico José Celestino Mutis, es un centro de investigación conservación y divulgación de la diversidad de las especies vegetales en Bogotá"),
                Sitio("Museo Nacional","museo_nal"," El Museo Nacional de Colombia, comúnmente abreviado como Museo Nacional o MNC, es el primer museo fundado en la República de Colombia "),
            ),
            object : SitioClickedListener {
                override  fun onSitioClickList(sitio: Sitio){
                    Toast.makeText(this@MenuActivity,sitio.nombre, Toast.LENGTH_LONG).show()
                }

            }
        )
    }
}
