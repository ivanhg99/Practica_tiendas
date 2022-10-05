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
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica_1_buena.databinding.ActivityScrollingBinding
import java.net.URL

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding
    val ibai = "https://es.wikipedia.org/wiki/Ibai_Llanos"
    val jagger = "https://youtube.fandom.com/es/wiki/M%C3%ADster_J%C3%A4gger"
    val zokas = "https://youtube.fandom.com/es/wiki/Elxokas"
    val juja = "https://www.flooxernow.com/fan/jujalag-twitch_2021072360fabfddcd264e00010ee585.html"
    val openURL = Intent(Intent.ACTION_VIEW)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.content.web1.setOnClickListener {
           openURL.data = Uri.parse(ibai)
            startActivity(openURL)
        }
        binding.content.web2.setOnClickListener {
            openURL.data = Uri.parse(jagger)
            startActivity(openURL)
        }
        binding.content.web3.setOnClickListener {
            openURL.data = Uri.parse(zokas)
            startActivity(openURL)
        }
        binding.content.web4.setOnClickListener {
            openURL.data = Uri.parse(juja)
            startActivity(openURL)
        }
        loadImage()
        loadImage2()
        loadImage3()
        loadImage4()
        }

    private fun loadImage(url: String ="https://estaticos-cdn.prensaiberica.es/clip/bdc10b17-" +
            "f8dc-4846-84c3-6a1ec7206eb8_16-9-discover-aspect-ratio_default_0.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard)
    }
    private fun loadImage2(url: String ="https://www.lecturas.com/medio/2022/10/04/mister-jagger-" +
            "nueva-pareja-de-laura-escanes_62b26d9a_448x252.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }
    private fun loadImage3(url: String ="https://as01.epimg.net/meristation/imagenes/2022/09/12/" +
            "noticias/1662991030_760176_1662991273_noticia_normal_recorte1.jpg")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard3)
    }
    private fun loadImage4(url: String ="https://fotografias.flooxernow.com/clipping/cmsimages02/" +
            "2021/07/23/56771712-632F-49A2-964C-746AC00BF078/97.jpg?crop=1600,900,x0,y0&width=16" +
            "00&height=900&optimize=high&format=webply")
    {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard4)
    }

    }
