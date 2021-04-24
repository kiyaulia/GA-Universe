package com.bergerak.uts_f1d018094

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

class GreysAnatomyAdapter : RecyclerView.Adapter<GreysAnatomyAdapter.GreysAnatomyViewHolder>() {

    private val list = ArrayList<GreysAnatomy>()
    private lateinit var onItemClickListener: OnItemClickListener

//    private lateinit var onItemClickListener: onItemClickListener
//    private val listChar = ArrayList<GreysAnatomy>()

    fun setData(itemData: ArrayList<GreysAnatomy>){
        list.clear()
        list.addAll(itemData)
        notifyDataSetChanged()
    }

    inner class GreysAnatomyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val txtName: TextView = itemView.findViewById(R.id.tv_name)
        private val txtDesc: TextView = itemView.findViewById(R.id.tv_detail)
        private val imgPhoto: CircleImageView = itemView.findViewById(R.id.img_photo)

        fun bind(greysAnatomy: GreysAnatomy) {
            with(itemView) {
                Glide.with(context).load(greysAnatomy.photo).into(imgPhoto)
                txtName.text = greysAnatomy.name
                txtDesc.text = greysAnatomy.desc
            }
            itemView.setOnClickListener {
                    onItemClickListener.onItemClicked(list[adapterPosition])
                }
        }
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

//    inner class GreysAnatomyViewHolder(private val binding: ItemCharBinding) : RecyclerView.ViewHolder(binding.root) {
////        private val txtName: TextView = itemView.findViewById(R.id.tv_name)
////        private val txtDesc: TextView = itemView.findViewById(R.id.tv_detail)
////        private val imgPhoto: CircleImageView = itemView.findViewById(R.id.img_photo)
//
//        fun bind(greysAnatomy: GreysAnatomy){
//            with(binding){
//                Glide.with(itemView.context)
//                        .load(greysAnatomy.photo)
//                        .apply(RequestOptions.overrideOf(55,55))
//                        .into(imgPhoto)
//                tvName.text = greysAnatomy.name
//                tvDetail.text = greysAnatomy.desc
//
//                itemView.setOnClickListener {
//                    onItemClickListener.onItemClicked(list[bindingAdapterPosition])
//                }
////                itemView.setOnClickListener {
////                    val intent = Intent(itemView.context, DetailCharActivity::class.java)
////                    intent.putExtra(DetailCharActivity.KEY_CHAR, greysAnatomy)
////                }
//            }
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GreysAnatomyAdapter.GreysAnatomyViewHolder {
//        val binding = ItemCharBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
//        return GreysAnatomyViewHolder(binding)

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_char, parent, false)
        return GreysAnatomyViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: GreysAnatomyViewHolder, position: Int) {
        holder.bind(list[position])

        //holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list[holder.adapterPosition]) }
    }

    interface OnItemClickListener {
        fun onItemClicked(greysAnatomy: GreysAnatomy) {
        }
    }
}