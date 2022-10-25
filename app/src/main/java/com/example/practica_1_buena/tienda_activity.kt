package com.example.practica_1_buena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.ButtonBarLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica_1_buena.databinding.TiendaActivityBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class tienda_activity : AppCompatActivity() {

    private lateinit var binding: TiendaActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tienda_activity)

        binding = TiendaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage()
        loadImage2()
        loadImage3()
        loadImage4()

        val intent1 = Intent(this, ScrollingActivity::class.java)

        var boton : FloatingActionButton = findViewById(R.id.boton_app_bar1)

        boton.setOnClickListener {

            startActivity(intent1)

        }

    }
    private fun loadImage(url: String ="http://www.brandemia.org/wp-content/uploads/2011/09/" +
            "logo_nike_principal.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content1.imgCard1)
    }
    private fun loadImage2(url: String ="https://upload.wikimedia.org/wikipedia/commons/thumb" +
            "/2/20/Adidas_Logo.svg/800px-Adidas_Logo.svg.png")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content1.imgCard2)
    }
    private fun loadImage3(url: String ="https://upload.wikimedia.org/wikipedia/commons/" +
            "thumb/c/cc/Logotipo_horizontal_de_Casa_del_Libro.png/" +
            "800px-Logotipo_horizontal_de_Casa_del_Libro.png")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content1.imgCard3)
    }
    private fun loadImage4(url: String ="https://pgsrehabilitaciones.com/wp-content/" +
            "uploads/logo-mercadona-300x300.png")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content1.imgCard4)
    }
}