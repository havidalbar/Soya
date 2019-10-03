package com.example.soya.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.soya.Activities.PilihJenisTanah
import com.example.soya.R

class ListPilihJenisTanahAdapter(val items : ArrayList<PilihJenisTanah>) : RecyclerView.Adapter<ViewHolderPilihJenisTanah>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPilihJenisTanah {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderPilihJenisTanah(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderPilihJenisTanah, position: Int) {
        val pilihJenisTanah: PilihJenisTanah = items[position]
        holder.bind(pilihJenisTanah)
    }
}

class ViewHolderPilihJenisTanah (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_jenis_tanah_list_item, parent, false)){
    private var ivGambarJenisTanah : ImageView? = null
    private var tvNamaJenisTanah: TextView? = null
    private var parentViewGroup: ViewGroup = parent

    init {
        ivGambarJenisTanah = itemView.findViewById(R.id.iv_gambar_jenis_tanah)
        tvNamaJenisTanah = itemView.findViewById(R.id.tv_nama_jenis_tanah)
    }

    fun bind(pilihJenisTanah: PilihJenisTanah){
        val drawableId: Int = parentViewGroup.context.getResources().getIdentifier(pilihJenisTanah.gambarJenisTanah, "drawable", parentViewGroup.context.getPackageName())
        ivGambarJenisTanah?.setImageDrawable(parentViewGroup.context.resources.getDrawable(drawableId))
        tvNamaJenisTanah?.text = pilihJenisTanah.namaJenisTanah
    }
}