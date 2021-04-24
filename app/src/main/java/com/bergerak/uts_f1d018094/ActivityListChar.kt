package com.bergerak.uts_f1d018094

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bergerak.uts_f1d018094.DetailActivity.Companion.EXTRA_CHAR
import com.bergerak.uts_f1d018094.databinding.ActivityListCharBinding
import java.util.ArrayList


class ActivityListChar : AppCompatActivity() {

    private lateinit var binding: ActivityListCharBinding
    private val list = ArrayList<GreysAnatomy>()
    private val adapterChar = GreysAnatomyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fromResourceToList()

        binding = ActivityListCharBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvChar.setHasFixedSize(true)
        binding.rvChar.layoutManager = LinearLayoutManager(this)
        binding.rvChar.adapter = adapterChar

        sendDataToDetail()
    }

    private fun fromResourceToList() {
        val resName = resources.getStringArray(R.array.data_name)
        val resDesc = resources.getStringArray(R.array.data_desc)
        val resImage = resources.obtainTypedArray(R.array.data_photo)

        for (i in resName.indices) {
            var itemChar = GreysAnatomy (
                resImage.getResourceId(i, -1),
                resName[i],
                resDesc[i]
            )
            list.add(itemChar)
        }
        adapterChar.setData(list)
    }

    private fun sendDataToDetail() {
        adapterChar.setOnItemClickListener(object : GreysAnatomyAdapter.OnItemClickListener{
            override fun onItemClicked(greysAnatomy: GreysAnatomy) {
                val charParcel = GreysAnatomy(
                    greysAnatomy.photo,
                    greysAnatomy.name,
                    greysAnatomy.desc
                )
                val intent = Intent(this@ActivityListChar, DetailActivity::class.java)
                intent.putExtra(EXTRA_CHAR, charParcel)
                startActivity(intent)
            }
        })
    }
}