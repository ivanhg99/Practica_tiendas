package com.example.practica_1_buena

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica_1_buena.Clases.CentroComercial
import com.example.practica_1_buena.Clases.Tienda
import com.example.practica_1_buena.databinding.ActivityScrollingBinding
import java.net.URL

class ScrollingActivity : AppCompatActivity() {

    val listac1 = mutableListOf<Tienda>()
    val listac2 = mutableListOf<Tienda>()
    val listac3 = mutableListOf<Tienda>()
    val listac4 = mutableListOf<Tienda>()

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage()
        loadImage2()
        loadImage3()
        loadImage4()

        val intent = Intent(this, tienda_activity::class.java)

        binding.content.card1.setOnClickListener {
            startActivity(intent)
        }

        binding.content.card2.setOnClickListener {
            startActivity(intent)
        }

        binding.content.card3.setOnClickListener {
            startActivity(intent)
        }

        binding.content.card4.setOnClickListener {
            startActivity(intent)
        }

        nombres_cosas()
        }

    private fun loadImage(url: String ="https://photo620x400.mnstatic.com/a24b9d0658a13ecea5a" +
            "9fbb67c2387cd/centro-comercial-nuevo-centro.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgCard)
    }
    private fun loadImage2(url: String ="https://agendadeisa.com/wp-content/uploads/2021/10/9Dx" +
            "Ni4hOSmmB4ERO8KpfA_thumb_abb8-1.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }
    private fun loadImage3(url: String ="https://static3.lasprovincias.es/www/multimedia/202112" +
            "/03/media/cortadas/166278284--624x379.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard3)
    }
    private fun loadImage4(url: String ="https://www.lovevalencia.com/wp-content/uploads/2" +
            "013/03/ARENA-750x400.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard4)
    }

    fun nombres_cosas() {
        val c1 = CentroComercial("Nuevo Centro", "Avenida Pio XII, 2","4",listac1)

        binding.content.textocen1.text = c1.nombre
        binding.content.textocalle1.text = c1.direccion
        binding.content.textonum.text = c1.numeroti

        val c2 = CentroComercial("Aqua", "Calle Menorca 19","5",listac2)

        binding.content.textocen2.text = c2.nombre
        binding.content.textocalle2.text = c2.direccion
        binding.content.textonum1.text = c2.numeroti

        val c3 = CentroComercial("El Saler", "Avda del Profesor López Piñero, nº 16","4",listac3)

        binding.content.textocen3.text = c3.nombre
        binding.content.textocalle3.text = c3.direccion
        binding.content.textonum2.text = c3.numeroti

        val c4 = CentroComercial("Arena", "C/ de Santa Genoveva Torres, 21","5",listac4)

        binding.content.textocen4.text = c4.nombre
        binding.content.textocalle4.text = c4.direccion
        binding.content.textonum3.text = c4.numeroti
    }

    }
