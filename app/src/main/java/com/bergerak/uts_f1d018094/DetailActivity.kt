package com.bergerak.uts_f1d018094

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_CHAR = "extra_char"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent : GreysAnatomy? = intent.getParcelableExtra<GreysAnatomy>(EXTRA_CHAR)

        val imgPhoto: ImageView = findViewById(R.id.detail_image)
        val dtlName: TextView = findViewById(R.id.detail_name)
        val dtlDesc: TextView = findViewById(R.id.detail_txt)
        Glide.with(this).load(intent?.photo).into(imgPhoto)
        dtlName.text = intent?.name
        dtlDesc.text = intent?.desc
    }
}